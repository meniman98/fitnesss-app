package com.huncho.jack;

import java.time.LocalDate;
import java.util.ArrayList;

public class ProfileData {
    private String firstName;
    private String lastName;
    private String gender;
    private LocalDate dateOfBirth;
    private Integer age;
    private Integer weight;
    private Integer height;
    private double bmi;
    private double vo2Max;
    private double mhr;
    private double rhr;
    private Integer choice;
    private String resultBmi;

    private ArrayList<String> deviceList = new ArrayList<>();

    public ProfileData() {
        deviceList.add("Desktop");
        deviceList.add("Smartphone");
        deviceList.add("Smartwatch");
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public double getVo2Max() {
        return vo2Max;
    }

    public void setVo2Max(double vo2Max) {
        this.vo2Max = vo2Max;
    }

    public double getMhr() {
        return mhr;
    }

    public void setMhr(double mhr) {
        this.mhr = mhr;
    }

    public double getRhr() {
        return rhr;
    }

    public void setRhr(double rhr) {
        this.rhr = rhr;
    }

    public Integer getChoice() {
        return choice;
    }

    public void setChoice(Integer choice) {
        this.choice = choice;
    }

    public String getResultBmi() {
        return resultBmi;
    }

    public void setResultBmi(String resultBmi) {
        this.resultBmi = resultBmi;
    }

    public ArrayList<String> getDeviceList() {
        return deviceList;
    }

    public void setDeviceList(ArrayList<String> deviceList) {
        this.deviceList = deviceList;
    }
}