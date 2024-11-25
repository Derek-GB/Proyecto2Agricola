/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Produccion;

import java.time.LocalDate;
import java.sql.Date;
/**
 *
 * @author Tony
 */
public class ProduccionDTO {
     private final int id;
    private final Date fecha;
    private final double cantidadRecolectada;                   
    private final String calidad;
    private final String destino;

    public int getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }

    public double getCantidadRecolectada() {
        return cantidadRecolectada;
    }

    public String getCalidad() {
        return calidad;
    }

    public String getDestino() {
        return destino;
    }

    public ProduccionDTO(int id, Date fecha, double cantidadRecolectada, String calidad, String destino) {
        this.id = id;
        this.fecha = fecha;
        this.cantidadRecolectada = cantidadRecolectada;
        this.calidad = calidad;
        this.destino = destino;
    }
    
    
    
}
