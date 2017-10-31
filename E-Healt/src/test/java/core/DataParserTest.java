package core;

import org.junit.Test;

public class DataParserTest {

    @Test
    public void testDataParser(){
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
    }
}
