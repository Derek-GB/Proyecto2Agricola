/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Almacenamiento;

import Modelo.Cache.Cache;

/**
 *
 * @author d2tod
 */
public class AlmacenamientoCache extends Cache<Integer, AlmacenamientoDTO> {

    private static AlmacenamientoCache instance;

    public static synchronized Cache getInstance() {
        if (instance == null) {
            instance = new AlmacenamientoCache();
        }
        return instance;
    }

    private AlmacenamientoCache() {
        super();
    }
}
