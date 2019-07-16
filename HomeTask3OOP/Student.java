package com.gmail.tas;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Student extends Human {
	private String universuty;
	private String faculty;
	private int numbOfCreditBook;

	public Student(String name, String surname, String date, String universuty, String faculty, int numbOfCreditBook) {
		super(name, surname, date);
		this.universuty = universuty;
		this.faculty = faculty;
		this.numbOfCreditBook = numbOfCreditBook;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public String getUniversuty() {
		return universuty;
	}

	public void setUniversuty(String universuty) {
		this.universuty = universuty;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public int getNumbOfCreditBook() {
		return numbOfCreditBook;
	}

	public void setNumbOfCreditBook(int numbOfCreditBook) {
		this.numbOfCreditBook = numbOfCreditBook;
	}
	
	public int getStudentsAge(Student student) {
		Date date = new Date();
		Calendar currentDate = getCalendar(date);
		Calendar birthDate = getCalendar(student.getDateOfBirth());
		int diff = currentDate.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
	    if (birthDate.get(Calendar.MONTH) > currentDate.get(Calendar.MONTH) || 
	        (birthDate.get(Calendar.MONTH) == currentDate.get(Calendar.MONTH) && birthDate.get(Calendar.DATE) > currentDate.get(Calendar.DATE))) {
	        diff--;
	    }
	    return diff;
    }
	
	public static Calendar getCalendar(Date date) {
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(date);
	    return cal;
	}
	
	

	@Override
	public String toString() {
		return "Student [" + super.toString() + " universuty=" + universuty + ", faculty=" + faculty
				+ ", numbOfCreditBook=" + numbOfCreditBook + "] \n";
	}

}
