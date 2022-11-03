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

public class ActivityControllerIPA {
    @GetMapping("index")
    public ResponseEntity<?> getIndex(){
        return new ResponseEntity<>("hello world",HttpStatus.OK);
    }


    @Autowired
    private ActivityService activityService;
//   public ResponseEntity<List<Student>> getAllStudents() {
//        List<Student> students = studentService.getAllStudents();
//        return new ResponseEntity<>(students, HttpStatus.OK);

       @GetMapping(value = "all",produces = "application/json")
    ResponseEntity<List<Activity>> getAllActivities(){
      List<Activity> activities = activityService.findAllActivity();
       return new ResponseEntity<>(activities,HttpStatus.OK);
    }
//public ResponseEntity<?> getActivityId()

    }
    /*
    @GetMapping("/findbyid/{id}")
    public Activity geActivityId(@PathVariable long id) {
        return bookServiceImpl.findactivityByID(id);
    }
     */
//    @PostMapping(value = "/addActivity",consumes = "application/json",produces = "application/json")
//    public ResponseEntity<?> create(@RequestBody Activity activity){
//        return new ResponseEntity<>(activityRepo.save(activity),HttpStatus.OK);
//
//    }
    }



    /*
    GetMapping(value = "findAll",produces = "application/json")
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(courseService.findAllCourse(),HttpStatus.OK);
     */

