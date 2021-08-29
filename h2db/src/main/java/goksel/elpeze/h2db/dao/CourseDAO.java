package goksel.elpeze.h2db.dao;

import goksel.elpeze.h2db.dao.BaseDAO;
import goksel.elpeze.h2db.entity.Course;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CourseDAO implements BaseDAO<Course> {
    @Override
    public List<Course> findAll() {
        return null;
    }

    @Override
    public Course findById(int id) {
        return null;
    }

    @Override
    public Course save(Course object) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public Course update(Course object) {
        return null;
    }
}
