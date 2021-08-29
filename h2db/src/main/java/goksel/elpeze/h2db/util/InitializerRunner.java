package goksel.elpeze.h2db.util;

import goksel.elpeze.h2db.entity.Student;
import goksel.elpeze.h2db.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class InitializerRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(InitializerRunner.class);

    @Autowired
    StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        studentRepository.deleteAll();

        studentRepository.save(Student.builder().name("Göksel").birthdate(LocalDate.of(1996, 4, 2)).address("İzmir").gender('M').build());
        studentRepository.save(Student.builder().name("Taylan").birthdate(LocalDate.of(1999, 2, 5)).address("İstanbul").gender('M').build());
        studentRepository.save(Student.builder().name("Oktay").birthdate(LocalDate.of(1994, 6, 16)).address("Kayseri").gender('M').build());
        studentRepository.save(Student.builder().name("Elif").birthdate(LocalDate.of(1990, 9, 21)).address("Antalya").gender('F').build());

        studentRepository.findAll().forEach(student -> logger.info("{}", student));

    }
}
