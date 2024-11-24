/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelo.DAO;

import java.sql.SQLException;

/**
 *
 * @author d2tod
 * @param <Dto>
 */
public interface DaoEliminador<Dto> extends DaoCreador<Dto> {
    public abstract boolean delete(Object id) throws SQLException;
}
