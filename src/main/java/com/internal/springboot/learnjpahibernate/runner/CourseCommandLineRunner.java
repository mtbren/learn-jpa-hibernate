package com.internal.springboot.learnjpahibernate.runner;

import com.internal.springboot.learnjpahibernate.entity.Course;
import com.internal.springboot.learnjpahibernate.repo.CourseJdbcRepository;
import com.internal.springboot.learnjpahibernate.repo.CourseJpaRepository;
import com.internal.springboot.learnjpahibernate.repo.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository courseJDBCRepository;

    @Autowired
    private CourseJpaRepository courseJPARepository;

    @Autowired
    private CourseSpringDataJpaRepository courseSpringDataJpaRepository;

    @Override
    public void run(String... args) throws Exception {
        /*courseJDBCRepository.insert(new Course(1, "AWS SA", "Stephane Maarek"));
        courseJDBCRepository.insert(new Course(2, "Kafka", "Stephane Maarek"));
        courseJDBCRepository.insert(new Course(3, "Spring Boot", "Ranga Karnam"));

        courseJDBCRepository.deleteById(2);

        System.out.println(courseJDBCRepository.findById(3));*/

        /*courseJPARepository.insert(new Course(1, "AWS SA Now", "Stephane Maarek"));
        courseJPARepository.insert(new Course(2, "Kafka Now", "Stephane Maarek"));
        courseJPARepository.insert(new Course(3, "Spring Boot Now", "Ranga Karnam"));

        courseJPARepository.deleteById(2);

        System.out.println(courseJPARepository.findById(3));*/

        courseSpringDataJpaRepository.save(new Course(1, "AWS SA Again", "Stephane Maarek"));
        courseSpringDataJpaRepository.save(new Course(2, "Kafka Again", "Stephane Maarek"));
        courseSpringDataJpaRepository.save(new Course(3, "Spring Boot Again", "Ranga Karnam"));

        courseSpringDataJpaRepository.deleteById(2L);

        /*System.out.println(courseSpringDataJpaRepository.findById(3L));
        System.out.println(courseSpringDataJpaRepository.findAll());
        System.out.println(courseSpringDataJpaRepository.count());*/
        System.out.println(courseSpringDataJpaRepository.findByAuthor("Stephane Maarek"));
        System.out.println(courseSpringDataJpaRepository.findByName("Spring Boot Again"));

    }
}
