package core;

import devices.abstractFactory.AbstractDevice;
import devices.abstractFactory.FactoryDevice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DeviceInstance {

    public static List<AbstractDevice> devices = new ArrayList<>();
    private static AbstractDevice instance = null;
    private static FactoryDevice factoryDevice = new FactoryDevice();

    public static AbstractDevice getInstance(Map<String, String> data) {
        for (AbstractDevice abstractDevice : devices) {
            if (abstractDevice.getDeviceId() == Long.parseLong(data.get("id")))
                return abstractDevice;
        }

        instance = factoryDevice.getDevice(data);
        devices.add(instance);
        return instance;
    }
}
