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

    private int id;
    private String nombre;
    private String contraseña;
    private Rol rol;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Usuario(int id, String nombre, String contraseña, Rol rol) {
        this.id = id;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    public Usuario(String nombre, String contraseña, Rol rol) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    public Usuario() {
        this(-1, "", "12345678", Rol.TRABAJADOR);
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + "rol=" + rol + '}';
    }
    
    

}
