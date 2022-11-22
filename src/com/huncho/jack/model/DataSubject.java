package com.huncho.jack.model;

import java.time.LocalDate;

public class DataSubject {
    LocalDate date;
    Double weight;
    Double bmiNumber;
    String bmiKeyword;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getBmiNumber() {
        return bmiNumber;
    }

    public void setBmiNumber(Double bmiNumber) {
        this.bmiNumber = bmiNumber;
    }

    public String getBmiKeyword() {
        return bmiKeyword;
    }

    public void setBmiKeyword(String bmiKeyword) {
        this.bmiKeyword = bmiKeyword;
    }

    @Override
    public String toString() {
        return "DataSubject{" +
                "date=" + date +
                ", weight=" + weight +
                ", bmiNumber=" + bmiNumber +
                ", bmiKeyword='" + bmiKeyword + '\'' +
                '}';
    }
}
