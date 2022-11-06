package com.huncho.jack.model;

import java.util.HashMap;

public class Activity {
    private String description;
    private String activityType;
    private String date;
    private String time;
    private String duration;
    //    LocalTime ltObject1 = LocalTime.of(08, 20, 45);
    private HashMap<Integer, String> deviceList = new HashMap<Integer, String>();
    private String activityDevice;
    private Coach coach;

    public Activity(Coach coach) {
        this.coach = coach;
        deviceList.put(1, "HomeTrainer");
        deviceList.put(2, "Smartphone");
        deviceList.put(3, "Smartwatch");
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public HashMap<Integer, String> getDeviceList() {
        return deviceList;
    }

    public void setDeviceList(HashMap<Integer, String> deviceList) {
        this.deviceList = deviceList;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getActivityDevice() {
        return activityDevice;
    }

    public void setActivityDevice(String activityDevice) {
        this.activityDevice = activityDevice;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "description='" + description + '\'' +
                ", activityType='" + activityType + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", duration='" + duration + '\'' +
                ", deviceList=" + deviceList +
                ", activityDevice='" + activityDevice + '\'' +
                ", coach=" + coach +
                '}';
    }
}
