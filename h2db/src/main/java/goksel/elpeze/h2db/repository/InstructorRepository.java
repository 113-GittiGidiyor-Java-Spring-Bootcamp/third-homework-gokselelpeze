package goksel.elpeze.h2db.repository;

import goksel.elpeze.h2db.entity.Instructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InstructorRepository extends CrudRepository<Instructor, Integer> {
    // select * from instructor where fullname='Ali';



    @Query("select count(e) from Instructor e")
    int getNumberOfInstructors();



}
