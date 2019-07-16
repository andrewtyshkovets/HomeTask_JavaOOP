package com.gmail.tas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import javax.swing.JOptionPane;

import com.gmail.tas.exeptions.NegativeValueExeption;
import com.gmail.tas.exeptions.OutOfRangeException;

public class Group implements Voenkom {

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
						return;
					}
				}
			}
		} catch (OutOfRangeException e) {
			System.out.println(e.getExceptionMessage());
		} catch (NullPointerException e) {

		}

	}

	public void setStudentInteractive() {
		Student student = new Student();
		String name = JOptionPane.showInputDialog("Input name");
		String surname = JOptionPane.showInputDialog("Input surname");
		String universuty = JOptionPane.showInputDialog("Input University");
		String faculty = JOptionPane.showInputDialog("Input faculty");
		int numbOfCreditBook;
		Date dateOfBirth;
		String date = JOptionPane.showInputDialog("Input date of birth dd/MM/yyyy");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			numbOfCreditBook = Integer.valueOf(JOptionPane.showInputDialog("Input the number of credit book"));
			if (numbOfCreditBook < 0) {
				throw new NegativeValueExeption("Invalid number of credit book");
			}
			dateOfBirth = sdf.parse(date);
			student.setName(name);
			student.setSurname(surname);
			student.setDateOfBirth(dateOfBirth);
			student.setUniversuty(universuty);
			student.setFaculty(faculty);
			student.setNumbOfCreditBook(numbOfCreditBook);

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Error number format");
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(null, "Error number format");
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Error null field");
		} catch (NegativeValueExeption e) {
			JOptionPane.showMessageDialog(null, e.getExceptionMessage());
		}

		try {
			for (int i = 0; i < groupOfStudent.length; i++) {
				if (groupOfStudent[i] == null) {
					if (i >= 10) {
						throw new OutOfRangeException("Your index is out of range");
					} else {
						groupOfStudent[i] = student;
						return;
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
	 * @param reverce
	 */
	public static void sortBySurname(Student[] groupOfStudent, boolean reverce) {
		Arrays.sort(groupOfStudent, new SurnameComparator(reverce));
	}
	/**
	 * This method will sort student by the number of credit book
	 * 
	 * @param groupOfStudent
	 * @param reverce
	 */
	public void sortByNumber(Student[] groupOfStudent, boolean reverce) {
		Arrays.sort(groupOfStudent, new CreditBookComparator(reverce));
	}
	
	public void printArray (Object[] o) {
		for (int i = 0; i < o.length; i++) {
			
		}
	}
	
	@Override
	public Student[] prizyv(Student[] groupOfStudent) {
		Student[] goden = new Student[groupOfStudent.length];
		int j = 0;
		try {
		for (int i = 0; i < groupOfStudent.length; i++) {
			if(groupOfStudent[i].getStudentsAge(groupOfStudent[i])>18 && groupOfStudent[i].getStudentsAge(groupOfStudent[i])<27) {
				goden[j]=groupOfStudent[i];
				j+=1;
			}
		}
		} catch (NullPointerException e) {
		}
		return goden;
	}
	
	

	@Override
	public String toString() {
		
		return "Group [groupOfStudent=\n" + Arrays.toString(groupOfStudent) + "]";
	}

}
