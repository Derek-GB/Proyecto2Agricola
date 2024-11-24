/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.DAO;

import java.sql.SQLException;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author d2tod
 * @param <Dto>
 */
public abstract class Dao<Dto> {
    protected Connection connection;
    
    public Dao(Connection connection){
        this.connection = connection;
    }
    
    public abstract boolean create(Dto dto) throws SQLException;
    public abstract Dto read(Object id) throws SQLException;
    public abstract List<Dto> readAll() throws SQLException;
    public abstract boolean update(Dto dto) throws SQLException;
    public abstract boolean delete(Object id) throws SQLException;
    
}
