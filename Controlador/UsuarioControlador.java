/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Database.Database;
import Modelo.Usuario.Usuario;
import Modelo.Usuario.UsuarioCache;
import Modelo.Usuario.UsuarioDAO;
import Modelo.Usuario.UsuarioDTO;
import Modelo.Usuario.UsuarioMapper;
import Vista.Vista;
import java.sql.SQLException;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 *
 * @author Fernando
 */
public class UsuarioControlador implements Controlador< Integer, Usuario> {

    private final UsuarioMapper mapper;
    private UsuarioDAO dao;
    private final Vista view;
    private UsuarioCache cache;

    public UsuarioControlador(Vista view) {
        this.view = view;
        this.cache = UsuarioCache.getInstance();
        mapper = new UsuarioMapper();
        try {
            dao = new UsuarioDAO(Database.getConnection());
        } catch (SQLException ex) {
            view.showError("Error al conectar con la Base de Datos");
        }
    }

    @Override
    public void create(Usuario entidad) {
        if (entidad == null || !validarAtributos(entidad)) {
            view.showError("Faltan datos requeridos");
            return;
        }
        try {
            if (!validarPk(entidad.getId())) {
                view.showError("El id ingresado ya se encuentra registrada");
                return;
            }
            UsuarioDTO dto = mapper.toDTO(entidad);
            dao.create(dto);
            cache.add(dto.getId, dto);
            view.showMessage("Usuario registrado correctamente");
        } catch (SQLException ex) {
            view.showError("Error al guardar los datos: " + ex.getMessage());
        }

    }

    @Override
    public void readAll() {
        try {
            List<UsuarioDTO> dtoList = dao.readAll();
            List<Usuario> usuarioList = dtoList.stream()
                    .map(mapper::toEnt)
                    .filter(Objects::nonNull)
                    .collect(Collectors.toList());
            view.showAll(usuarioList);
        } catch (SQLException ex) {
            view.showError("Error al cargar los datos: " + ex.getMessage());
        }
    }

    @Override
    public void update(Usuario entidad) {
        if (entidad == null || !validarAtributos(entidad)) {
            view.showError("Faltan datos requeridos");
            return;
        }
        try {
            if (validarPk(entidad.getId())) {
                view.showError("El ID de Trabajador no está registrado");
                return;
            }
            UsuarioDTO dto = mapper.toDTO(entidad);
            dao.update(dto);
            cache.change(dto.getId(), dto);
            view.showMessage("Trabajador actualizado correctamente");
        } catch (SQLException ex) {
            view.showError("Error al actualizar los datos: " + ex.getMessage());
        }
    }

    @Override
    public void delete(Usuario entidad) {
        if (entidad == null || !validarPk(entidad.getId)) {
            view.showError("El id de usuario no es válido");
            return;
        }
        try {
            boolean eliminado = dao.delete(entidad.getNombre());
            if (eliminado) {
                cache.remove(entidad.getId());
                view.showMessage("Usuario eliminado correctamente");
            } else {
                view.showError("El usuario no está registrado");
            }
        } catch (SQLException ex) {
            view.showError("Error al eliminar los datos: " + ex.getMessage());
        }
    }

    @Override
    public boolean validarAtributos(Usuario entidad) {
        if (entidad == null) {
            return false;
        }
        if (entidad.getNombre() == null || entidad.getNombre().trim().isEmpty()) {
            return false;
        }

        return entidad.getRol() != null;
    }

    @Override
    public void read(Integer id) {
        if (validarPk(id)) {
            view.showError("El nombre proporcionado no es válido");
            return;
        }
        try {
            UsuarioDTO dto = cache.get(id);
            if (dto == null) {
                dto = dao.read(id);
            }
            if (dto != null) {
                Usuario trabajador = mapper.toEnt(dto);
                view.show(trabajador);
            } else {
                view.showError("Usuario no encontrado");
            }
        } catch (SQLException ex) {
            view.showError("Error al cargar los datos: " + ex.getMessage());
        }
    }

    @Override
    public boolean validarPk(Integer id) {
        if (!cache.contains(id)) {
            return true;
        }
        try {
            return dao.validatePK(id);
        } catch (SQLException ex) {
            return false;
        }
    }

    public Usuario buscarUsuarioPorNombre(String nombre) throws SQLException {
        UsuarioDTO dto = dao.read(nombre);
        return dto != null ? mapper.toEnt(dto) : null;
    }

    public void mostrarError(String mensaje) {
        view.showError(mensaje);
    }

    public void mostrarMensaje(String mensaje) {
        view.showMessage(mensaje);
    }

}
