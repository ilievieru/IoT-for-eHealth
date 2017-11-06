package database;

import database.entities.AbstractEntities;
import devices.abstractFactory.AbstractDevice;

public class Transformer {

    public AbstractEntities transformDeviceToEntity(AbstractDevice abstractDevice){
        //transform data from device to a compatible entity
        return new AbstractEntities();
    }

}
