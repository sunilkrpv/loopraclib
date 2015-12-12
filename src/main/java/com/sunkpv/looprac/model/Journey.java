package com.sunkpv.looprac.model;

import java.util.Date;


/**
 * An object to representing a journey covered by a CarPool instance
 * on a particular date.
 * 
 * @author sunil
 *
 */
public class Journey {

	private int id;
	// the journey date
	private Date date;
	private CarPoolConfig carPool;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CarPoolConfig getCarPoolConfig() {
		return carPool;
	}

	public void setCarPoolConfig(CarPoolConfig carPool) {
		this.carPool = carPool;
	}
	
	public Date getDate() {
		return date;
	}

	public void setCarPool(Date date) {
		this.date = date;
	} 

}
