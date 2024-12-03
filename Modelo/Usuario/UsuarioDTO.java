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

    private final String nombre;
    private final String contraseña;
    private final String rol;
    private final String trabajador;


    public String getNombre() {
        return nombre;
    }

    public String getTrabajador() {
        return trabajador;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getRol() {
        return rol;
    }

    public UsuarioDTO(String nombre, String contraseña, String rol,String trabajador) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.rol = rol;
        this.trabajador = trabajador;
    }


}
