package com.gmail.tas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Human {

	private String name;
	private String surname;
	private Date dateOfBirth;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Human(String name, String surname, String date) {
		super();
		this.name = name;
		this.surname = surname;
		try {
			dateOfBirth = sdf.parse(date);
		} catch (ParseException e) {
			System.out.println(e);
		}
	}

	public Human() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		String text = sdf1.format(dateOfBirth);
		return "name=" + name + ", surname=" + surname + ", dateOfBirth=" + text;
	}

}
