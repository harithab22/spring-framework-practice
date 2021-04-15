package com.sf.springframeworkpetclinic.services.map;

import com.sf.springframeworkpetclinic.model.BaseEntity;

import java.util.*;

public abstract class abstractMapService<T extends BaseEntity,Id extends Long> {
    protected Map<Long,T> map=new HashMap<>();
    Set<T> findAll(){
        return new HashSet<>(map.values());
    }
    T findById(Id id){
        return map.get(id);
    }
    T save(T object){
        if(object != null) {
            if(object.getId() == null){
                object.setId(getnextID());
            }

            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Object cannot be null");
        }

        return object;
    }
    void deletebyID(Id id){
        map.remove(id);
    }
    void delete(T object){
        map.entrySet().removeIf(entry ->entry.getValue().equals(object) );
    }
    private Long getnextID(){
        Long nextid=null;
        try{
           nextid= Collections.max(map.keySet()) +1 ;
        }
        catch (NoSuchElementException e){
            nextid=1L;
        }

        return nextid;
    }
}
