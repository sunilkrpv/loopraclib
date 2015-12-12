package com.sunkpv.looprac.model;

/**
 * Configuration class containing CarPool instance for a particular period
 * 
 * @author sunil
 * 
 */
public class RecurringCarPoolConfig extends CarPoolConfig {

	private Period period;

	public Period getPeriod() {
		return period;
	}

	public void setPeriod(Period period) {
		this.period = period;
	}

	@Override
	public String toString() {
		return String.format(
				"RecurringCarPoolConfig [%s, period=%s]",
				super.toString(), period);
	}

}
