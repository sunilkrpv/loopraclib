package com.sunkpv.looprac.model;

/**
 * A class depicting some location in geography like home, work, school, park, mall etc.
 * 
 * @author sunil
 *
 */
public class MacroLocation extends MicroLocation {

	private String address;
	private String city;
	private String state;
	private String country;
	private String postalCode;
	private String knownName;
	private String taggedName;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getKnownName() {
		return knownName;
	}

	public void setKnownName(String knownName) {
		this.knownName = knownName;
	}

	public String getTaggedName() {
		return taggedName;
	}

	public void setTaggedName(String taggedName) {
		this.taggedName = taggedName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result
				+ ((knownName == null) ? 0 : knownName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(latitude);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(longitude);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ ((postalCode == null) ? 0 : postalCode.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result
				+ ((taggedName == null) ? 0 : taggedName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		MacroLocation other = (MacroLocation) obj;
		if (address == null) {
			if (other.address != null) {
				return false;
			}
		} else if (!address.equals(other.address)) {
			return false;
		}
		if (city == null) {
			if (other.city != null) {
				return false;
			}
		} else if (!city.equals(other.city)) {
			return false;
		}
		if (country == null) {
			if (other.country != null) {
				return false;
			}
		} else if (!country.equals(other.country)) {
			return false;
		}
		if (knownName == null) {
			if (other.knownName != null) {
				return false;
			}
		} else if (!knownName.equals(other.knownName)) {
			return false;
		}
		if (Double.doubleToLongBits(latitude) != Double
				.doubleToLongBits(other.latitude)) {
			return false;
		}
		if (Double.doubleToLongBits(longitude) != Double
				.doubleToLongBits(other.longitude)) {
			return false;
		}
		if (postalCode == null) {
			if (other.postalCode != null) {
				return false;
			}
		} else if (!postalCode.equals(other.postalCode)) {
			return false;
		}
		if (state == null) {
			if (other.state != null) {
				return false;
			}
		} else if (!state.equals(other.state)) {
			return false;
		}
		if (taggedName == null) {
			if (other.taggedName != null) {
				return false;
			}
		} else if (!taggedName.equals(other.taggedName)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return String
				.format("Location [latitude=%s, longitude=%s, address=%s, city=%s, state=%s, country=%s, postalCode=%s, knownName=%s, taggedName=%s]",
						latitude, longitude, address, city, state, country,
						postalCode, knownName, taggedName);
	}

}
