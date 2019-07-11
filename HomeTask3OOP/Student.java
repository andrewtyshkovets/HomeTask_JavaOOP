package com.gmail.tas;

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

	@Override
	public String toString() {
		return "Student [" + super.toString() + " universuty=" + universuty + ", faculty=" + faculty
				+ ", numbOfCreditBook=" + numbOfCreditBook + "] \n";
	}

}
