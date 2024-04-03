package com.gl.resturent;

public class Guest {

	private String name;
	private String dob;
	private Country country;
	private Language language;
	private Hobby hobby;
	private int age;

	public Guest() {
		super();
	}

	public Guest(String name, String dob, Country country, Language language, Hobby hobby, int age) {
		super();
		this.name = name;
		this.dob = dob;
		this.country = country;
		this.language = language;
		this.hobby = hobby;
		this.age = age;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public Hobby getHobby() {
		return hobby;
	}

	public void setHobby(Hobby hobby) {
		this.hobby = hobby;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Guest [name=" + name + ", dob=" + dob + ", country=" + country + ", language=" + language + ", hobby="
				+ hobby + ", age=" + age + "]";
	}

}
