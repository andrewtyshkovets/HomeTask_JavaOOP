package com.gmail.tas;

public abstract class Shape {
	abstract public double getPerimetr();

	abstract public double getArea();

	public double getSide(Point p1, Point p2) {
		double side = 0;
		double x1 = p1.getX();
		double x2 = p2.getX();
		double y1 = p1.getY();
		double y2 = p2.getY();
		side = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
		return side;
	}
}
