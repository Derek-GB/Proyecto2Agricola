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
public interface DaoCompleto<Dto> extends DaoEliminador<Dto> {
    public abstract boolean update(Dto dto) throws SQLException;
}
