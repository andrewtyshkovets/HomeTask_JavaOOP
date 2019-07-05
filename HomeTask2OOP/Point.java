package com.gmail.tas;

public class Point extends Shape{
	private double x;
	private double y;

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point() {
		// TODO Auto-generated constructor stub
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	@Override
	public double getPerimetr() {
		return 0;
	}
	@Override
	public double getArea() {
		return 0;
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
