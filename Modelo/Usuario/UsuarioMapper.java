/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Usuario;

import Enums.Rol;
import Modelo.Database.Database;
import Modelo.Mapper.Mapper;
import Modelo.Trabajador.Trabajador;
import Modelo.Trabajador.TrabajadorDAO;
import Modelo.Trabajador.TrabajadorMapper;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fernando
 */
public class UsuarioMapper implements Mapper<Usuario, UsuarioDTO> {

    @Override
    public UsuarioDTO toDTO(Usuario ent) {
        String rol = ent.getRol().name();
        return new UsuarioDTO(ent.getNombre(), ent.getContraseña(), rol, ent.getTrabajador().getCedula());
    }

    @Override
    public Usuario toEnt(UsuarioDTO dto) {
        Rol rol = Rol.valueOf(dto.getRol());
        try {
            return new Usuario(dto.getNombre(), dto.getContraseña(), rol, new TrabajadorMapper().toEnt(new TrabajadorDAO(Database.getConnection()).read(dto.getTrabajador())));
        } catch (SQLException ex) {
            return null;
        }
    }

}
