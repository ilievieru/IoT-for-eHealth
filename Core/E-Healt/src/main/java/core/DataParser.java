package core;

import database.Transformer;
import database.entities.AbstractEntities;
import database.services.AbstractServices;
import devices.abstractFactory.AbstractDevice;

public abstract class DataParser {

    String deviceType;
    int deviceId;

    public abstract void readData();

    public abstract boolean isRelevant();

    public AbstractDevice createSingleDevice() {
        AbstractDevice device = null;
        if (isRelevant()) {
           device = DeviceInstance.getInstance(deviceId, deviceType);
        }
        return device;
    }

    public void saveInstanceDevice() {
        if (isRelevant()) {
            AbstractDevice device = DeviceInstance.getInstance(deviceId, deviceType);
            Transformer transformer = new Transformer();
            AbstractEntities entities = transformer.transformDeviceToEntity(device);
            AbstractServices abstractServices = new AbstractServices();
            abstractServices.save(entities);
        }
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }
}
