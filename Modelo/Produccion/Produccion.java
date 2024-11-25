/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Produccion;

import java.time.LocalDate;

/**
 *
 * @author Tony
 */
public class Produccion {
    private int id;
    private LocalDate fecha;
    private double cantidadRecolectada;                   
    private String calidad;
    private double procentajeProductividad;
    private String destino;

    public int getId() {
        return id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public double getCantidadRecolectada() {
        return cantidadRecolectada;
    }

    public String getCalidad() {
        return calidad;
    }

    public double getProcentajeProductividad() {
        return procentajeProductividad;
    }

    public String getDestino() {
        return destino;
    }

    public void setCantidadRecolectada(double cantidadRecolectada) {
        this.cantidadRecolectada = cantidadRecolectada;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public void setProcentajeProductividad(double procentajeProductividad) {
        this.procentajeProductividad = procentajeProductividad;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Produccion(int id, LocalDate fecha, double cantidadRecolectada, String calidad, double procentajeProductividad, String destino) {
        this.id = id;
        this.fecha = fecha;
        this.cantidadRecolectada = cantidadRecolectada;
        this.calidad = calidad;
        this.procentajeProductividad = procentajeProductividad;
        this.destino = destino;
    }

    public Produccion(double cantidadRecolectada, String calidad, double procentajeProductividad, String destino) {
        this.fecha = LocalDate.now();
        this.cantidadRecolectada = cantidadRecolectada;
        this.calidad = calidad;
        this.procentajeProductividad = procentajeProductividad;
        this.destino = destino;
    }
    
    
   public double calcularProductividad(double cantidadEsperada) {
    if (cantidadEsperada <= 0) {
        throw new IllegalArgumentException("La cantidad esperada debe ser mayor a 0");
    }
    return (this.cantidadRecolectada / cantidadEsperada) * 100;
} 
    
    
    
    
}
