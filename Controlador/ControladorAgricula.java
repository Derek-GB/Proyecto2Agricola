/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.DAO.Dao;
import Modelo.Mapper.Mapper;
import Vista.Vista;

/**
 *
 * @author d2tod
 * @param <Id>
 * @param <Ent>
 */
public abstract class ControladorAgricula<Id,Ent> implements Controlador<Id,Ent> {
    protected final Vista vista;
    protected final Mapper mapper;
    protected Dao dao;

    public ControladorAgricula(Vista vista, Mapper mapper, Dao dao) {
        this.vista = vista;
        this.mapper = mapper;
        this.dao = dao;
    }

}
