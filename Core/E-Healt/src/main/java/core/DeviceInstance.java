package core;

import devices.AbstractDevice;
import devices.FactoryDevice;

import java.util.ArrayList;
import java.util.List;

public class DeviceInstance {

    public static List<AbstractDevice> devices = new ArrayList<>();
    private static AbstractDevice instance = null;
    private static FactoryDevice factoryDevice = new FactoryDevice();

    public static AbstractDevice getInstance(int deviceId, String deviceType) {
        for (AbstractDevice abstractDevice : devices) {
            if (abstractDevice.getDeviceId() == deviceId)
                return abstractDevice;
        }

        instance = factoryDevice.getDevice(deviceType);
        instance.setDeviceId(deviceId);
        devices.add(instance);
        return instance;
    }
}
