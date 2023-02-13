package com.internal.springboot.learnjpahibernate.repo;

import com.internal.springboot.learnjpahibernate.entity.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJPARepository {
    //@Autowired
    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Course course){
        entityManager.merge(course);
    }

    public Course findById(long id){
        return entityManager.find(Course.class, id);
    }

    public void deleteById(long id){
        Course courseToDelete = entityManager.find(Course.class, id);
        entityManager.remove(courseToDelete);
    }
}
