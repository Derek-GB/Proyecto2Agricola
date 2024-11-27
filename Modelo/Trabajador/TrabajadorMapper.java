/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Trabajador;

import Modelo.Mapper.Mapper;

/**
 *
 * @author d2tod
 */
public class TrabajadorMapper implements Mapper<Trabajador, TrabajadorDTO> {

    @Override
    public TrabajadorDTO toDTO(Trabajador ent) {
        return new TrabajadorDTO(
                ent.getCedula(),
                ent.getNombre(),
                ent.getTelefono(),
                ent.getCorreo(),
                ent.getPuesto(),
                ent.getHorario(),
                ent.getSalario()
        );
    }

    @Override
    public Trabajador toEnt(TrabajadorDTO dto) {
        return new Trabajador(
                dto.getCedula(),
                dto.getNombre(),
                dto.getTelefono(),
                dto.getCorreo(),
                dto.getPuesto(),
                dto.getHorario(),
                dto.getSalario()
        );
    }

}
