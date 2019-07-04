package com.gmail.tas;

public class Main {

	public static void main(String[] args) {
		Vector3d v1 = new Vector3d(-1, 2, -2);
		Vector3d v2 = new Vector3d(2, 1, -1);
		Vector3d summ = new Vector3d();
		Vector3d scMult = new Vector3d();
		Vector3d vecMult = new Vector3d();
		summ = summ.summ(v1, v2);
		vecMult = vecMult.vectorMultiply(v1, v2);
		System.out.println(
				"Summury vector has coordinates: X=" + summ.getX() + "; Y=" + summ.getY() + "; Z=" + summ.getZ());
		System.out.println("scMult = " + scMult.scalarMultiply(v1, v2));
		System.out.println("vector multiply: X=" + vecMult.getX() + "; Y=" + vecMult.getY() + "; Z=" + vecMult.getZ());
	}

}
