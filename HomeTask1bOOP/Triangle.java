package com.gmail.tas;

public class Triangle {
	private double side1;
	private double side2;
	private double side3;

	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public Triangle() {

	}

	public double getSquare() {
		double a = this.side1;
		double b = this.side2;
		double c = this.side3;
		double pivPerymetr = (a + b + c) / 2;
		double square = Math.sqrt(pivPerymetr * (pivPerymetr - a) * (pivPerymetr - b) * (pivPerymetr - c));
		return square;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

}
