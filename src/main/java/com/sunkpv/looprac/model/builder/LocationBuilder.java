package com.sunkpv.looprac.model.builder;

import com.sunkpv.looprac.model.MacroLocation;

/**
 * Builds an instance of the Location class.
 * @author sunil
 *
 */
public class LocationBuilder {

	private MacroLocation location;
	
	public LocationBuilder() {
		location = new MacroLocation();
	}

	public MacroLocation getLocation() {
		return location;
	}

	public LocationBuilder setLatitude(double latitude) {
		location.setLatitude(latitude);
		return this;
	}

	public LocationBuilder setLongitude(double longitude) {
		location.setLongitude(longitude);
		return this;
	}

	public LocationBuilder setAddress(String address) {
		location.setAddress(address);
		return this;
	}

	public LocationBuilder setCity(String city) {
		location.setCity(city);
		return this;
	}

	public LocationBuilder setState(String state) {
		location.setState(state);
		return this;
	}

	public LocationBuilder setCountry(String country) {
		location.setCountry(country);
		return this;
	}

	public LocationBuilder setPostalCode(String postalCode) {
		location.setPostalCode(postalCode);
		return this;
	}

	public LocationBuilder setKnownName(String knownName) {
		location.setKnownName(knownName);
		return this;
	}

	public LocationBuilder setTaggedName(String taggedName) {
		location.setTaggedName(taggedName);
		return this;
	}
	
}
