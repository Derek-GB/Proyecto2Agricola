/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Cache;

import java.util.HashMap;

/**
 *
 * @author d2tod
 * @param <Id>
 * @param <Dto>
 */
public abstract  class Cache<Id, Dto> {

    private final HashMap<Id, Dto> cache;

    public final boolean add(Id key, Dto dto) {
        return cache.put(key, dto) == null;
    }

    public final boolean change(Id key, Dto dto) {
        return cache.replace(key, dto) != null;
//          if(remove(key)){
//              return add(key,dto);
//          }
//          return false;
    }

    public final boolean remove(Id key) {
        return cache.remove(key) != null;
    }

    public final boolean contains(Id key) {
        return cache.containsKey(key);
    }
    
    public final Dto get(Id key) {
        return cache.get(key);
    }
    
    //si no se llega a usar, borren esta funcion luego; preguntar a derek antes de la entrega final
    protected HashMap<Id, Dto> getInternalCache() {
        return new HashMap<>(cache);
    }

    protected Cache(){
        this.cache = new HashMap<>();
    }

}
