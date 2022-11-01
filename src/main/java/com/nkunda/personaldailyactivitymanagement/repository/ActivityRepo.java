package com.nkunda.personaldailyactivitymanagement.repository;

import com.nkunda.personaldailyactivitymanagement.model.Activity;
import com.nkunda.personaldailyactivitymanagement.model.ActivityType;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository

public interface ActivityRepo extends JpaRepository<Activity,Long> {
    Activity findByNameOfActivity(ActivityType activityType);

    Activity findByDate(LocalDate date);
   /// List<Activity> findBetweenByDate(LocalDate startDate, LocalDate endDate);
//   @Query("select act from Activity act  where act.date BETWEEN : x and :y")
//    public Page<Activity> getActivityByDate(@Param("x")LocalDate dateBefore, @Param("y")LocalDate dateAfter, Pageable pageable);

    /*
    @Query("from Synop s where DATE(s.date) = :date")
public Page<Synop> findByDate(@Param("date") Date date, Pageable pageable);
     */
    /*
    @Query("select mvt from Mouvements mvt where mvt.dateCompte between :x and :y")
public Page<Mouvements> getMouvementsByDate(@Param("x")LocalDate dateBefore, @Param("y")LocalDate dateAfter, Pageable pageable);
     */

    /*
    @Query("select mvt from Mouvements mvt where mvt.dateCompte between :x and :y")
public Page<Mouvements> getMouvementsByDate(@Param("x")LocalDate dateBefore, @Param("y")LocalDate dateAfter, Pageable pageable);
and here is my controller

@RequestMapping(value="/movementsByDate", method = RequestMethod.GET)
public Page<Mouvements> movementsByDate(
        @RequestParam(name= "dateBefore", defaultValue="")LocalDate dateBefore,
        @RequestParam(name= "dateAfter", defaultValue="")LocalDate dateAfter,
        @RequestParam(name= "page", defaultValue="0")int page,
        @RequestParam(name= "size", defaultValue="5")int size){
    return mouvementsRepository.getMouvementsByDate(dateBefore, dateAfter,
     */
}
