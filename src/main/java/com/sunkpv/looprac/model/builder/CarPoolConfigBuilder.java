package com.sunkpv.looprac.model.builder;

import java.util.Collection;

import com.sunkpv.looprac.exception.LoopRacException;
import com.sunkpv.looprac.model.CarPoolConfig;
import com.sunkpv.looprac.model.MacroLocation;
import com.sunkpv.looprac.model.Route;
import com.sunkpv.looprac.model.User;

/**
 * Follows the Builder pattern to build a CarPool instance.
 * 
 * @author sunil
 *
 */
public class CarPoolConfigBuilder {

	private CarPoolConfig carPoolConfig;

	public CarPoolConfigBuilder() {
		carPoolConfig = new CarPoolConfig();
	}

	public CarPoolConfig getCarPoolConfig() {
		return this.carPoolConfig;
	}

	public CarPoolConfigBuilder setStartLocation(MacroLocation startPoint) {
		carPoolConfig.setStartLocation(startPoint);
		return this;
	}

	public CarPoolConfigBuilder setEndLocation(MacroLocation endPoint) {
		carPoolConfig.setEndLocation(endPoint);
		return this;
	}
	
	public boolean addUser(User user) {
		try {
			return carPoolConfig.addUser(user);
		} catch (LoopRacException e) {
			// TODO Auto-generated catch block
			return false;
		}
	}
	
	public boolean removeUser(User user) {
		return carPoolConfig.removeUser(user);
	}
	
	public boolean removeUsers(Collection<User> users) {
		return carPoolConfig.removeUsers(users);
	}
	
	public void clearUsers() {
		carPoolConfig.clearUsers();
	}
	
	public void setRoute(Route route) throws LoopRacException {
		if(route == null) {
			throw new LoopRacException("Route instance cannot be null");
		}
		Route prevRoute = carPoolConfig.getRoute();
		if(prevRoute == null) {
			carPoolConfig.setRoute(route);
		}
		else {
			prevRoute = route.clone();
			carPoolConfig.setRoute(prevRoute);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carPoolConfig == null) ? 0 : carPoolConfig.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarPoolConfigBuilder other = (CarPoolConfigBuilder) obj;
		if (carPoolConfig == null) {
			if (other.carPoolConfig != null)
				return false;
		} else if (!carPoolConfig.equals(other.carPoolConfig))
			return false;
		return true;
	}
	
}
