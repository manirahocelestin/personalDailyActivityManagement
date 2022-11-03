package com.nkunda.personaldailyactivitymanagement.service;

import com.nkunda.personaldailyactivitymanagement.model.Activity;
import com.nkunda.personaldailyactivitymanagement.model.ActivityType;

import java.awt.print.Pageable;
import java.time.LocalDate;
import java.util.List;

public interface ActivityService {
    Activity createActivity(Activity activity);
    List<Activity> findAllActivity();
    Activity findActivityByName(ActivityType activityType);
    Activity findByDate(LocalDate date, Pageable pageable);
    Activity updateActivity (Activity activity);
    void deleteActivityById(Long id);
    Activity findById (Long id);


}
