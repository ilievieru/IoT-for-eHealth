package devices;

public class FactoryDevice {

    public AbstractDevice getDevice(String deviceType){
        if(deviceType.equalsIgnoreCase("Smartphone")){
            return new Device();
        }
        return null;
    }

}
