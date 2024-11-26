/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Usuario;

import Modelo.DAO.Dao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fernando
 */
public class UsuarioDAO extends Dao<UsuarioDTO> {

    public UsuarioDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean create(UsuarioDTO dto) throws SQLException {
        if (dto == null || !validateFKContract(dto.getId())) {
            return false;
        }
        String query = "Call UsuarioCreate(?,?,?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, dto.getNombre());
            stmt.setString(2, dto.getContraseña());
            stmt.setString(3, dto.getRol());
            return stmt.executeUpdate() > 0;
        }
    }

    @Override
    public UsuarioDTO read(Object id) throws SQLException {
        if (id == null || String.valueOf(id).trim().isEmpty()) {
            return null;
        }
        String query = "Call UsuarioRead(?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, String.valueOf(id));
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    UsuarioDTO dto = new UsuarioDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
                    return dto;
                }
            }
        }
        return null;
    }

    @Override
    public List<UsuarioDTO> readAll() throws SQLException {
        String query = "Call UsuarioReadAll()";
        List<UsuarioDTO> list = new ArrayList();
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    list.add(new UsuarioDTO(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4)));

                }
            }
        }
        return list;
    }

    @Override
    public boolean update(UsuarioDTO dto) throws SQLException {
        if (dto == null || !validateFKContract(dto.getId())) {
            return false;
        }
        String query = "Call UsuarioUpdate(?,?,?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, dto.getId());
            stmt.setString(2, dto.getNombre());
            stmt.setString(3, dto.getContraseña());
            stmt.setString(4, dto.getRol());
            return stmt.executeUpdate() > 0;
        }
    }

    @Override
    public boolean delete(Object id) throws SQLException {
        if (id == null) {
            return false;
        }
        String query = "Call UsuarioDelete(?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, String.valueOf(id));
            return stmt.executeUpdate() > 0;
        }
    }

    public boolean validateFKContract(Object id) throws SQLException {
//        return new UsuarioDAO(DataBase.getConnection()).read(id) != null;
        return true;
    }

}
