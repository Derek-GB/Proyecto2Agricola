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
public class UsuarioDTO {

    private final Integer id;
    private final String nombre;
    private final String contraseña;
    private final String rol;

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getRol() {
        return rol;
    }

    public UsuarioDTO(String nombre, String contraseña, String rol) {
        this.id = null;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    public UsuarioDTO(int id, String nombre, String contraseña, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.rol = rol;
    }

}
