/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Almacenamiento;

import Modelo.Database.Database;
import Modelo.Mapper.Mapper;
import Modelo.Produccion.Produccion;
import Modelo.Produccion.ProduccionDAO;
import Modelo.Produccion.ProduccionMapper;
import Utils.UtilDate;
import java.sql.SQLException;

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
        try{
        return new Almacenamiento(
                dto.getId(),
                new ProduccionMapper().toEnt(new ProduccionDAO(Database.getConnection()).read(dto.getProduccion())),
                dto.getCantidad(),
                UtilDate.toLocalDate(dto.getFechaIngreso()),
                UtilDate.toLocalDate(dto.getFechaEgreso())
        );
        } catch (SQLException e){
         return null;   
        }
    }

}
