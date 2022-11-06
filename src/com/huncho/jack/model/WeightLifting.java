package com.huncho.jack.model;

public class WeightLifting extends Activity{
    private Integer weight;
    private Integer reps;

    public WeightLifting(Coach coach) {
        super(coach);
    }


    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getReps() {
        return reps;
    }

    public void setReps(Integer reps) {
        this.reps = reps;
    }
}
