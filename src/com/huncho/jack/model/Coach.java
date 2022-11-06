package com.huncho.jack.model;


import com.huncho.jack.enums.CoachType;

public class Coach {
    private Integer id;
    private String firstName;
    private String lastName;
    private CoachType coachType;

    public Coach(Integer id, String firstName, String lastName, CoachType coachType) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.coachType = coachType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public CoachType getCoachType() {
        return coachType;
    }

    public void setCoachType(CoachType coachType) {
        this.coachType = coachType;
    }

    @Override
    public String toString() {
        return
                id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", coachType=" + coachType;
    }
}



