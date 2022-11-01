package com.nkunda.personaldailyactivitymanagement.controller;

import com.nkunda.personaldailyactivitymanagement.model.Activity;
import com.nkunda.personaldailyactivitymanagement.repository.ActivityRepo;
import com.nkunda.personaldailyactivitymanagement.service.ActivityService;
import com.nkunda.personaldailyactivitymanagement.serviceImplement.ActivityServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("allMyProjectIPA")
public class ActivityControllerIPA {

    @Autowired
    private ActivityRepo activityRepo;
    private ActivityService activityService;
//   public ResponseEntity<List<Student>> getAllStudents() {
//        List<Student> students = studentService.getAllStudents();
//        return new ResponseEntity<>(students, HttpStatus.OK);

    @GetMapping("/All")
    ResponseEntity<List<Activity>> getAllActivities(){
       List<Activity> activities = activityService.findAllActivity();
       return new ResponseEntity<>(activities,HttpStatus.OK);
    }
    }



    /*
    GetMapping(value = "findAll",produces = "application/json")
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(courseService.findAllCourse(),HttpStatus.OK);
     */

