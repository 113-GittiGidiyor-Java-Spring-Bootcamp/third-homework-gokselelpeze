package goksel.elpeze.h2db.dao;

import goksel.elpeze.h2db.entity.Instructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InstructorDAO implements BaseDAO<Instructor> {
    @Override
    public List<Instructor> findAll() {
        return null;
    }

    @Override
    public Instructor findById(int id) {
        return null;
    }

    @Override
    public Instructor save(Instructor object) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public Instructor update(Instructor object) {
        return null;
    }
}
