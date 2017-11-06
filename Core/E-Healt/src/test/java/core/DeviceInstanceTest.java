package core;

import devices.abstractFactory.AbstractDevice;
import org.junit.Assert;
import org.junit.Test;

public class DeviceInstanceTest {

    @Test
    public void testDeviceInstance(){
        AbstractDevice device = DeviceInstance.getInstance(1, "Smartphone");
        Assert.assertEquals(device.getDeviceId(),1);

        AbstractDevice device2 = DeviceInstance.getInstance(2, "Smartphone");
        Assert.assertEquals(device2.getDeviceId(),2);
    }
}
