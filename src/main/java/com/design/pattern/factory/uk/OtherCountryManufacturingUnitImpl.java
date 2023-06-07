package com.design.pattern.factory.uk;

import com.design.pattern.enums.Location;
import com.design.pattern.enums.ManufacturingCarUnitType;
import com.design.pattern.factory.TataManufacturerFactory;

public class OtherCountryManufacturingUnitImpl extends TataManufacturerFactory
        implements OtherCountryManufacturingUnit {

    public OtherCountryManufacturingUnitImpl(ManufacturingCarUnitType modelType, Location location) {
        super(modelType, location);
        makeCarForOtherCountry();
    }

    @Override
    public void makeCarForOtherCountry() {
        System.out.println("Connecting to OtherCountryManufacturingUnit to make a in Other Country");
    }

    @Override
    public void getListofOtherCountryCar() {
        System.out.println("Connecting to OtherCountryManufacturingUnit to getList of Cars present in Other Locations");

    }

}
