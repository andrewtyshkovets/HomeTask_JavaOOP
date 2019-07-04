package com.gmail.tas;

public class Main {

	public static void main(String[] args) {
		
		Triangle tr1 = new Triangle(8,12,16);
		String text = String.format("%.3f", tr1.getSquare());
		System.out.print("Square is: "+text+" cm^2");

	}

}
