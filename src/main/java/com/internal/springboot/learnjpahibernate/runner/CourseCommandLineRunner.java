package com.internal.springboot.learnjpahibernate.runner;

import com.internal.springboot.learnjpahibernate.entity.Course;
import com.internal.springboot.learnjpahibernate.repo.CourseJDBCRepository;
import com.internal.springboot.learnjpahibernate.repo.CourseJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
    CourseJDBCRepository courseJDBCRepository;

    @Autowired
    CourseJPARepository courseJPARepository;
    @Override
    public void run(String... args) throws Exception {
        /*courseJDBCRepository.insert(new Course(1, "AWS SA", "Stephane Maarek"));
        courseJDBCRepository.insert(new Course(2, "Kafka", "Stephane Maarek"));
        courseJDBCRepository.insert(new Course(3, "Spring Boot", "Ranga Karnam"));

        courseJDBCRepository.deleteById(2);

        System.out.println(courseJDBCRepository.findById(3));*/

        courseJPARepository.insert(new Course(1, "AWS SA Now", "Stephane Maarek"));
        courseJPARepository.insert(new Course(2, "Kafka Now", "Stephane Maarek"));
        courseJPARepository.insert(new Course(3, "Spring Boot Now", "Ranga Karnam"));

        courseJPARepository.deleteById(2);

        System.out.println(courseJPARepository.findById(3));
    }
}
