package devices.abstractFactory;

import devices.Bracelet;
import devices.Device;
import devices.Smartphone;

public class FactoryDevice {

    public AbstractDevice getDevice(String deviceType){

        if(deviceType.equalsIgnoreCase("Device")){
            return new Device();
        }

        if(deviceType.equalsIgnoreCase("Smartphone")){
            return new Smartphone();
        }

        if(deviceType.equalsIgnoreCase("Bracelet")){
            return new Bracelet();
        }

        return null;
    }

}
