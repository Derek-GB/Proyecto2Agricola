/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cultivo.Cultivo;
import Modelo.Cultivo.CultivoCache;
import java.sql.SQLException;
import Modelo.Cultivo.CultivoDAO;
import Modelo.Cultivo.CultivoDTO;
import Modelo.Cultivo.CultivoMapper;
import Modelo.Database.Database;
import Vista.Vista;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 *
 * @author DYLAN
 */
public class CultivoControlador implements Controlador< Integer, Cultivo> {

    private CultivoDAO dao;
    private final Vista vista;
    private final CultivoMapper mapper;
    private CultivoCache cache;

    public CultivoControlador(Vista vista) {
        this.vista = vista;
        this.cache = (CultivoCache) CultivoCache.getInstance();
        mapper = new CultivoMapper();
        try {
            dao = new CultivoDAO(Database.getConnection());
        } catch (SQLException e) {
            vista.showError("Error al conectar con la Base de Datos");
        }
    }

    @Override
    public void create(Cultivo entidad) {
        if (entidad == null || !validarAtributos(entidad)) {
            vista.showError("Faltan datos requeridos");
            return;
        }
        try {
            if (!validarPk(entidad.getId())) {
                vista.showError("El ID ingresado ya se encuentra registrada");
                return;
            }
            CultivoDTO dto = mapper.toDTO(entidad);
            dao.create(dto);
            cache.add(entidad.getId(), dto);
            vista.showMessage("Datos guardados correctamente");
        } catch (SQLException ex) {
            vista.showError("Ocurrio un error al guardar los datos: " + ex.getMessage());
        }
    }

    @Override
    public void readAll() {
        try {
            List<CultivoDTO> dtoList = dao.readAll();
            List<Cultivo> cultivoList = dtoList.stream()
                    .map(mapper::toEnt)
                    .filter(Objects::nonNull)
                    .collect(Collectors.toList());
            vista.showAll(cultivoList);
        } catch (SQLException ex) {
            vista.showError("Error al cargar los datos: " + ex.getMessage());
        }
    }

    @Override
    public void update(Cultivo entidad) {
        if (entidad == null || !validarAtributos(entidad)) {
            vista.showError("Faltan datos requeridos");
            return;
        }
        try {
            if (validarPk(entidad.getId())) {
                vista.showError("El ID de cultivo no está registrado");
                return;
            }
            CultivoDTO dto = mapper.toDTO(entidad);
            dao.update(dto);
            cache.change(dto.getId(), dto);
            vista.showMessage("Cultivo actualizado correctamente");
        } catch (SQLException ex) {
            vista.showError("Error al actualizar los datos: " + ex.getMessage());
        }
    }

    @Override
    public void delete(Cultivo entidad) {
        try {
            if (validarPk(entidad.getId())) {
                vista.showError("El ID de cultivo no está registrado");
                return;
            }
            dao.delete(entidad.getId());
            cache.remove(entidad.getId());
            vista.showMessage("Cultivo eliminado correctamente");
        } catch (SQLException ex) {
            vista.showError("Error al eliminar los datos: " + ex.getMessage());
        }
    }

    @Override
    public boolean validarAtributos(Cultivo entidad) {
        return entidad.getId() > 0
                && entidad.getNombre() != null
                && !entidad.getNombre().trim().isEmpty()
                && entidad.getTipo() != null
                && entidad.getAreasembrada() > 0
                && entidad.getEstado() != null;
//                && entidad.getFechaSiembra()
//                =  && entidad.getFechaCosecha() =;
    }

    @Override
    public void read(Integer id) {
        try {
            CultivoDTO dto = cache.get(id);
            if (dto == null) {
                dto = dao.read(id);
            }
            if (dto != null) {
                Cultivo produccion = mapper.toEnt(dto);
                vista.show(produccion);
            } else {
                vista.showError("Cultivo no encontrada");
            }
        } catch (SQLException ex) {
            vista.showError("Error al cargar los datos: " + ex.getMessage());
        }
    }

    @Override
    public boolean validarPk(Integer id) {
//        if (!cache.contains(id)) {
//            return true;
//        }
        try {
            return dao.validatePK(id);
        } catch (SQLException ex) {
            return false;
        }
    }

    public List<String> obtenerNombresCultivosUnicos() {
        try {
            return dao.getNombresUnicos(); 
        } catch (SQLException e) {
            vista.showError("Error al cargar los nombres de los cultivos: " + e.getMessage());
            return new ArrayList<>();
        }
    }

}
