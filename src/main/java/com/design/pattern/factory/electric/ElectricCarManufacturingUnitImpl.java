package com.design.pattern.factory.electric;

import com.design.pattern.enums.Location;
import com.design.pattern.enums.ManufacturingCarUnitType;
import com.design.pattern.factory.TataManufacturerFactory;

public class ElectricCarManufacturingUnitImpl extends TataManufacturerFactory implements ElectricCarManufacturingUnit {

    public ElectricCarManufacturingUnitImpl(ManufacturingCarUnitType modelType, Location location) {
        super(modelType, location);
        makeElectricAutomaticCar();
    }

    @Override
    public void makeElectricAutomaticCar() {
        System.out.println("Connecting to ElectricCarManufacturingUnit to make EV");

    }

    @Override
    public void getListofElectricAutomaticCars() {
        System.out.println("Connecting to ElectricCarManufacturingUnit to getList Of EV's");
    }

}
