package com.nkunda.personaldailyactivitymanagement.test;

import com.nkunda.personaldailyactivitymanagement.model.Activity;
import com.nkunda.personaldailyactivitymanagement.model.ActivityType;
import com.nkunda.personaldailyactivitymanagement.repository.ActivityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class ActivityTest implements CommandLineRunner {
    @Autowired
    private ActivityRepo activityRepo;


    @Override
    public void run(String... args) throws Exception {
        Activity activity = new Activity(LocalDate.of(2022,5,10), ActivityType.GAZ,"driking","USA",3000,"the part was so cool",null);

        Activity activity2 = new Activity(LocalDate.of(2022,10,25),ActivityType.HOTEL,"fixing Car","California",2000,"my car has engine problem",null);
        Activity activity3 = new Activity(LocalDate.of(2022,9,10),ActivityType.HOTEL,"painting ","Utah",1500,"My house was damaged",null);
        Activity activity4 = new Activity(LocalDate.of(2022,5,05),ActivityType.HOTEL,"buy a house","Texas",200000,"moved ",null);

        activityRepo.save(activity);
        activityRepo.save(activity2);
        activityRepo.save(activity3);
        activityRepo.save(activity4);
        System.out.println("the list Of activities are :"+ activityRepo.count());




    }
}
