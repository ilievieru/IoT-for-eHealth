package devices;

import devices.abstractFactory.AbstractDevice;

public class Device extends AbstractDevice {

    public Device(){
        this.setDeviceId(1);
        this.setDeviceName("Device de test");
        this.setDeviceType("Device");
        System.out.println("Device created");
    }
}
