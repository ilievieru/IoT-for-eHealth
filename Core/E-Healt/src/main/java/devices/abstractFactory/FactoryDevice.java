package devices.abstractFactory;

import devices.Bracelet;
import devices.Device;
import devices.Smartphone;

import java.util.Map;

public class FactoryDevice {

    public AbstractDevice getDevice(Map<String, String> data) {

        if (data.get("type").equalsIgnoreCase("Device")) {
            return new Device(data);
        }

        if (data.get("type").equalsIgnoreCase("Smartphone")) {
            return new Smartphone(data);
        }

        if (data.get("type").equalsIgnoreCase("Bracelet")) {
            return new Bracelet(data);
        }

        return new AbstractDevice() {
        };
    }

}
