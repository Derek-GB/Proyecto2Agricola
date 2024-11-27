/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Almacenamiento;

import java.time.LocalDate;

/**
 *
 * @author DYLAN
 */
public class Almacenamiento {
    private String idProducto;
    private String nombreProducto;
    private int cantidad;
    private LocalDate fechaIngreso;
    private LocalDate fechaEgreso;
    private String alerta;

    public String getIdProducto() {
        return idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public LocalDate getFechaEgreso() {
        return fechaEgreso;
    }

    public String getAlerta() {
        return alerta;
    }
    
    
}
