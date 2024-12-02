/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Trabajador;

import Modelo.DAO.Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author d2tod
 */
public class TrabajadorDAO extends Dao<TrabajadorDTO> {

    public TrabajadorDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean create(TrabajadorDTO dto) throws SQLException {
        if (dto == null || !validatePK(dto.getCedula())) {
            return false;
        }

        String query = "Call TrabajadorCreate(?,?,?,?,?,?,?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, dto.getCedula());
            stmt.setString(2, dto.getNombre());
            stmt.setString(3, dto.getTelefono());
            stmt.setString(4, dto.getCorreo());
            stmt.setString(5, dto.getPuesto());
            stmt.setString(6, dto.getHorario());
            stmt.setDouble(7, dto.getSalario());
            return stmt.executeUpdate() > 0;
        }
    }

    @Override
    public TrabajadorDTO read(Object id) throws SQLException {
        if (id == null || String.valueOf(id).trim().isEmpty()) {
            return null;
        }
        String query = "Call TrabajadorRead(?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, String.valueOf(id));
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new TrabajadorDTO(
                            rs.getString(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6),
                            rs.getDouble(7));
                }
            }
        }
        return null;
    }

    @Override
    public List<TrabajadorDTO> readAll() throws SQLException {
        String query = "Call TrabajadorReadAll()";
        List<TrabajadorDTO> list = new ArrayList<>();
        try (PreparedStatement stmt = connection.prepareStatement(query)) {

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    list.add(new TrabajadorDTO(
                            rs.getString(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6),
                            rs.getDouble(7)));
                }
            }
        }
        return list;
    }

    @Override
    public boolean update(TrabajadorDTO dto) throws SQLException {
        if (dto == null) {
            return false;
        }

        String query = "Call TrabajadorUpdate(?,?,?,?,?,?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, dto.getCedula());
            stmt.setString(2, dto.getTelefono());
            stmt.setString(3, dto.getCorreo());
            stmt.setString(4, dto.getPuesto());
            stmt.setString(5, dto.getHorario());
            stmt.setDouble(6, dto.getSalario());
            return stmt.executeUpdate() > 0;
        }
    }

    @Override
    public boolean delete(Object id) throws SQLException {
        if (id == null || String.valueOf(id).trim().isEmpty()) {
            return false;
        }
        String query = "Call TrabajadorDelete(?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, String.valueOf(id));
            return stmt.executeUpdate() > 0;
        }
    }

    public boolean validatePK(Object id) throws SQLException {
        return read(id) == null;
    }

    public List<String> getPuestos() throws SQLException {
        List<String> puestos = new ArrayList<>();
        String query = "SELECT DISTINCT Puesto FROM tbtrabajador"; 

        try (PreparedStatement stmt = connection.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                puestos.add(rs.getString("Puesto"));
            }
        }
        return puestos;
    }
    
    public List<String> getHorarios() throws SQLException {
        List<String> horarios = new ArrayList<>();
        String query = "SELECT DISTINCT Horario FROM tbtrabajador"; 

        try (PreparedStatement stmt = connection.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                horarios.add(rs.getString("Horario"));
            }
        }
        return horarios;
    }
    
}
