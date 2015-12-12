/**
 * 
 */
package com.sunkpv.looprac.model.builder;

import java.util.Date;

import com.sunkpv.looprac.model.Period;

/**
 * @author sunil
 *
 */
public class RecurringCarPoolConfigBuilder extends CarPoolConfigBuilder {

	private Period period;
	
	public RecurringCarPoolConfigBuilder() {
		super();
		period = new Period();
	}
	
	public Period getCarPoolPeriod() {
		return period;
	}
	
	public RecurringCarPoolConfigBuilder setStartDate(Date startDate) {
		period.setStartDate(startDate);
		return this;
	}

	public RecurringCarPoolConfigBuilder setEndDate(Date endDate) {
		period.setEndDate(endDate);
		return this;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((period == null) ? 0 : period.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		RecurringCarPoolConfigBuilder other = (RecurringCarPoolConfigBuilder) obj;
		if (period == null) {
			if (other.period != null)
				return false;
		} else if (!period.equals(other.period))
			return false;
		return true;
	}	
	
}
