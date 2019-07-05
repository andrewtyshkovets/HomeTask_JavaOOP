package com.gmail.tas;

public class Main {

	public static void main(String[] args) {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(0, 4);
		Point p3 = new Point(4, 4);
		
		
		Triangle tr1 = new Triangle(p1, p2, p3);
		System.out.println(tr1);
		System.out.println(tr1.getPerimetr());
		System.out.println(tr1.getArea());
		
	}

}
