package com.huncho.jack.model;

public class Cycling extends Activity{
    private Double averageSpeed;
    private Double distance;

    public Cycling(Coach coach) {
        super(coach);
    }

    public Double getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(Double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }
}
