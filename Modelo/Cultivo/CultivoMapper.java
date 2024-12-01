/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Cultivo;

import Enums.EstadoCrecimiento;
import Enums.TipoCultivo;
import Modelo.Mapper.Mapper;
import Utils.UtilDate;

/**
 *
 * @author DYLAN
 */
public class CultivoMapper implements Mapper<Cultivo, CultivoDTO> {

    @Override
    public CultivoDTO toDTO(Cultivo ent) {
        String tipo = ent.getTipo().name();
        String estado = ent.getEstado().name();
        return new CultivoDTO(
                ent.getId(),
                ent.getNombre(),
                tipo,
                ent.getAreasembrada(),
                estado,
                UtilDate.toSqlDate(ent.getFechaSiembra()),
                UtilDate.toSqlDate(ent.getFechaCosecha())
        );
    }

    @Override
    public Cultivo toEnt(CultivoDTO dto) {
        TipoCultivo tipo = TipoCultivo.valueOf(dto.getTipo());
        EstadoCrecimiento estado = EstadoCrecimiento.valueOf(dto.getEstado());
        return new Cultivo(
                dto.getId(),
                dto.getNombre(),
                tipo,
                dto.getAreasembrada(),
                estado,
                UtilDate.toLocalDate(dto.getFechaSiembra()),
                UtilDate.toLocalDate(dto.getFechaCosecha())
        );
    }

    private TipoCultivo convertirTipoCultivo(String tipo) {
        if (tipo == null || tipo.trim().isEmpty()) {
            return TipoCultivo.CEREALES;
        }
        try {
            return TipoCultivo.valueOf(tipo.toUpperCase()); 
        } catch (IllegalArgumentException ex) {
            return TipoCultivo.CEREALES;
        }
    }

   
    private EstadoCrecimiento convertirEstadoCrecimiento(String estado) {
        if (estado == null || estado.trim().isEmpty()) {
            return EstadoCrecimiento.EN_DESARROLLO;
        }
        try {
            return EstadoCrecimiento.valueOf(estado.toUpperCase());
        } catch (IllegalArgumentException ex) {
            return EstadoCrecimiento.EN_DESARROLLO;
        }
    }
    
    
}
