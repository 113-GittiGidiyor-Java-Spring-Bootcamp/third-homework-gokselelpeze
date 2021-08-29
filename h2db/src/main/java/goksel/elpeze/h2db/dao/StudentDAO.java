package goksel.elpeze.h2db.dao;

import goksel.elpeze.h2db.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAO implements BaseDAO<Student> {
    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public Student save(Student object) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public Student update(Student object) {
        return null;
    }
}
