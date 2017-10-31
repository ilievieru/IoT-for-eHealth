package database.services;

import database.repository.AbstractRepository;

import java.io.Serializable;

public class AbstractServices implements AbstractRepository {
    @Override
    public Object save(Object o) {
        System.out.println("Entity saved");
         return null;
    }

    @Override
    public Iterable save(Iterable iterable) {
        return null;
    }

    @Override
    public Object findOne(Serializable serializable) {
        return null;
    }

    @Override
    public boolean exists(Serializable serializable) {
        return false;
    }

    @Override
    public Iterable findAll() {
        return null;
    }

    @Override
    public Iterable findAll(Iterable iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Serializable serializable) {

    }

    @Override
    public void delete(Object o) {

    }

    @Override
    public void delete(Iterable iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
