/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Cultivo;

import Modelo.DAO.Dao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DYLAN
 */
public class CultivoDAO extends Dao<CultivoDTO> {

    public CultivoDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean create(CultivoDTO dto) throws SQLException {
        if (dto == null || !validatePK(dto.getId())) {
            return false;
        }
        String query = "Call CultivoCreate(?,?,?,?,?,?,?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, dto.getId());
            stmt.setString(2, dto.getNombre());
            stmt.setString(3, dto.getTipo());
            stmt.setInt(4, dto.getAreasembrada());
            stmt.setString(5, dto.getEstado());
            stmt.setDate(6, (Date) dto.getFechaSiembra());
            stmt.setDate(7, (Date) dto.getFechaCosecha());
            return stmt.executeUpdate() > 0;
        }
    }

    @Override
    public CultivoDTO read(Object id) throws SQLException {
        if (id == null || String.valueOf(id).trim().isEmpty()) {
            return null;
        }
        String query = "Call CultivoRead(?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1,(Integer)id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new CultivoDTO(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getInt(4),
                            rs.getString(5),
                            rs.getDate(6),
                            rs.getDate(7));
                }
            }
        }
        return null;
    }

    @Override
    public List<CultivoDTO> readAll() throws SQLException {
        String query = "Call CultivoReadAll()";
        List<CultivoDTO> list = new ArrayList<>();
        try (PreparedStatement stmt = connection.prepareStatement(query)) {

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    list.add(new CultivoDTO(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getInt(4),
                            rs.getString(5),
                            rs.getDate(6),
                            rs.getDate(7)));
                }
            }
        }
        return list;
    }

    @Override
    public boolean update(CultivoDTO dto) throws SQLException {
        if (dto == null) {
            return false;
        }
        String query = "Call CultivoUpdate(?,?,?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, dto.getId());
            stmt.setString(2, dto.getEstado());
            stmt.setDate(3, dto.getFechaCosecha());
            return stmt.executeUpdate() > 0;

        }
    }

    @Override
    public boolean delete(Object id) throws SQLException {
        if (id == null || String.valueOf(id).trim().isEmpty()) {
            return false;
        }
        String query = "Call CultivoDelete(?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, String.valueOf(id));
            return stmt.executeUpdate() > 0;

        }
    }
    
    public boolean validatePK(Object id) throws SQLException {
        return read(id) == null;
    }
    
}
