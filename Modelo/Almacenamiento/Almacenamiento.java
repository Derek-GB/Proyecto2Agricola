/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Almacenamiento;

import Modelo.Produccion.Produccion;
import java.time.LocalDate;

/**
 *
 * @author DYLAN
 */
public class Almacenamiento {
    private int id;
    private Produccion produccion;
    private int cantidad;
    private LocalDate fechaIngreso;
    private LocalDate fechaEgreso;

    public int getId() {
        return id;
    }

    public Produccion getProduccion() {
        return produccion;
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

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setFechaEgreso(LocalDate fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }
    
    public boolean verificarAlarma(int diasMaximosPermitidos) {
     if (fechaIngreso != null) {
        LocalDate fechaActual = LocalDate.now();

        // Obtener los valores de año, mes y día
        int anioIngreso = fechaIngreso.getYear();
        int mesIngreso = fechaIngreso.getMonthValue();
        int diaIngreso = fechaIngreso.getDayOfMonth();

        int anioActual = fechaActual.getYear();
        int mesActual = fechaActual.getMonthValue();
        int diaActual = fechaActual.getDayOfMonth();

        // Calcular la diferencia en días manualmente
        int diasTranscurridos = (anioActual - anioIngreso) * 365 
                              + (mesActual - mesIngreso) * 30 // Aproximación a 30 días por mes
                              + (diaActual - diaIngreso);

        // Verificar si los días transcurridos exceden el límite permitido
        return diasTranscurridos > diasMaximosPermitidos;
    }
    return false;
}

    public Almacenamiento(int id, Produccion produccion, int cantidad, LocalDate fechaIngreso, LocalDate fechaEgreso) {
        this.id = id;
        this.produccion = produccion;
        this.cantidad = cantidad;
        this.fechaIngreso = fechaIngreso;
        this.fechaEgreso = fechaEgreso;
    }

    public Almacenamiento() {
        
    }

    
    
    
}
