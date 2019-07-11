package com.gmail.tas;

public class Main {

	public static void main(String[] args) {
		Human h1 = new Human("Andrew", "Tyshkovets", "03/10/1994");
		System.out.println(h1);

		Student s1 = new Student("Andrew", "Tyshkovets", "03/10/1994", "KPI", "IFF", 123456);
		Student s2 = new Student("Andrew", "Walker", "03/10/1994", "KPI", "IFF", 123456);
		Student s3 = new Student("Andrew", "Asgsdg", "03/10/1994", "KPI", "IFF", 123456);
		Student s4 = new Student("Andrew", "dfgdsfsg", "03/10/1994", "KPI", "IFF", 123456);
		Student s5 = new Student("Andrew", "dagdsfsg", "03/10/1994", "KPI", "IFF", 123456);
		Student s6 = new Student("Andrew", "daddsfsg", "03/10/1994", "KPI", "IFF", 123456);
		System.out.println(s1);
		Student[] gr = new Student[10];
		for (int i = 0; i < 10; i++) {
			gr[i] = s1;
		}
		Group gr1 = new Group(gr);
		gr1.setStudent(s2, 3);
		gr1.setStudent(s3, 5);
		gr1.setStudent(s4, 8);
		gr1.setStudent(s5, 9);
		gr1.deleteStudent(5);
		System.out.println(gr1);
		System.out.println(gr1.findStudent("walker"));
		System.out.println(gr1);

	}

}
