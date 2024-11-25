/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Cultivo;

import Modelo.Mapper.Mapper;

/**
 *
 * @author DYLAN
 */
public class CultivoMapper implements Mapper<Cultivo, CultivoDTO> {

    @Override
    public CultivoDTO toDTO(Cultivo ent) {
        return new CultivoDTO(
                ent.getId(),
                ent.getNombre(),
                ent.getTipo(),
                ent.getAreasembrada(),
                ent.getEstado(),
                ent.getFechaSiembra(),
                ent.getFechaCosecha()
        );
    }

    @Override
    public Cultivo toEnt(CultivoDTO dto) {
        return new Cultivo(
                dto.getId(),
                dto.getNombre(),
                dto.getTipo(),
                dto.getAreasembrada(),
                dto.getEstado(),
                dto.getFechaSiembra(),
                dto.getFechaCosecha()
        );
    }

}
