package goksel.elpeze.h2db.services;

import goksel.elpeze.h2db.dao.CourseDAO;
import goksel.elpeze.h2db.entity.Course;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CourseService implements BaseService<Course> {

    private CourseDAO courseDAO;

    public CourseService(CourseDAO courseDAO) {
        this.courseDAO = courseDAO;
    }

    @Override
    public List<Course> findAll() {
        return courseDAO.findAll();
    }

    @Override
    public Course findById(int id) {
        return (Course) courseDAO.findById(id);
    }

    @Override
    @Transactional
    public Course save(Course course) {
        return (Course) courseDAO.save(course);
    }

    @Override
    public void deleteById(int id) {
        courseDAO.deleteById(id);
    }

    @Override
    public Course update(Course course) {
        return (Course) courseDAO.update(course);
    }
}
