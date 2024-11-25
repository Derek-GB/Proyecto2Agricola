/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Cultivo;

import Enums.EstadoCrecimiento;
import Enums.TipoCultivo;
import java.util.Date;


/**
 *
 * @author DYLAN
 */
public class CultivoDTO {
    private String id;
    private String nombre;
    private String tipo;
    private String areasembrada;
    private String estado;
    private Date fechaSiembra;
    private Date fechaCosecha;

    public String getId() {
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

    public CultivoDTO(String id, String nombre, String tipo, String areasembrada, String estado, Date fechaSiembra, Date fechaCosecha) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.areasembrada = areasembrada;
        this.estado = estado;
        this.fechaSiembra = fechaSiembra;
        this.fechaCosecha = fechaCosecha;
    }

}
