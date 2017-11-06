package devices.abstractFactory;

import agents.person.Persons;

public abstract class AbstractDevice {
    private String deviceType;
    private long deviceId;
    private String deviceName;
    private Persons assignedPerson;

    public String getDeviceType() {
        return deviceType;
    }

    public long getDeviceId() {
        return deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public Persons getAssignedPerson() {
        return assignedPerson;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public void setDeviceId(long deviceId) {
        this.deviceId = deviceId;
    }

    public void setAssignedPerson(Persons assignedPerson) {
        this.assignedPerson = assignedPerson;
    }
}
