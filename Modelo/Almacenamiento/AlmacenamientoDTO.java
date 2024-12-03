/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Almacenamiento;

import Modelo.Produccion.Produccion;
import java.time.LocalDate;
import java.sql.Date;
/**
 *
 * @author DYLAN
 */
public class AlmacenamientoDTO {
    private final int id;
    private final int produccion;
    private final int cantidad;
    private final Date fechaIngreso;
    private final Date fechaEgreso;

    public int getId() {
        return id;
    }

    public int getProduccion() {
        return produccion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public Date getFechaEgreso() {
        return fechaEgreso;
    }
    
    public AlmacenamientoDTO(int id, int produccion, int cantidad, Date fechaIngreso, Date fechaEgreso) {
        this.id = id;
        this.produccion = produccion;
        this.cantidad = cantidad;
        this.fechaIngreso = fechaIngreso;
        this.fechaEgreso = fechaEgreso;
    }
    
     public AlmacenamientoDTO(int id, int produccion, int cantidad, Date fechaIngreso) {
        this.id = id;
        this.produccion = produccion;
        this.cantidad = cantidad;
        this.fechaIngreso = fechaIngreso;
        this.fechaEgreso = null;
    }

    
    
}
