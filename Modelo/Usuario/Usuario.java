/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Usuario;

import Enums.Rol;

/**
 *
 * @author Fernando
 */
public class Usuario {
    
    private String nombre;
    private String contraseña;
    private Rol rol;

    public String getNombre() {
        return nombre;
    }
    
    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Usuario(String nombre, String contraseña, Rol rol) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    public Usuario() {
        this( "", "12345678", Rol.TRABAJADOR);
    }

    @Override
    public String toString() {
        return "Usuario{" + ", nombre=" + nombre + "rol=" + rol + '}';
    }
    
    

}
