package com.sunkpv.looprac.model;

import java.util.Collection;
import java.util.HashSet;

/**
 * Class to represent a car-pool plan. Contains users, the route for the journey and the pool plan.
 *  
 * ADMIN(user) => car-pooling with => USERS => traveling to a destination set by a => ROUTE   
 * 
 * @author sunil
 *
 */
public class CarPoolConfig {
	
	private Route route;
	private HashSet<User> users;
	/** the owner/admin of the car for this CarPool instance */
	private User admin;

	public CarPoolConfig() {

		users = new HashSet<User>();
		route = new Route();
	}

	public void setRoute(Route route) {
		this.route = route;
	}
	
	public Route getRoute() {
		return route;
	}

	public void setStartLocation(MacroLocation startPoint) {
		route.setStartPoint(startPoint);
	}

	public void setEndLocation(MacroLocation endPoint) {
		route.setEndPoint(endPoint);
	}

	/**
	 * Adds a new user to this car pooling instance. If there are no users, then
	 * the first user will be set as the car owner of this car pool instance.
	 * 
	 * @param user
	 * @return
	 * @throws LoopRacException 
	 */
	public boolean addUser(User user) throws LoopRacException {
		if(user == null) {
			throw new LoopRacException("User instance cannot be null");
		}
		if(users.isEmpty()) {
			admin = user;
		}
		return users.add(user);
	}

	public User getAdmin() {
		return admin;
	}

	public boolean removeUser(User user) {
		return users.remove(user);
	}

	public boolean removeUsers(Collection<User> users) {
		return users.removeAll(users);
	}

	public void clearUsers() {
		users.clear();
	}

	public HashSet<User> getUsers() {
		return users;
	}

	public void setUsers(HashSet<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return String.format(
				"CarPoolConfig [%s, admin=%s, users=%s]",
				route, admin, users);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((admin == null) ? 0 : admin.hashCode());
		result = prime * result + ((route == null) ? 0 : route.hashCode());
		result = prime * result + ((users == null) ? 0 : users.hashCode());
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
		CarPoolConfig other = (CarPoolConfig) obj;
		if (admin == null) {
			if (other.admin != null)
				return false;
		} else if (!admin.equals(other.admin))
			return false;
		if (route == null) {
			if (other.route != null)
				return false;
		} else if (!route.equals(other.route))
			return false;
		if (users == null) {
			if (other.users != null)
				return false;
		} else if (!users.equals(other.users))
			return false;
		return true;
	}

}
