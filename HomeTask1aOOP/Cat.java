package com.gmail.tas;

public class Cat {
	private String name;
	private String color;
	private double length;
	private int age;
	
	public void meow() {
		System.out.println("MEOW-MEOW");
	}
	
	public void Wisdom() {
		System.out.println("The world is full of suffering, it is full also of the overcoming of it.");
	}
	
	public Cat() {
	}
	
	public Cat(String name, String color, double length, int age) {
		super();
		this.name = name;
		this.color = color;
		this.length = length;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
