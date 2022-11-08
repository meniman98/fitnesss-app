package com.huncho.jack.model;

public class Running extends Activity{
    private Double pace;
    private Double distance;

    public Running(Coach coach) {
        super(coach);
    }

    public Double getPace() {
        return pace;
    }

    public void setPace(Double pace) {
        this.pace = pace;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }


}
