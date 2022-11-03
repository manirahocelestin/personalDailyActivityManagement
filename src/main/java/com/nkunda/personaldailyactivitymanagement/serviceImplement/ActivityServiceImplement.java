package com.nkunda.personaldailyactivitymanagement.serviceImplement;



import com.nkunda.personaldailyactivitymanagement.model.Activity;
import com.nkunda.personaldailyactivitymanagement.model.ActivityType;
import com.nkunda.personaldailyactivitymanagement.repository.ActivityRepo;
import com.nkunda.personaldailyactivitymanagement.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.awt.print.Pageable;
import java.time.LocalDate;
import java.util.List;
@Service
@Transactional

public class ActivityServiceImplement implements ActivityService {


    @Autowired
    private ActivityRepo activityRepo;

    @Override
    public Activity createActivity(Activity activity) {
        try{
            return activityRepo.save(activity);

        }catch (Exception e){
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<Activity> findAllActivity() {
       return activityRepo.findAll();
    }

    @Override
    public Activity findActivityByName(ActivityType activityType) {
        try{
            return activityRepo.findByNameOfActivity(activityType);
        }catch (Exception e){
            throw new RuntimeException(e);
           // throw new RuntimeException("I'm sorry this name not found on the system");
        }

    }

    @Override
    public Activity findByDate(LocalDate date, Pageable pageable) {
        try {
            return activityRepo.findByDate(date);

        }catch (Exception e){
            throw new RuntimeException("I'm sorry this date is not recoded");
        }

    }


    @Override
    public Activity updateActivity(Activity activity) {
        try{
            return activityRepo.save(activity);
        }catch (Exception e){
            throw new RuntimeException("I'm sorry your update was failed please try again ");
        }
    }

    @Override
    public void deleteActivityById(Long id) {
        try{

           activityRepo.deleteById(id);

        }catch (Exception e){
            throw  new RuntimeException("Please verified your Id number before you delete!!");
        }

    }

    @Override
    public Activity findById(Long id) {
        return activityRepo.findById(id).get();
    }
}
