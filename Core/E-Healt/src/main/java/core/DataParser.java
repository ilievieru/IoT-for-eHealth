package core;

import database.Transformer;
import database.entities.AbstractEntities;
import database.services.AbstractServices;
import devices.abstractFactory.AbstractDevice;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DataParser {

    public boolean isRelevant(String type) {
        if (type.equalsIgnoreCase("Device")) {
            return relevantDeviceData();
        }
        if (type.equalsIgnoreCase("Bracelet")) {
            return relevantBraceletData();
        }
        if (type.equalsIgnoreCase("Smartphone")) {
            return relevantSmartphoneData();
        }
        return true;
    }

    public AbstractDevice createSingleDevice(Map<String, String> data) {
        AbstractDevice device = null;
        if (isRelevant(data.get("type"))) {
            device = DeviceInstance.getInstance(data);
        }
        return device;
    }

    public void saveInstanceDevice(Map<String, String> data) {
        if (isRelevant(data.get("type"))) {
            AbstractDevice device = DeviceInstance.getInstance(data);
            Transformer transformer = new Transformer();
            AbstractEntities entities = transformer.transformDeviceToEntity(device);
            AbstractServices abstractServices = new AbstractServices();
            abstractServices.save(entities);
        }
    }

    private Boolean relevantBraceletData() {
        return true;
    }

    private Boolean relevantDeviceData() {
        return true;
    }

    private Boolean relevantSmartphoneData() {
        return true;
    }
}
