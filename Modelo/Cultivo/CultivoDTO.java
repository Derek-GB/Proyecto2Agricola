/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Cultivo;

import Enums.EstadoCrecimiento;
import Enums.TipoCultivo;
import java.sql.Date;


/**
 *
 * @author DYLAN
 */
public class CultivoDTO {
    private final int id;
    private final String nombre;
    private final String tipo;
    private final String areasembrada;
    private final String estado;
    private final Date fechaSiembra;
    private final Date fechaCosecha;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getAreasembrada() {
        return areasembrada;
    }

    public String getEstado() {
        return estado;
    }

    public Date getFechaSiembra() {
        return fechaSiembra;
    }

    public Date getFechaCosecha() {
        return fechaCosecha;
    }

    public CultivoDTO(int id, String nombre, String tipo, String areasembrada, String estado, Date fechaSiembra, Date fechaCosecha) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.areasembrada = areasembrada;
        this.estado = estado;
        this.fechaSiembra = fechaSiembra;
        this.fechaCosecha = fechaCosecha;
    }

}
