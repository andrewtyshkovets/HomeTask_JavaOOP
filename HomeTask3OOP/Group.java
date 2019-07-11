package com.gmail.tas;

import java.util.Arrays;

import com.gmail.tas.exeptions.OutOfRangeException;

public class Group {

	private Student[] groupOfStudent = new Student[10];

	public Group(Student[] groupOfStudent) {
		super();
		this.groupOfStudent = groupOfStudent;
	}

	public Group() {
		// TODO Auto-generated constructor stub
	}

	public Student[] getGroupOfStudent() {
		return groupOfStudent;
	}

	public Student getStudent(int n) {
		int numb = 0;
		try {
			numb = n;
			if (numb >= 10) {
				throw new OutOfRangeException("Your index is out of range");
			}
			return groupOfStudent[numb];
		} catch (OutOfRangeException e) {
			System.out.println(e.getExceptionMessage());
			return null;
		}

	}

	public void setGroupOfStudent(Student[] groupOfStudent) {
		this.groupOfStudent = groupOfStudent;
	}

	/**
	 * This method will add student to the group on the current place n
	 * 
	 * @param student //Student to add
	 * @param n       //Number of index in array of students, where student will be
	 *                added
	 */
	public void setStudent(Student student, int n) {
		try {
			if (n >= 10) {
				throw new OutOfRangeException("Your index is out of range");
			} else {
				groupOfStudent[n] = student;
			}
		} catch (OutOfRangeException e) {
			System.out.println(e.getExceptionMessage());

		}

	}

	/**
	 * This method will add student to the group on the first empty place
	 * 
	 * @param student
	 */
	public void setStudent(Student student) {
		try {
			for (int i = 0; i < groupOfStudent.length; i++) {
				if (groupOfStudent[i] == null) {
					if (i >= 10) {
						throw new OutOfRangeException("Your index is out of range");
					} else {
						groupOfStudent[i] = student;
						break;
					}
				}
			}
		} catch (OutOfRangeException e) {
			System.out.println(e.getExceptionMessage());
		} catch (NullPointerException e) {

		}

	}

	/**
	 * This method will delete student from the group from the current place n
	 * 
	 * @param n //Place from where you want to delete student
	 */
	public void deleteStudent(int n) {
		try {
			if (n >= 10) {
				throw new OutOfRangeException("Your index is out of range");
			}
			groupOfStudent[n] = null;
		} catch (OutOfRangeException e) {
			System.out.println(e.getExceptionMessage());
		}
	}

	/**
	 * This method will delete student from the group by surname
	 * 
	 * @param surname
	 */
	public void deleteStudent(String surname) {
		String surnameLowerCase;
		for (int i = 0; i < groupOfStudent.length; i++) {
			try {
				surnameLowerCase = groupOfStudent[i].getSurname().toLowerCase();
				if (surname.equals(groupOfStudent[i].getSurname()) || surname.equals(surnameLowerCase)) {
					groupOfStudent[i] = null;
				}
			} catch (NullPointerException e) {

			}
		}
	}

	/**
	 * This method will find student in the group
	 * 
	 * @param surname //Surname of the student
	 * @return
	 */
	public Student findStudent(String surname) {
		String surnameLowerCase;
		for (int i = 0; i < groupOfStudent.length; i++) {
			try {
				surnameLowerCase = groupOfStudent[i].getSurname().toLowerCase();
				if (surname.equals(groupOfStudent[i].getSurname()) || surname.equals(surnameLowerCase)) {
					return groupOfStudent[i];
				}
			} catch (NullPointerException e) {

			}
		}
		return null;
	}

	/**
	 * This method will parse String to char array.
	 * 
	 * @param surname
	 * @return
	 */
	public static char[] surnameToChar(String surname) {
		try {
			char[] a = surname.toCharArray();
			return a;
		} catch (NullPointerException e) {
			System.out.println(e);
			return null;
		}
	}

	/**
	 * This method will sort student by their surnames
	 * 
	 * @param groupOfStudent
	 */
	public static Student[] sortBySurname(Student[] groupOfStudent) {

		String[] surnamesToLowerCase = new String[groupOfStudent.length];
		for (int i = 0; i < groupOfStudent.length; i++) {
			try {
				surnamesToLowerCase[i] = groupOfStudent[i].getSurname().toLowerCase();
			} catch (NullPointerException e) {
				surnamesToLowerCase[i] = "wwwwwwwwwwwwwww";
			}
		}

		char[][] surnames = new char[groupOfStudent.length][];
		for (int i = 0; i < surnames.length; i++) {
			char[] surname = surnameToChar(surnamesToLowerCase[i]);
			surnames[i] = surname;
		}
		Student temp1 = new Student();
		for (int o = 0; o < surnames.length; o++) {
			for (int i = 0; i < surnames.length - 1; i++) {
				char[] temp = new char[surnames.length];
				for (int j = 0; j < surnames[i].length; j++) {
					if (surnames[i][j] != surnames[i + 1][j]) {
						if (surnames[i][j] >= surnames[i + 1][j]) {
							temp = surnames[i + 1];
							surnames[i + 1] = surnames[i];
							surnames[i] = temp;
							temp1 = groupOfStudent[i + 1];
							groupOfStudent[i + 1] = groupOfStudent[i];
							groupOfStudent[i] = temp1;
							break;
						} else {
							break;
						}
					}
				}
			}
		}
		return groupOfStudent;
	}

	@Override
	public String toString() {
		sortBySurname(getGroupOfStudent());
		return "Group [groupOfStudent=\n" + Arrays.toString(groupOfStudent) + "]";
	}

}
