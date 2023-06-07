package com.design.pattern.factory.premium;

import com.design.pattern.enums.Location;
import com.design.pattern.enums.ManufacturingCarUnitType;
import com.design.pattern.factory.TataManufacturerFactory;

public class PremiumCarManufacturingUnitImpl extends TataManufacturerFactory implements PremiumCarManufacturingUnit {

    public PremiumCarManufacturingUnitImpl(ManufacturingCarUnitType modelType, Location location) {
        super(modelType, location);
        makeJaguarOrLandRoverCar();
    }

    @Override
    public void makeJaguarOrLandRoverCar() {
        System.out.println("Connecting to PremiumCarManufacturingUnit to make a Premium Car(Jaguar/LandRover) Segment");

    }

    @Override
    public void getListofPremiumCars() {
        System.out.println("Connecting to PremiumCarManufacturingUnit to getList of Premium Car's");

    }

}
