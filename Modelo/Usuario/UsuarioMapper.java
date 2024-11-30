/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Usuario;

import Enums.Rol;
import Modelo.Mapper.Mapper;

/**
 *
 * @author Fernando
 */
public class UsuarioMapper implements Mapper<Usuario, UsuarioDTO> {

    @Override
    public UsuarioDTO toDTO(Usuario ent) {
        String rol = ent.getRol().name();
        return new UsuarioDTO( ent.getNombre(), ent.getContraseña(), rol);
    }

    @Override
    public Usuario toEnt(UsuarioDTO dto) {
        Rol rol = Rol.valueOf(dto.getRol());
        return new Usuario(dto.getNombre(), dto.getContraseña(), rol);
    }

}
