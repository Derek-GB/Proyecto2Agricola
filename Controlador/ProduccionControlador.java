/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Database.Database;
import Modelo.Produccion.ProduccionDAO;
import Modelo.Produccion.ProduccionMapper;
import Vista.Vista;
import java.sql.SQLException;
import Modelo.Produccion.ProduccionDTO;
import Modelo.Produccion.Produccion;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 *
 * @author Tony
 */
public class ProduccionControlador implements Controlador< Integer ,Produccion>{
    private ProduccionDAO dao;
    private final Vista view;
     private final ProduccionMapper mapper;

    public ProduccionControlador(Vista view) {
        this.view = view;
        mapper = new ProduccionMapper();
         try {
            dao=new ProduccionDAO(Database.getConnection());
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
            dao.create(mapper.toDTO(entidad));
            view.showMessage("Producción registrada correctamente");
        } catch (SQLException ex) {
            view.showError("Error al guardar los datos: " + ex.getMessage());
        }  }

    @Override
    public void read(Integer id) {
           try {
            ProduccionDTO dto = dao.read(id);
            Produccion produccion = mapper.toEnt(dto);
            if (produccion != null) {
                view.show(produccion);
            } else {
                view.showError("Producción no encontrada");
            }
        } catch (SQLException ex) {
            view.showError("Error al cargar los datos: " + ex.getMessage());
        }    }

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
        }    }

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
            dao.update(mapper.toDTO(entidad));
            view.showMessage("Producción actualizada correctamente");
        } catch (SQLException ex) {
            view.showError("Error al actualizar los datos: " + ex.getMessage());
        }    }

    @Override
    public void delete(Produccion entidad) {
         try {
            if (validarPk(entidad.getId())) {
                view.showError("El ID de producción no está registrado");
                return;
            }
            dao.delete(entidad.getId());
            view.showMessage("Producción eliminada correctamente");
        } catch (SQLException ex) {
            view.showError("Error al eliminar los datos: " + ex.getMessage());
        }    }

    @Override
    public boolean validarAtributos(Produccion entidad) {
      return entidad.getCultivo() != null &&
               entidad.getCantidadRecolectada() > 0 &&
               entidad.getCalidad() != null &&
               !entidad.getCalidad().trim().isEmpty() &&
               entidad.getDestino() != null &&
               !entidad.getDestino().trim().isEmpty();   }

    @Override
    public boolean validarPk(Integer id) {
              try {
            return dao.validatePK(id);
        } catch (SQLException ex) {
            return false;
        }    
    
    }
    
     
     
     

    
}
