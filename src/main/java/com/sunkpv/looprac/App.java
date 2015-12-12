package com.sunkpv.looprac;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.sunkpv.looprac.model.CarPoolConfig;
import com.sunkpv.looprac.model.User;
import com.sunkpv.looprac.model.builder.LocationBuilder;
import com.sunkpv.looprac.model.builder.RecurringCarPoolConfigBuilder;
import com.sunkpv.looprac.model.builder.UserBuilder;

/**
 * CarPool App world!
 * 
 */
public class App {
	public static void main(String[] args) {
		testCarPoolBuilder();
	}

	static void testCarPoolBuilder() {

		RecurringCarPoolConfigBuilder builder = new RecurringCarPoolConfigBuilder();

		List<User> users = new ArrayList<User>();
		UserBuilder u1 = new UserBuilder();
		for (int i = 1; i <= 10; i++) {
			u1.setId(i).setEmail(String.format("u%d@gmail.com", i))
					.setName(String.format("User %d", i))
					.setPhoneNumber(String.format("phoneNumber%d", i));
			users.add(u1.getUser());
		}

		Iterator<User> it = users.iterator();
		while (it.hasNext()) {
			builder.addUser(it.next());
		}

		LocationBuilder locBuilder1 = new LocationBuilder();
		locBuilder1.setLatitude(23.4445).setLongitude(45.55644)
				.setTaggedName("home").setAddress("39, Sowaparnika")
				.setCity("BLR");

		LocationBuilder locBuilder2 = new LocationBuilder();
		locBuilder2.setLatitude(24.4445).setLongitude(44.55644)
				.setTaggedName("work")
				.setAddress("Level V, Prestige Solitaire").setCity("BLR");

		builder.setStartDate(new Date(2016, 1, 1, 9, 0))
				.setEndDate(new Date(2016, 1, 5, 18, 0))
				.setStartLocation(locBuilder1.getLocation())
				.setEndLocation(locBuilder2.getLocation());

		CarPoolConfig carPool = builder.getCarPoolConfig();
		System.out.println(carPool);
	}
}
