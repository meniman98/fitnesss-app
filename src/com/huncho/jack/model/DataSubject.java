package com.huncho.jack.model;

import java.text.MessageFormat;
import java.time.LocalDate;

public class DataSubject {
    LocalDate date;
    Double weight;
    Double bmiNumber;
    String bmiKeyword;

    public DataSubject(LocalDate date, Double weight, Double bmiNumber, String bmiKeyword) {
        this.date = date;
        this.weight = weight;
        this.bmiNumber = bmiNumber;
        this.bmiKeyword = bmiKeyword;
    }

    public DataSubject() {}

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
        return MessageFormat.format("{0} - {1} {2} {3}",
                date,
                weight,
                bmiNumber,
                bmiKeyword);
    }
}
