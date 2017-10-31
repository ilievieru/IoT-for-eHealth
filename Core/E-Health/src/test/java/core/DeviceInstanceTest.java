package core;

import org.junit.Test;

public class DeviceInstanceTest {

    @Test
    public void testDeviceInstance(){
        DeviceInstance.getInstance(1, "Smartphone");
        DeviceInstance.getInstance(1, "Smartphone");
        DeviceInstance.getInstance(2, "Smartphone");
    }
}
