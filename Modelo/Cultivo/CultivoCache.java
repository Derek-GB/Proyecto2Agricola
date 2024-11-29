/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Cultivo;

import Modelo.Cache.Cache;

/**
 *
 * @author d2tod
 */
public class CultivoCache extends Cache<Integer,CultivoDTO> {
    private static CultivoCache instance;

    public static synchronized Cache getInstance() {
        if (instance == null) {
            instance = new CultivoCache();
        }
        return instance;
    }

    private CultivoCache() {
        super();
    }
}
