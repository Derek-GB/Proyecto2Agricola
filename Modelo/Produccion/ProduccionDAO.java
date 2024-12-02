/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Produccion;

import Modelo.Cultivo.CultivoDAO;
import Modelo.Cultivo.CultivoDTO;
import Modelo.DAO.Dao;
import Modelo.Database.Database;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author Tony
 */
public class ProduccionDAO  extends Dao<ProduccionDTO> {

    public ProduccionDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean create(ProduccionDTO dto) throws SQLException {
      if (dto == null || !validatePK(dto.getId())) {
            return false;
        }

        String query = "Call ProduccionCreate(?,?,?,?,?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, dto.getCultivoPK());
            stmt.setDate(2, dto.getFecha());
            stmt.setDouble(3, dto.getCantidadRecolectada());
            stmt.setString(4, dto.getCalidad());
            stmt.setString(5, dto.getDestino());
            
            return stmt.executeUpdate() > 0;
        }
    }

    @Override
    public ProduccionDTO read(Object id) throws SQLException {
      if (id == null || String.valueOf(id).trim().isEmpty()) {
            return null;
        }
        String query = "Call ProduccionRead(?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, String.valueOf(id));
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new ProduccionDTO(rs.getInt(1)
                            ,rs.getInt(2)
                            ,rs.getDate(3)
                            , rs.getDouble(4)
                            , rs.getString(5)
                            , rs.getString(6));
                }
            }
        }
        return null;
    }

    @Override
    public List<ProduccionDTO> readAll() throws SQLException {
      String query = "Call ProduccionReadAll()";
        List<ProduccionDTO> list = new ArrayList<>();
        try (PreparedStatement stmt = connection.prepareStatement(query)) {

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                   list.add(new ProduccionDTO(rs.getInt(1)
                           ,rs.getInt(2)
                            ,rs.getDate(3)
                            , rs.getDouble(4)
                            , rs.getString(5)
                            , rs.getString(6)));
                }
            }
        }
        return list;
        
    }

    @Override
    public boolean update(ProduccionDTO dto) throws SQLException {
    if (dto == null) {
            return false;
        }

        String query = "Call ProduccionUpdate(?,?,?,?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
           stmt.setInt(1, dto.getId());
           stmt.setDouble(2, dto.getCantidadRecolectada());
           stmt.setString(3, dto.getCalidad());
           stmt.setString(4, dto.getDestino());
            return stmt.executeUpdate() > 0;
        }
    }

    @Override
    public boolean delete(Object id) throws SQLException {
              if (id == null || String.valueOf(id).trim().isEmpty()) {
            return false;
        }
        String query = "Call ProduccionDelete(?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, String.valueOf(id));
            return stmt.executeUpdate() > 0;
        }
    }

    public boolean validatePK(Object id) throws SQLException {
        return read(id) == null;
    }
        
   
    
}