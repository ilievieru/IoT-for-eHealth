package devices;

public class Device extends AbstractDevice {

    public Device(){
        this.deviceType = "SmartPhone";
        this.deviceId = 1;
        this.deviceName = "Device de test";
        System.out.println("Smartphone created");
    }
}
