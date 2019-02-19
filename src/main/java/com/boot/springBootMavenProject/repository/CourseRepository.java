/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boot.springBootMavenProject.repository;

import com.boot.springBootMavenProject.domain.Courses;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author user
 */

public interface CourseRepository extends CrudRepository<Courses, Integer>{
    
}
