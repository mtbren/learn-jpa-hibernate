package com.internal.springboot.learnjpahibernate.repo;

import com.internal.springboot.learnjpahibernate.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJDBCRepository {
    @Autowired
    private JdbcTemplate courseJdbcTemplate;

    private static final String INSERT_QUERY =
        """
            insert into course (id,name,author)
            values (?, ?, ?)
        """;

    private static final String DELETE_QUERY =
            """
                delete from course where id = ? 
            """;

    private static final String SELECT_QUERY =
            """
                select * from course where id = ? 
            """;
    public void insert(Course course){
        courseJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
    }

    public void deleteById(long id){
        courseJdbcTemplate.update(DELETE_QUERY, id);
    }

    public Course findtById(long id){
        return courseJdbcTemplate.queryForObject(SELECT_QUERY,
                new BeanPropertyRowMapper<>(Course.class),id);
    }
}
