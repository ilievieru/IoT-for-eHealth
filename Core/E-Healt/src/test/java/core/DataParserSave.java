package core;

import org.junit.Test;

public class DataParserSave {

    @Test
    public void testDataParserSave(){
        DataParser dataParser = new DataParser() {
            @Override
            public void readData() {

            }

            @Override
            public boolean isRelevant() {
                return true;
            }
        };

        dataParser.setDeviceId(4);
        dataParser.setDeviceType("Smartphone");
        dataParser.createSingleDevice();
        dataParser.setDeviceId(4);

        dataParser.setDeviceType("Bracelet");
        dataParser.createSingleDevice();
        dataParser.saveInstanceDevice();
    }
}
