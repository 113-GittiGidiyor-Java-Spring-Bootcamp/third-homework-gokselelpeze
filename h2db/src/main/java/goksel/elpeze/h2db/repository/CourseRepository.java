package goksel.elpeze.h2db.repository;

import goksel.elpeze.h2db.entity.Course;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CourseRepository extends CrudRepository<Course, Integer> {



    @Query("select count(e) from Course e")
    int getNumberOfCourses();



}
