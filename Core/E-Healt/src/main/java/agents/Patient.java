package agents;

import agents.person.Persons;

public class Patient extends Persons{

    private Double height;
    private String eyeColor;
    private int heartRate;
    private Doctors doctor;

    public Patient() {
    }

    public Double getHeight() {
        return height;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public Doctors getDoctor() {
        return doctor;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public void setDoctor(Doctors doctor) {
        this.doctor = doctor;
    }
}
