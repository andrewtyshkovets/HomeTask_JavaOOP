package com.gmail.tas;

public class Triangle extends Point {

	Point p1 = new Point();
	Point p2 = new Point();
	Point p3 = new Point();

	
	public Triangle(Point p1, Point p2, Point p3) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}

	public Point getP3() {
		return p3;
	}

	public void setP3(Point p3) {
		this.p3 = p3;
	}

	@Override
	public double getPerimetr() {
		double perim = 0;
		double a = getSide(p1, p2);
		double b = getSide(p1, p3);
		double c = getSide(p2, p3);
		perim = a + b + c;
		return perim;
	}
	@Override
	public double getArea() {
		double area = 0;
		double pivP;
		pivP = getPerimetr()/2;
		double a = getSide(p1, p2);
		double b = getSide(p1, p3);
		double c = getSide(p2, p3);
		area =Math.sqrt(pivP*((pivP-a)*(pivP-b)*(pivP-c)));
		return area;
	}

	@Override
	public String toString() {
		return "Triangle [p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + "]";
	}
	
	

}
