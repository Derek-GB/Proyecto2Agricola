/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Produccion;

import Modelo.Cache.Cache;

/**
 *
 * @author d2tod
 */
public class ProduccionCache extends Cache<Integer,ProduccionDTO> {
    private static ProduccionCache instance;

    public static synchronized ProduccionCache getInstance() {
        if (instance == null) {
            instance = new ProduccionCache();
        }
        return instance;
    }

    private ProduccionCache() {
        super();
    }
}
