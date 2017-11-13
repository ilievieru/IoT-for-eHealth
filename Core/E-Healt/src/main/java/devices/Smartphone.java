package devices;

import devices.abstractFactory.AbstractDevice;

import java.util.Map;

public class Smartphone extends AbstractDevice {

    public Smartphone(Map<String, String> data) {
        this.setDeviceId(Long.parseLong(data.get("id")));
        this.setDeviceType(data.get("type"));
    }


}
