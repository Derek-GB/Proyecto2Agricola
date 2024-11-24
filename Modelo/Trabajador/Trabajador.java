/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Trabajador;

/**
 *
 * @author d2tod
 */
public class Trabajador {

    private String cedula;
    private String nombre;
    private String telefono;
    private String correo;
    private String puesto;
    private String horario;
    private double salario;

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (invalidarCadena(nombre)) {
            throw new IllegalArgumentException(ARGUMENTOINVALIDO);
        }
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (invalidarCadena(telefono)) {
            throw new IllegalArgumentException(ARGUMENTOINVALIDO);
        }
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        if (invalidarCadena(correo)) {
            throw new IllegalArgumentException(ARGUMENTOINVALIDO);
        }
        this.correo = correo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        if (invalidarCadena(puesto)) {
            throw new IllegalArgumentException(ARGUMENTOINVALIDO);
        }
        this.puesto = puesto;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        if (invalidarCadena(horario)) {
            throw new IllegalArgumentException(ARGUMENTOINVALIDO);
        }
        this.horario = horario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 358600) {
            throw new IllegalArgumentException(ARGUMENTOINVALIDO);
        }
        this.salario = salario;
    }

    private static boolean invalidarCadena(String cadena) {
        return cadena == null || cadena.isEmpty();
    }

    private static final String ARGUMENTOINVALIDO = "Argumento nulo o vacio";
}
