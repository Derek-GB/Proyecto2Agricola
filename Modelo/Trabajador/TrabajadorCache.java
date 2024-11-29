/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Trabajador;

import Modelo.Cache.Cache;

/**
 *
 * @author d2tod
 */
public class TrabajadorCache extends Cache<String, TrabajadorDTO> {

    private static TrabajadorCache instance;

    public static synchronized Cache getInstance() {
        if (instance == null) {
            instance = new TrabajadorCache();
        }
        return instance;
    }

    private TrabajadorCache() {
        super();
    }
}
