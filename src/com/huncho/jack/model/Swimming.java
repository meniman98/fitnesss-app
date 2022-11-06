package com.huncho.jack.model;

public class Swimming extends Activity{
    private Integer lengthLane;
    private Integer totalLaps;
    private Integer distance;

    public Swimming(Coach coach) {
        super(coach);
    }

    public Integer getLengthLane() {
        return lengthLane;
    }

    public void setLengthLane(Integer lengthLane) {
        this.lengthLane = lengthLane;
    }

    public Integer getTotalLaps() {
        return totalLaps;
    }

    public void setTotalLaps(Integer totalLaps) {
        this.totalLaps = totalLaps;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }
}
