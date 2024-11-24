/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelo.DAO;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author d2tod
 * @param <Dto>
 */
public interface DaoLectura<Dto> {

    public abstract Dto read(Object id) throws SQLException;

    public abstract List<Dto> readAll() throws SQLException;

}
