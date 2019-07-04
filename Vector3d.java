package com.gmail.tas;

public class Vector3d {

	private double x;
	private double y;
	private double z;

	public Vector3d(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Vector3d() {
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

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public Vector3d summ(Vector3d a, Vector3d b) {
		Vector3d summ = new Vector3d();
		double x1 = a.getX();
		double y1 = a.getY();
		double z1 = a.getZ();
		double x2 = b.getX();
		double y2 = b.getY();
		double z2 = b.getZ();
		double x3 = (x2 + x1);
		double y3 = (y2 + y1);
		double z3 = (z2 + z1);
		summ.setX(x3);
		summ.setY(y3);
		summ.setZ(z3);
		return summ;
	}

	public double scalarMultiply(Vector3d a, Vector3d b) {
		double multyply = 0;
		double x1 = a.getX();
		double y1 = a.getY();
		double z1 = a.getZ();
		double x2 = b.getX();
		double y2 = b.getY();
		double z2 = b.getZ();
		multyply = (x1 * x2) + (y1 * y2) + (z1 * z2);
		return multyply;
	}

	public Vector3d vectorMultiply(Vector3d a, Vector3d b) {
		Vector3d vecMult = new Vector3d();
		double x1 = a.getX();
		double y1 = a.getY();
		double z1 = a.getZ();
		double x2 = b.getX();
		double y2 = b.getY();
		double z2 = b.getZ();
		double x3 = (y1 * z2 - z1 * y2);
		double y3 = (z1 * x2 - x1 * z2);
		double z3 = (x1 * y2 - y1 * x2);
		vecMult.setX(x3);
		vecMult.setY(y3);
		vecMult.setZ(z3);
		return vecMult;

	}

}
