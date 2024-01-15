package com.lucasvllba.personsapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lucasvllba.personsapi.model.Persona;
import com.lucasvllba.personsapi.repository.BaseRepository;

@Service
public abstract class BaseService<E extends Persona, ID>{
    
    private final BaseRepository<E, ID> baseRepo;

    public BaseService(BaseRepository<E, ID> baseRepo){
        this.baseRepo = baseRepo;
    }

    public List<E> findAll(){
        return baseRepo.findAll();
    }

    public E findById(ID id){
        return baseRepo.findById(id).orElseThrow();
    }

    public void  save(E entity){
        baseRepo.save(entity);
    }

    public void delete(ID id){
        baseRepo.deleteById(id);
    }

    public E modify(E entity, ID id){
        E data = findById(id);
        setAllAttributes(data, entity);
        save(data);
        return data;
    }

    private void setAllAttributes(E data, E entity){

        if (Byte.valueOf(entity.getAge()) != 0){
            data.setAge(entity.getAge());System.out.println(entity.getAge());}
        if(entity.getGender() != null)
            data.setGender(entity.getGender());
        if(entity.getLastname() != null)
            data.setLastname(entity.getLastname());
        if(entity.getName() != null)
            data.setName(entity.getName());
    }
}
