package base.service;

import base.entity.BaseEntity;

import java.io.Serializable;

public interface BaseService<ID extends Serializable , T extends BaseEntity<ID>> {
    void save(T t);
    void delete(int id);
    void selectAllName();

}
