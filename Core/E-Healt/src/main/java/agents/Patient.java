package agents;

import java.util.Date;

public class Patient {
    private String name;
    private Date dateOfBirth;
    private Double height;
    private String eyeColor;
    private int heartRate;

    public Patient() {
    }

    public Patient(String name, Date dateOfBirth, Double height, String eyeColor, int heartRate) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.height = height;
        this.eyeColor = eyeColor;
        this.heartRate = heartRate;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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
}
