package core;

import database.Transformer;
import database.entities.AbstractEntities;
import devices.abstractFactory.AbstractDevice;
import org.junit.Assert;
import org.junit.Test;

public class TransformerTest {

    @Test
    public void transformTest(){

        AbstractDevice abstractDevice = DeviceInstance.getInstance(1,"Smartphone");
        Transformer transformer = new Transformer();

        AbstractEntities abstractEntities;
        abstractEntities = transformer.transformDeviceToEntity(abstractDevice);
        Assert.assertNotEquals(abstractEntities.getId(), abstractDevice.getDeviceId());
    }
}
