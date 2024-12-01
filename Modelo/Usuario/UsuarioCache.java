/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Usuario;

import Modelo.Cache.Cache;

/**
 *
 * @author d2tod
 */
public class UsuarioCache extends Cache<String,UsuarioDTO> {
    private static UsuarioCache instance;

    public static synchronized UsuarioCache getInstance() {
        if (instance == null) {
            instance = new UsuarioCache();
        }
        return instance;
    }

    private UsuarioCache() {
        super();
    }
}
