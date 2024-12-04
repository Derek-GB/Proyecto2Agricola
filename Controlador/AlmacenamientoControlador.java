/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Almacenamiento.Almacenamiento;
import Modelo.Almacenamiento.AlmacenamientoCache;
import Modelo.Almacenamiento.AlmacenamientoDAO;
import Modelo.Almacenamiento.AlmacenamientoDTO;
import Modelo.Almacenamiento.AlmacenamientoMapper;
import java.sql.SQLException;
import Modelo.Database.Database;
import Modelo.Produccion.Produccion;
import Modelo.Produccion.ProduccionDAO;
import Modelo.Produccion.ProduccionDTO;
import Modelo.Produccion.ProduccionMapper;
import Vista.Vista;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 *
 * @author DYLAN
 */
public class AlmacenamientoControlador implements Controlador< Integer, Almacenamiento> {

    private AlmacenamientoDAO dao;
    private final Vista vista;
    private final AlmacenamientoMapper mapper;
    private AlmacenamientoCache cache;

    public AlmacenamientoControlador(Vista vista) {
        this.vista = vista;
        this.cache = (AlmacenamientoCache) AlmacenamientoCache.getInstance();
        mapper = new AlmacenamientoMapper();
        try {
            dao = new AlmacenamientoDAO(Database.getConnection());
        } catch (SQLException e) {
            vista.showError("Error al conectar con la Base de Datos");
        }
    }

    @Override
    public void create(Almacenamiento entidad) {
        if (entidad == null || !validarAtributos(entidad)) {
            vista.showError("Faltan datos requeridos");
            return;
        }
        try {
            if (!validarPk(entidad.getId())) {
                vista.showError("El ID ingresado ya se encuentra registrada");
                return;
            }
            AlmacenamientoDTO dto = mapper.toDTO(entidad);
            dao.create(dto);
            cache.add(entidad.getId(), dto);
            vista.showMessage("Datos guardados correctamente");
        } catch (SQLException ex) {
            vista.showError("Ocurrio un error al guardar los datos: " + ex.getMessage());
        }
    }

    @Override
    public void read(Integer id) {
        try {
            AlmacenamientoDTO dto = cache.get(id);
            if (dto == null) {
                dto = dao.read(id);
            }
            if (dto != null) {
                Almacenamiento produccion = mapper.toEnt(dto);
                vista.show(produccion);
            } else {
                vista.showError("Almacenamiento no encontrada");
            }
        } catch (SQLException ex) {
            vista.showError("Error al cargar los datos: " + ex.getMessage());
        }
    }

    @Override
    public void readAll() {
        try {
            List<AlmacenamientoDTO> dtoList = dao.readAll();
            List<Almacenamiento> cultivoList = dtoList.stream()
                    .map(mapper::toEnt)
                    .filter(Objects::nonNull)
                    .collect(Collectors.toList());
            vista.showAll(cultivoList);
        } catch (SQLException ex) {
            vista.showError("Error al cargar los datos: " + ex.getMessage());
        }
    }

    @Override
    public void update(Almacenamiento entidad) {
        if (entidad == null || !validarAtributos(entidad)) {
            vista.showError("Faltan datos requeridos");
            return;
        }
        try {
            if (validarPk(entidad.getId())) {
                vista.showError("El ID de cultivo no está registrado");
                return;
            }
            AlmacenamientoDTO dto = mapper.toDTO(entidad);
            dao.update(dto);
            cache.change(dto.getId(), dto);
            vista.showMessage("Almacenamiento actualizado correctamente");
        } catch (SQLException ex) {
            vista.showError("Error al actualizar los datos: " + ex.getMessage());
        }
    }

    @Override
    public void delete(Almacenamiento entidad) {
        try {
            if (validarPk(entidad.getId())) {
                vista.showError("El ID de Almacenamiento no está registrado");
                return;
            }
            dao.delete(entidad.getId());
            cache.remove(entidad.getId());
            vista.showMessage("Almacenamiento eliminado correctamente");
        } catch (SQLException ex) {
            vista.showError("Error al eliminar los datos: " + ex.getMessage());
        }
    }

    @Override
    public boolean validarAtributos(Almacenamiento entidad) {
        return entidad.getId() > 0
                && entidad.getProduccion() != null
                && entidad.getCantidad() > 0;
    }

    @Override
    public boolean validarPk(Integer id) {
        if (cache.get(id)!=null) {
            return false;
        }
        try {
            return dao.validatePK(id);
        } catch (SQLException ex) {
            return false;
        }
    }

    public Produccion obtenerProduccionPorId(Integer id) {
        try {
            ProduccionDAO produccionDAO = new ProduccionDAO(Database.getConnection());
            ProduccionDTO produccionDTO = produccionDAO.read(id);

            if (produccionDTO != null) {

                ProduccionMapper produccionMapper = new ProduccionMapper();
                Produccion produccion = produccionMapper.toEnt(produccionDTO);
                return produccion;
            } else {
                vista.showError("Produccion no encontrado");
            }
        } catch (SQLException ex) {
            vista.showError("Error al buscar la produccion: " + ex.getMessage());
        }
        return null;
    }

    public List<ProduccionDTO> readProducciones() throws SQLException {
        return new ProduccionDAO(Database.getConnection()).readAll();
    }

}
