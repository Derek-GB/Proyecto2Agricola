/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Cultivo;

import Enums.EstadoCrecimiento;
import Enums.TipoCultivo;
import java.time.LocalDate;

/**
 *
 * @author DYLAN
 */
public class Cultivo {

    private int id;
    private String nombre;
    private TipoCultivo tipo;
    private int areasembrada;
    private EstadoCrecimiento estado;
    private LocalDate fechaSiembra;
    private LocalDate fechaCosecha;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoCultivo getTipo() {
        return tipo;
    }

    public int getAreasembrada() {
        return areasembrada;
    }

    public EstadoCrecimiento getEstado() {
        return estado;
    }

    public LocalDate getFechaSiembra() {
        return fechaSiembra;
    }

    public LocalDate getFechaCosecha() {
        return fechaCosecha;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
        }
        this.nombre = nombre;
    }

    public void setAreasembrada(double areasembrada) {
       
    }

    public void setFechaSiembra(LocalDate fechaSiembra) {
        if (validarFechaSiembra(fechaSiembra)) {
            this.fechaSiembra = fechaSiembra;
        } else {
            throw new IllegalArgumentException("La fecha de siembra no puede ser futura.");
        }
    }

    public void setEstado(EstadoCrecimiento estado) {
        this.estado = estado;
    }

    public void setFechaCosecha(LocalDate fechaCosecha) {
        if (validarFechaCosecha(this.fechaSiembra, fechaCosecha)) {
            this.fechaCosecha = fechaCosecha;
        } else {
            throw new IllegalArgumentException("La fecha de cosecha no puede ser anterior a la fecha de siembra.");
        }

    }

    public boolean validarFechaSiembra(LocalDate fechaSiembra) {
        LocalDate fechaActual = LocalDate.now();
        return !fechaSiembra.isAfter(fechaActual);
    }

    public boolean validarFechaCosecha(LocalDate fechaSiembra, LocalDate fechaCosecha) {
        return !fechaCosecha.isBefore(fechaSiembra);
    }

    public boolean esFechaValida(LocalDate fecha, LocalDate fechaInicio, LocalDate fechaFin) {
        return (fecha.isEqual(fechaInicio) || fecha.isAfter(fechaInicio))
                && (fecha.isEqual(fechaFin) || fecha.isBefore(fechaFin));

    }

    public boolean esFechaPasada(LocalDate fecha) {
        LocalDate fechaActual = LocalDate.now();
        return fecha.isBefore(fechaActual);
    }

    public Cultivo(int id, String nombre, TipoCultivo tipo, int areasembrada, EstadoCrecimiento estado, LocalDate fechaSiembra, LocalDate fechaCosecha) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.areasembrada = areasembrada;
        this.estado = estado;
        this.fechaSiembra = fechaSiembra;
        this.fechaCosecha = fechaCosecha;
    }

    public Cultivo() {
        this(0,"",TipoCultivo.RAICES,0,EstadoCrecimiento.LISTO_PARA_COSECHA,LocalDate.now(),LocalDate.now());
    }

    @Override
    public String toString() {
        return "Cultivo{" + "id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", areasembrada=" + areasembrada + ", estado=" + estado + ", fechaSiembra=" + fechaSiembra + ", fechaCosecha=" + fechaCosecha + '}';
    }
    
    

}
