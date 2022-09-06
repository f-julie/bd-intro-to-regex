package com.bloomtech;

public class Heading {
    private String direction;
    private float time;
    private float speedInKnots;

    public Heading(String direction, float time, float speedInKnots) {
        this.direction = direction;
        this.time = time;
        this.speedInKnots = speedInKnots;
    }

    public String getDirection() {
        // TODO: implement
        return "";
    }

    public float getTime() {
        // TODO: implement
        return 0.0f;
    }

    public float getSpeedInKnots() {
        // TODO: implement
        return 0.0f;
    }

    @Override
    public String toString() {
        // TODO: implement
        return "";
    }

    @Override
    public boolean equals(Object otherHeading) {
        // TODO: implement
        return false;
    }
}
