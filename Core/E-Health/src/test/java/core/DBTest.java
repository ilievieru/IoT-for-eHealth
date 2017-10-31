package core;

import database.Transformer;
import database.entities.AbstractEntities;
import database.services.AbstractServices;
import org.junit.Test;

public class DBTest {

    @Test
    public void testCreate() {
        DataParser dataParser = new DataParser() {
            @Override
            public void readData() {

            }

            @Override
            public boolean isRelevant() {
                return false;
            }
        };
        dataParser.setDeviceType("Smartphone");
        dataParser.setDeviceId(1);
        Transformer tramsformer = new Transformer();
        tramsformer.transformDeviceToEntity(dataParser.createSingleDevice());

    }

    @Test
    public void testSave(){
        AbstractServices abstractServices = new AbstractServices();
        abstractServices.save(new AbstractEntities());
    }
}
