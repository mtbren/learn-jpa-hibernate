package com.internal.springboot.learnjpahibernate.repo;

import com.internal.springboot.learnjpahibernate.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course,Long> {

}
