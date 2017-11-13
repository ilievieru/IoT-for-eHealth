package devices;

import devices.abstractFactory.AbstractDevice;

import java.util.Map;

public class Bracelet extends AbstractDevice {

    public Bracelet(Map<String,String> data){
        this.setDeviceId(Long.parseLong(data.get("id")));
        this.setDeviceType(data.get("type"));
    }
}
