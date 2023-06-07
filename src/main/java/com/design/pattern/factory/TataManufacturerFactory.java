package com.design.pattern.factory;

import com.design.pattern.enums.Location;
import com.design.pattern.enums.ManufacturingCarUnitType;

import lombok.Data;

/**
 * @author gyadav2
 * 
 *         TataManufacturerFactory is the parent class which having access to
 *         each factory/subsidiaries of Manufacturing units of Tata-Group.
 */
@Data
public abstract class TataManufacturerFactory {

	ManufacturingCarUnitType modelType = null;
	Location location = null;

	/**
	 * Parameterized constructor which takes two input 
	 * 1.Type of car and
	 * 2.Location(for which country car is making)
	 * 
	 * @param modelType
	 * @param location
	 */
    public TataManufacturerFactory(ManufacturingCarUnitType modelType, Location location) {
		this.modelType = modelType;
		this.location = location;
	}

	
}
