package com.design.pattern.factory.pessanger;

import com.design.pattern.enums.Location;
import com.design.pattern.enums.ManufacturingCarUnitType;
import com.design.pattern.factory.TataManufacturerFactory;

public class PessangerCarManufacturingUnitImpl extends TataManufacturerFactory
        implements PessangerCarManufacturingUnit {

    public PessangerCarManufacturingUnitImpl(ManufacturingCarUnitType modelType, Location location) {
        super(modelType, location);
        makePassengerCar();
    }

    @Override
    public void makePassengerCar() {
        System.out.println("Connecting to PessangerCarManufacturingUnit to make PassenerCar");
    }

    @Override
    public void getPessagerCars() {
        System.out.println("Connecting to PessangerCarManufacturingUnit to getList of  PassenerCar's");

    }

}
