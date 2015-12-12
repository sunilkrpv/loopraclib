package com.sunkpv.looprac.model;

/**
 * A typical route for a journey.
 * 
 * @author sunil
 *
 */
public class Route implements Cloneable {

	private int id;
	private MacroLocation startPoint;
	private MacroLocation endPoint;
	private int distance;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public MacroLocation getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(MacroLocation startPoint) {
		this.startPoint = startPoint;
	}

	public MacroLocation getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(MacroLocation endPoint) {
		this.endPoint = endPoint;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + distance;
		result = prime * result
				+ ((endPoint == null) ? 0 : endPoint.hashCode());
		result = prime * result + id;
		result = prime * result
				+ ((startPoint == null) ? 0 : startPoint.hashCode());
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
		Route other = (Route) obj;
		if (distance != other.distance) {
			return false;
		}
		if (endPoint == null) {
			if (other.endPoint != null) {
				return false;
			}
		} else if (!endPoint.equals(other.endPoint)) {
			return false;
		}
		if (id != other.id) {
			return false;
		}
		if (startPoint == null) {
			if (other.startPoint != null) {
				return false;
			}
		} else if (!startPoint.equals(other.startPoint)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return String.format(
				"Route [id=%s, startPoint=%s, endPoint=%s, distance=%s]", id,
				startPoint, endPoint, distance);
	}
	
	@Override
	public Route clone() {
		try {
			return (Route)super.clone();
		}
		catch (CloneNotSupportedException e) {		
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

}
