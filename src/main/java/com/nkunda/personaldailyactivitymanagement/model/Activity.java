package com.nkunda.personaldailyactivitymanagement.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "activity")
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    @Column(name = "date")
    private LocalDate date;
    @Column(name = "NOFActivity")
    @Enumerated(EnumType.STRING)
    private ActivityType nameOfActivity;
    @Column(name = "other")
    private String other;
    @Column(name = "address")
    private String address;
    @Column(name = "amount")
    private double amount;
    @Column(name = "comment")
    private String comment;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId")
    private User user;

    public Activity() {
    }

    public Activity(LocalDate date, ActivityType nameOfActivity, String other, String address, double amount, String comment, User user) {
        this.date = date;
        this.nameOfActivity = nameOfActivity;
        this.other = other;
        this.address = address;
        this.amount = amount;
        this.comment = comment;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public ActivityType getNameOfActivity() {
        return nameOfActivity;
    }

    public void setNameOfActivity(ActivityType nameOfActivity) {
        this.nameOfActivity = nameOfActivity;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", date=" + date +
                ", nameOfActivity=" + nameOfActivity +
                ", other='" + other + '\'' +
                ", address='" + address + '\'' +
                ", amount=" + amount +
                ", comment='" + comment + '\'' +
                ", user=" + user +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Activity activity = (Activity) o;
        return Objects.equals(id, activity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
