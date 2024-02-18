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
        return this.direction;
    }

    public float getTime() {
        // TODO: implement
        return this.time;
    }

    public float getSpeedInKnots() {
        // TODO: implement
        return this.speedInKnots;
    }

    @Override
    public String toString() {
        // TODO: implement
        return String.format("Heading{direction=%s, time=%.2f, speedInKnots=%.2f}", direction, time, speedInKnots);
    }

    @Override
    public boolean equals(Object otherHeading) {
        // TODO: implement
        return this.getDirection().equals(((Heading) otherHeading).getDirection()) &&
                this.getTime() == ((Heading) otherHeading).getTime() &&
                this.getSpeedInKnots() == ((Heading) otherHeading).getSpeedInKnots();
    }
}
