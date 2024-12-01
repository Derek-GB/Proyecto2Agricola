/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Database.Database;
import java.sql.SQLException;
import Modelo.Trabajador.Trabajador;
import Modelo.Trabajador.TrabajadorCache;
import Modelo.Trabajador.TrabajadorDAO;
import Modelo.Trabajador.TrabajadorDTO;
import Modelo.Trabajador.TrabajadorMapper;
import Vista.Vista;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 *
 * @author d2tod
 */
public class TrabajadorControlador implements Controlador<String, Trabajador> {

    private TrabajadorDAO dao;
    private final Vista vista;
    private final TrabajadorMapper mapper;
    private TrabajadorCache cache;

    public TrabajadorControlador(Vista vista) {
        this.vista = vista;
        this.cache = TrabajadorCache.getInstance();
        mapper = new TrabajadorMapper();
        try {
            dao = new TrabajadorDAO(Database.getConnection());
        } catch (SQLException e) {
            vista.showError("Error al conectar con la Base de Datos");
        }
    }

    @Override
    public void create(Trabajador entidad) {
        if (entidad == null || !validarAtributos(entidad)) {
            vista.showError("Faltan datos requeridos");
            return;
        }
        try {
            if (!validarPk(entidad.getCedula())) {
                vista.showError("La cedula ingresada ya se encuentra registrada");
                return;
            }
            TrabajadorDTO dto = mapper.toDTO(entidad);
            dao.create(dto);
            cache.add(entidad.getCedula(), dto);
            vista.showMessage("Datos guardados correctamente");
        } catch (SQLException ex) {
            vista.showError("Ocurrio un error al guardar los datos: " + ex.getMessage());
        }
    }

    @Override
    public void read(String id) {
        try {
            TrabajadorDTO dto = cache.get(id);
            if (dto == null) {
                dto = dao.read(id);
            }
            if (dto != null) {
                Trabajador trabajador = mapper.toEnt(dto);
                vista.show(trabajador);
            } else {
                vista.showError("Trabajador no encontrado");
            }
        } catch (SQLException ex) {
            vista.showError("Error al cargar los datos: " + ex.getMessage());
        }
    }

    @Override
    public void readAll() {
        try {
            List<TrabajadorDTO> listaDto = dao.readAll();
            List<Trabajador> listaTrabajador = listaDto.stream()
                    .map(mapper::toEnt)
                    .filter(Objects::nonNull)
                    .collect(Collectors.toList());
            vista.showAll(listaTrabajador);
        } catch (SQLException ex) {
            vista.showError("Error al cargar los datos: " + ex.getMessage());
        }
    }

    @Override
    public void update(Trabajador entidad) {
        if (entidad == null || !validarAtributos(entidad)) {
            vista.showError("Faltan datos requeridos");
            return;
        }
        try {
            if (validarPk(entidad.getCedula())) {
                vista.showError("El ID de Trabajador no está registrado");
                return;
            }
            TrabajadorDTO dto = mapper.toDTO(entidad);
            dao.update(dto);
            cache.change(dto.getCedula(), dto);
            vista.showMessage("Trabajador actualizado correctamente");
        } catch (SQLException ex) {
            vista.showError("Error al actualizar los datos: " + ex.getMessage());
        }
    }

    @Override
    public void delete(Trabajador entidad) {
        try {
            if (validarPk(entidad.getCedula())) {
                vista.showError("La cedula de trabajador " + entidad.getCedula() + " no está registrada");
                return;
            }
            dao.delete(entidad.getCedula());
            cache.remove(entidad.getCedula());
            vista.showMessage("Producción eliminada correctamente");
        } catch (SQLException ex) {
            vista.showError("Error al eliminar los datos: " + ex.getMessage());
        }
    }

    @Override
    public synchronized boolean validarAtributos(Trabajador entidad) {
        return entidad.getCedula() != null
                && !entidad.getCedula().trim().isEmpty()
                && entidad.getSalario() > 0
                && entidad.getCorreo() != null
                && !entidad.getCorreo().trim().isEmpty()
                && entidad.getHorario() != null
                && !entidad.getHorario().trim().isEmpty()
                && entidad.getNombre() != null
                && !entidad.getNombre().trim().isEmpty()
                && entidad.getPuesto() != null
                && !entidad.getPuesto().trim().isEmpty()
                && entidad.getTelefono() != null
                && !entidad.getTelefono().trim().isEmpty();
    }

    @Override
    public synchronized boolean validarPk(String id) {
        if (!cache.contains(id)) {
            return true;
        }
        try {
            return dao.validatePK(id);
        } catch (SQLException ex) {
            return false;
        }
    }

}
