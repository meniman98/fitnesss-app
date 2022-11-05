package com.huncho.jack;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
    HashMap<Integer, String> deviceList = new HashMap<Integer, String>();
    private String deviceName;

    public ProfileData() {
        deviceList.put(1, "Desktop");
        deviceList.put(2, "Smartphone");
        deviceList.put(3, "Smartwatch");

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

    public HashMap<Integer, String> getDeviceList() {
        return deviceList;
    }

    public void setDeviceList(HashMap<Integer, String> deviceList) {
        this.deviceList = deviceList;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public String toString() {
        return "ProfileData: " +
                "FirstName='" + firstName + "\n" +
                "LastName='" + lastName + "\n" +
                "Gender='" + gender + "\n" +
                "Date of birth=" + dateOfBirth + "\n" +
                "Age=" + age + "\n" +
                "Weight=" + weight + "\n" +
                "Height=" + height + "\n" +
                "BMI=" + bmi + "\n"  +
                "vo2Max=" + vo2Max +" \n" +
                "MHR=" + mhr + "\n" +
                "RHR=" + rhr + "\n" +
                "Choice=" + choice + "\n" +
                "Result Bmi='" + resultBmi + "\n" +
                "Device name='" + deviceName + "\n" +
                "Device list=" + deviceList;
    }
}