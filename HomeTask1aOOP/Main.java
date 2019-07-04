package com.gmail.tas;

public class Main {

	public static void main(String[] args) {
		Cat cat1 = new Cat("Murzik", "ginger", 34, 5);
		Cat cat2 = new Cat("Chernysh", "black", 45, 6);
		
		System.out.print(cat1.getName()+" says: ");
		cat1.meow();
		System.out.print(cat2.getName()+" says: ");
		cat2.Wisdom();

	}

}
