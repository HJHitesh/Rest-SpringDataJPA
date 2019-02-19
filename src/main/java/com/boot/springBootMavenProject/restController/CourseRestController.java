/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boot.springBootMavenProject.restController;

import com.boot.springBootMavenProject.domain.Courses;
import com.boot.springBootMavenProject.services.CourseServices;
import java.util.Arrays;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user
 */
@RestController
public class CourseRestController {

    @Autowired
    public CourseServices courseServices;

    @RequestMapping("/course/getAllCourses")
    public List<Courses> getAllTheCourseList() {
        
        return courseServices.getTheCourses();
    }

    @RequestMapping("/course/{id}")
    public Optional<Courses> getTheCourseList(@PathVariable("id") int courseId) {
        
        return courseServices.getSingleCourse(courseId);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/course")
    public void addingCouses(@RequestBody Courses courses) {
        courseServices.addingCourse(courses);
    }

    @RequestMapping("/updateCourse/{courseId}")
    public void updateCouses(@RequestBody Courses courses ,@PathVariable("courseId") int courseId) {
        courses.setCourseId(courseId);
        courseServices.updateCourse(courseId,courses);
    }

}
