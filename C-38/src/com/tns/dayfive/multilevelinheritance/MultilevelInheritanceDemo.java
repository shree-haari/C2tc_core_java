package com.tns.dayfive.multilevelinheritance;

public class MultilevelInheritanceDemo {
	public static void main(String[] args) {
		City city = new City();
		city.setCityName("Arivu");
		city.setArea(264.2f);
		city.setStateName("TamilNadu");
		city.setLanguage("Tamil");
		city.setCountryName("India");
		city.setCapital("Delhi");
		System.out.println(city);
		}


}
