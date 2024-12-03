package base.repository;

import base.entity.BaseEntity;

import java.io.Serializable;

public interface BaseRepository <ID extends Serializable ,T extends BaseEntity<ID>>{

    void save(T t);
    void delete(int id);
    void selectAllName();

}
