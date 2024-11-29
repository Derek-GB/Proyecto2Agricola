/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Almacenamiento;

import Modelo.Database.Database;
import Modelo.Mapper.Mapper;
import Utils.UtilDate;

/**
 *
 * @author DYLAN
 */
public class AlmacenamientoMapper implements Mapper<Almacenamiento, AlmacenamientoDTO> {

    @Override
    public AlmacenamientoDTO toDTO(Almacenamiento ent) {
        return new AlmacenamientoDTO(
                ent.getId(),
                ent.getProduccion().getId(),
                ent.getCantidad(),
                UtilDate.toSqlDate(ent.getFechaIngreso()),
                UtilDate.toSqlDate(ent.getFechaEgreso())
        );
    }

    @Override
    public Almacenamiento toEnt(AlmacenamientoDTO dto) {
        return new Almacenamiento(
                dto.getId(),
                dto.getProduccion(),
                new AlmacenamientoMapper().toEnt (new AlmacenamientoDAO(Database.Database.getConnection()).read(dto.getProduccion())),
                dto.getCantidad(),
                UtilDate.toLocalDate(dto.getFechaIngreso()),
                UtilDate.toLocalDate(dto.getFechaEgreso())
        );
    }

}
