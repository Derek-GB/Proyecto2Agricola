/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Almacenamiento;

import Modelo.DAO.Dao;
import Modelo.Database.Database;
import Modelo.Produccion.ProduccionDAO;
import Modelo.Produccion.ProduccionDTO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DYLAN
 */
public class AlmacenamientoDAO extends Dao<AlmacenamientoDTO> {
    
    public AlmacenamientoDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean create(AlmacenamientoDTO dto) throws SQLException {
        if (dto == null || !validatePK(dto.getId())) {
            return false;
        }
        String query = "Call AlmacenamientoCreate(?,?,?,?,?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, dto.getId());
            stmt.setInt(2, dto.getProduccion());
            stmt.setInt(3, dto.getCantidad());
            stmt.setDate(4, dto.getFechaIngreso());
            stmt.setDate(5, dto.getFechaEgreso());
            return stmt.executeUpdate() > 0;
        }
    }

    @Override
    public AlmacenamientoDTO read(Object id) throws SQLException {
        if (id == null || String.valueOf(id).trim().isEmpty()) {
            return null;
        }
        String query = "Call AlmacenamientoRead(?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, String.valueOf(id));
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new AlmacenamientoDTO(
                            rs.getInt(1),
                            rs.getInt(2),
                            rs.getInt(3),
                            rs.getDate(4),
                            rs.getDate(5));
                }
            }
        }
        return null;

    }

    @Override
    public List<AlmacenamientoDTO> readAll() throws SQLException {
        String query = "Call AlmacenamientoReadAll()";
        List<AlmacenamientoDTO> list = new ArrayList<>();
        try (PreparedStatement stmt = connection.prepareStatement(query)) {

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    list.add(new AlmacenamientoDTO(
                            rs.getInt(1),
                            rs.getInt(2),
                            rs.getInt(3),
                            rs.getDate(4),
                            rs.getDate(5)));
                }
            }
        }
        return list;
    }

    @Override
    public boolean update(AlmacenamientoDTO dto) throws SQLException {
        if (dto == null) {
            return false;
        }
        String query = "Call AlmacenamientoUpdate(?,?,?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, dto.getId());
            stmt.setInt(2, dto.getCantidad());
            stmt.setDate(3, dto.getFechaEgreso());
            return stmt.executeUpdate() > 0;

        }
    }

    @Override
    public boolean delete(Object id) throws SQLException {
        if (id == null || String.valueOf(id).trim().isEmpty()) {
            return false;
        }
        String query = "Call AlmacenamientoDelete(?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, String.valueOf(id));
            return stmt.executeUpdate() > 0;

        }
    }

    public boolean validatePK(Object id) throws SQLException {
        return read(id) == null;
    }
    
    

}
