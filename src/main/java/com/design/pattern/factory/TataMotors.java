package com.design.pattern.factory;

import com.design.pattern.enums.Location;
import com.design.pattern.enums.ManufacturingCarUnitType;
import com.design.pattern.factory.electric.ElectricCarManufacturingUnitImpl;
import com.design.pattern.factory.pessanger.PessangerCarManufacturingUnitImpl;
import com.design.pattern.factory.premium.PremiumCarManufacturingUnitImpl;
import com.design.pattern.factory.uk.OtherCountryManufacturingUnitImpl;

public class TataMotors {

    public TataMotors(ManufacturingCarUnitType modelType) {
        construct(modelType);
    }

    private TataManufacturerFactory construct(ManufacturingCarUnitType modelType) {
        TataManufacturerFactory factories = null;
        switch (modelType) {
        case ELECTRIC:
            factories = new ElectricCarManufacturingUnitImpl(modelType, Location.INDIA);
            break;
        case PASSENGER:
            factories = new PessangerCarManufacturingUnitImpl(modelType, Location.INDIA);
            break;

        case PREMIUM:
            factories = new PremiumCarManufacturingUnitImpl(modelType, Location.INDIA);
            break;

        case OTHERCOUNTRY:
            factories = new OtherCountryManufacturingUnitImpl(modelType, Location.UK);
            break;

        default:
            break;
        }
        return factories;

    }

}
