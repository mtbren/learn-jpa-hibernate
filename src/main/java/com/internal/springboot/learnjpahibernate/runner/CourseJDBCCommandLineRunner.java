package com.internal.springboot.learnjpahibernate.runner;

import com.internal.springboot.learnjpahibernate.entity.Course;
import com.internal.springboot.learnjpahibernate.repo.CourseJDBCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJDBCCommandLineRunner implements CommandLineRunner {

    @Autowired
    CourseJDBCRepository courseRepo;
    @Override
    public void run(String... args) throws Exception {
        courseRepo.insert(new Course(1, "AWS SA", "Stephane Maarek"));
        courseRepo.insert(new Course(2, "Kafka", "Stephane Maarek"));
        courseRepo.insert(new Course(3, "Spring Boot", "Ranga Karnam"));

        courseRepo.deleteById(2);

        System.out.println(courseRepo.findtById(3));
    }
}
