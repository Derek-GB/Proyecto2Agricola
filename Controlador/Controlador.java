/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controlador;

/**
 *
 * @author d2tod
 * @param <Id>
 * @param <Ent>
 */
public interface Controlador<Id,Ent> {
    void create(Ent entidad);
    void read(Id id);
    void readAll();
    void update(Ent entidad);
    void delete(Ent entidad);
    boolean validarAtributos(Ent entidad);
    boolean validarPk(Id id);
}
