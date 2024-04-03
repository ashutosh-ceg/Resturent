package com.gl.resturent;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EventMaster {

	public static void populateGuests(List guestList) {

		System.out.println(guestList);
	}

	public static void filterGuest(List<Guest> guestList) {

		List<Guest> filterdGuest1 = guestList.stream()
				.filter(g -> (g.getCountry().equals(Country.Spain) && g.getHobby().equals(Hobby.Dance)))
				.collect(Collectors.toList());
		filterdGuest1.forEach(guest -> System.out.println("Name " + guest.getName() + guest.getAge()));

		System.out.println(filterdGuest1);

		List<Guest> filterdGuest2 = guestList.stream().filter(
				g -> (g.getCountry().equals(Country.Spain) && g.getHobby().equals(Hobby.Drink) && g.getAge() > 18))
				.collect(Collectors.toList());

		System.out.println(filterdGuest2);

		List<Guest> filterdGuest3 = guestList.stream()
				.filter(g -> (g.getCountry().equals(Country.France) && g.getHobby().equals(Hobby.WaterSports)))
				.collect(Collectors.toList());

		System.out.println(filterdGuest3);

		List<Guest> filterdGuest4 = guestList.stream().filter(g -> (g.getAge() > 70)).collect(Collectors.toList());

		System.out.println(filterdGuest4);

		List<Guest> filterdGuest5 = guestList.stream()
				.filter(g -> (g.getLanguage().equals(Language.Chinese) && g.getHobby().equals(Hobby.Read)))
				.collect(Collectors.toList());

		System.out.println(filterdGuest5);

	}

	public static void main(String[] args) {

		List<Guest> guestList = new ArrayList<Guest>();
		guestList.add(new Guest("Shinjo", "28-07-1980", Country.China, Language.Chinese, Hobby.Eat, 42));
		guestList.add(new Guest("John", "30-05-1990", Country.USA, Language.English, Hobby.Drink, 32));
		guestList.add(new Guest("Ankit", "2-10-2005", Country.France, Language.French, Hobby.Eat, 17));
		guestList.add(new Guest("Amit", "01-01-1950", Country.Germany, Language.German, Hobby.Dance, 72));
		guestList.add(new Guest("Ashwin", "10-10-1970", Country.Spain, Language.Spanish, Hobby.Read, 52));
		guestList.add(new Guest("Anmol", "10-10-1970", Country.Spain, Language.Spanish, Hobby.Dance, 52));
		guestList.add(new Guest("Ankit", "2-10-2000", Country.France, Language.French, Hobby.WaterSports, 22));
		guestList.add(new Guest("Kim", "28-07-1940", Country.China, Language.Chinese, Hobby.Read, 82));
		populateGuests(guestList);
		filterGuest(guestList);

	}

}
