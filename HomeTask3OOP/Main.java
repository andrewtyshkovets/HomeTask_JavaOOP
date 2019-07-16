package com.gmail.tas;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;

import com.gmail.tas.SurnameComparator;;

public class Main {

	public static void main(String[] args) {
		Human h1 = new Human("Andrew", "Tyshkovets", "03/10/1994");
		System.out.println(h1);

		Student s1 = new Student("Andrew", "Tyshkovets", "03/10/1994", "KPI", "IFF", 123451);
		Student s2 = new Student("Andrew", "Walker", "03/10/1994", "KPI", "IFF", 123452);
		Student s3 = new Student("Andrew", "Asgsdg", "03/10/1994", "KPI", "IFF", 123455);
		Student s4 = new Student("Andrew", "dfgdsfsg", "03/10/1976", "KPI", "IFF", 123459);
		Student s5 = new Student("Andrew", "dagdsfsg", "03/10/2018", "KPI", "IFF", 123476);
		Student s6 = new Student("Andrew", "daddsfsg", "03/10/2004", "KPI", "IFF", 123456);
		System.out.println(s1);
		Student[] gr = new Student[10];
		for (int i = 0; i < 9; i++) {
			gr[i] = s1;
		}
		Group gr1 = new Group(gr);
		gr1.setStudent(s2, 3);
		gr1.setStudent(s3, 5);
		gr1.setStudent(s4, 8);
		gr1.setStudent(s5, 9);
		gr1.deleteStudent(5);
		gr1.sortByNumber(gr, false);
		Group gr2 = new Group(gr1.prizyv(gr));
		System.out.println(gr2);
		//System.out.println(gr1);
		//System.out.println(s1.getStudentsAge(s1));

	}

}
