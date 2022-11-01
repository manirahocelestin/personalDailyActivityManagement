package com.nkunda.personaldailyactivitymanagement.model;



import javax.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "userRegistration")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    @Column(name = "FName")
    private  String firstName;
    @Column(name = "LName")
    private String LastName;
    @Column(name = "PersonalType")
    @Enumerated(EnumType.STRING)
    private TitleType personalType;
    @Column(name = "other")
    private String other;
    @Column(name = "address")
    private String address;
    @Column(name = "pNumber")
    private String phoneNumber;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String passWord;
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "user")
    private List<Activity> activities;

    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(name = "user_role",joinColumns = @JoinColumn(name = "userId",referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "roleId",referencedColumnName = "id"))

    private Set<Role> roles = new HashSet<>();

    public User() {
    }

    public User(String firstName, String lastName, TitleType personalType, String other, String address, String phoneNumber, String email, String passWord, List<Activity> activities, Set<Role> roles) {
        this.firstName = firstName;
        LastName = lastName;
        this.personalType = personalType;
        this.other = other;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.passWord = passWord;
        this.activities = activities;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public TitleType getPersonalType() {
        return personalType;
    }

    public void setPersonalType(TitleType personalType) {
        this.personalType = personalType;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", personalType=" + personalType +
                ", other='" + other + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", passWord='" + passWord + '\'' +
                ", activities=" + activities +
                ", roles=" + roles +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
