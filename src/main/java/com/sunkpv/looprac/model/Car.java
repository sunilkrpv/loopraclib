package com.sunkpv.looprac.model;

/**
 * 
 * @author sunil
 *
 */
public abstract class Car implements Automobile {
	
	protected String type;
	protected String manufacturer;
	protected String model;

	public String getType() {
		return type;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getModel() {
		return model;
	}
	
}
