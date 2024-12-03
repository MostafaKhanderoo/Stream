package base.service.impl;

import base.entity.BaseEntity;
import base.repository.BaseRepository;

import base.service.BaseService;

import java.io.Serializable;

public class BaseServiceImpl <ID extends Serializable,T extends BaseEntity<ID>,R extends BaseRepository<ID,T>>  implements BaseService<ID,T> {

    private final R baseRepository;
    public BaseServiceImpl(R baseRepository){
       this.baseRepository = baseRepository;

   }


    @Override
    public void save(T t) {
        baseRepository.save(t);
    }

    @Override
    public void delete(int id) {
        baseRepository.delete(id);
    }

    @Override
    public void selectAllName() {
baseRepository.selectAllName();
    }
}
