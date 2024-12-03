/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cultivo.Cultivo;
import Modelo.Cultivo.CultivoDAO;
import Modelo.Cultivo.CultivoDTO;
import Modelo.Cultivo.CultivoMapper;
import Modelo.Database.Database;
import Modelo.Produccion.ProduccionDAO;
import Modelo.Produccion.ProduccionMapper;
import Vista.Vista;
import java.sql.SQLException;
import Modelo.Produccion.ProduccionDTO;
import Modelo.Produccion.Produccion;
import Modelo.Produccion.ProduccionCache;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 *
 * @author Tony
 */
public class ProduccionControlador implements Controlador< Integer, Produccion> {

    private ProduccionDAO dao;
    private final Vista view;
    private final ProduccionMapper mapper;
    private ProduccionCache cache;

    public ProduccionControlador(Vista view) {
        this.view = view;
        this.cache = ProduccionCache.getInstance();
        mapper = new ProduccionMapper();
        try {
            dao = new ProduccionDAO(Database.getConnection());
        } catch (SQLException ex) {
            view.showError("Error al conectar con la Base de Datos");
        }
    }

    @Override
    public void create(Produccion entidad) {
        if (entidad == null || !validarAtributos(entidad)) {
            view.showError("Faltan datos requeridos");
            return;
        }
        try {
            if (!validarPk(entidad.getId())) {
                view.showError("El ID de producción ya está registrado");
                return;
            }
            ProduccionDTO dto = mapper.toDTO(entidad);
            dao.create(dto);
            cache.add(dto.getId(), dto);
            view.showMessage("Producción registrada correctamente");
        } catch (SQLException ex) {
            view.showError("Error al guardar los datos: " + ex.getMessage());
        }
    }

    @Override
    public void read(Integer id) {
        try {
            ProduccionDTO dto = cache.get(id);
            if (dto == null) {
                dto = dao.read(id);
            }
            if (dto != null) {
                Produccion produccion = mapper.toEnt(dto);
                view.show(produccion);
            } else {
                view.showError("Producción no encontrada");
            }
        } catch (SQLException ex) {
            view.showError("Error al cargar los datos: " + ex.getMessage());
        }
    }

    @Override
    public void readAll() {
        try {
            List<ProduccionDTO> dtoList = dao.readAll();
            List<Produccion> produccionList = dtoList.stream()
                    .map(mapper::toEnt)
                    .filter(Objects::nonNull)
                    .collect(Collectors.toList());
            view.showAll(produccionList);
        } catch (SQLException ex) {
            view.showError("Error al cargar los datos: " + ex.getMessage());
        }
    }

    @Override
    public void update(Produccion entidad) {
        if (entidad == null || !validarAtributos(entidad)) {
            view.showError("Faltan datos requeridos");
            return;
        }
        try {
            if (validarPk(entidad.getId())) {
                view.showError("El ID de producción no está registrado");
                return;
            }
            ProduccionDTO dto = mapper.toDTO(entidad);
            dao.update(dto);
            cache.change(dto.getId(),dto);
            view.showMessage("Producción actualizada correctamente");
        } catch (SQLException ex) {
            view.showError("Error al actualizar los datos: " + ex.getMessage());
        }
    }

    @Override
    public void delete(Produccion entidad) {
        try {
            if (validarPk(entidad.getId())) {
                view.showError("El ID de producción no está registrado");
                return;
            }
            dao.delete(entidad.getId());
            cache.remove(entidad.getId());
            view.showMessage("Producción eliminada correctamente");
        } catch (SQLException ex) {
            view.showError("Error al eliminar los datos: " + ex.getMessage());
        }
    }

    @Override
    public boolean validarAtributos(Produccion entidad) {
        return entidad.getCultivo() != null
                && entidad.getCantidadRecolectada() > 0
                && entidad.getCalidad() != null
                && !entidad.getCalidad().trim().isEmpty()
                && entidad.getDestino() != null
                && !entidad.getDestino().trim().isEmpty();
    }

    @Override
    public synchronized boolean validarPk(Integer id) {
        if (cache.get(id) != null) {
            return false;
        }
        try {
            return dao.validatePK(id);
        } catch (SQLException ex) {
            return false;
        }

    }
    
public Cultivo obtenerCultivoPorId(Integer id) {
    try {
        CultivoDAO cultivoDAO = new CultivoDAO(Database.getConnection()); 
        CultivoDTO cultivoDTO = cultivoDAO.read(id); 
        
        if (cultivoDTO != null) {
           
            CultivoMapper cultivoMapper = new CultivoMapper();
            Cultivo cultivo = cultivoMapper.toEnt(cultivoDTO);
            return cultivo;
        } else {
            view.showError("Cultivo no encontrado"); 
        }
    } catch (SQLException ex) {
        view.showError("Error al buscar el cultivo: " + ex.getMessage()); 
    }
    return null;
}



 public List<CultivoDTO> readCultivos () throws SQLException{
    return new CultivoDAO(Database.getConnection()).readAll();
    }



}
