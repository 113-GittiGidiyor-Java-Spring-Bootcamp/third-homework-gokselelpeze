package goksel.elpeze.h2db.repository;

import goksel.elpeze.h2db.entity.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
    // select * from student where fullname='Ali';


    List<Student> findAll();


    @Query("select count(e) from Student e")
    int getNumberOfStudents();



}
