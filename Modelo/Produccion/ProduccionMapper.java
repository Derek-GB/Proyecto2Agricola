/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Produccion;


import Modelo.Cultivo.CultivoDAO;
import Modelo.Cultivo.CultivoMapper;
import Modelo.Database.Database;
import Modelo.Mapper.Mapper;
import java.sql.SQLException;


/**
 *
 * @author Tony
 */
public class ProduccionMapper implements Mapper<Produccion, ProduccionDTO>{

    @Override
    public ProduccionDTO toDTO(Produccion ent) {
    return new ProduccionDTO(ent.getId()
            , ent.getCultivo().getId()
            , Utils.UtilDate.toSqlDate(ent.getFecha())
            , ent.getCantidadRecolectada()
            , ent.getCalidad()
            , ent.getDestino());
    }

    @Override
    public Produccion toEnt(ProduccionDTO dto) {
    try{
        return new Produccion(dto.getId()
            , new CultivoMapper().toEnt(new CultivoDAO(Database.getConnection()).read(dto.getCultivoPK()))
            , Utils.UtilDate.toLocalDate(dto.getFecha())
            , dto.getCantidadRecolectada()
            , dto.getCalidad()
            , dto.getCantidadRecolectada()
            , dto.getDestino());
        
            } catch (SQLException e){
         return null;   
        }
    }
    
}
