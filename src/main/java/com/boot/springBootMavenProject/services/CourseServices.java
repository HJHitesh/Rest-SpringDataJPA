/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boot.springBootMavenProject.services;

import com.boot.springBootMavenProject.domain.Courses;
import com.boot.springBootMavenProject.repository.CourseRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class CourseServices {

    @Autowired
    private CourseRepository courseRepository;

    public List<Courses> getTheCourses() {

        List<Courses> listofCourses = new ArrayList<>();

        courseRepository.findAll().forEach(listofCourses::add);

        return listofCourses;
    }
    
    public Optional<Courses> getSingleCourse(int courseId){
        return courseRepository.findById(courseId);
    }

    public void addingCourse(Courses courses) {

        courseRepository.save(courses);
    }

    public void updateCourse(int courseId,Courses courses){
        
        courseRepository.save(courses);
    }
    
    
}
