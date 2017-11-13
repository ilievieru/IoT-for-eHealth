package devices;

import devices.abstractFactory.AbstractDevice;

import java.util.Map;

public class Device extends AbstractDevice {

    public Device(Map<String, String> data) {
        this.setDeviceId(Long.parseLong(data.get("id")));
        this.setDeviceType(data.get("type"));
        System.out.println("Device created");
    }
}
