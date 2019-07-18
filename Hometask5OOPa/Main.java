package com.gmail.tas;

import java.io.File;

import java.io.FileNotFoundException;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		File file1 = new File("test1.txt");
		File file2 = new File("test2.txt");
		String string1 = new String();
		String string2 = new String();
		StringBuilder resultString = new StringBuilder();
		try {
			string1 = readMyFile(file1);
			string2 = readMyFile(file2);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String[] file1Arr = string1.split(" ");
		String[] file2Arr = string2.split(" ");

		for (int i = 0; i < file1Arr.length; i++) {
			int word = 0;
			for (int j = 0; j < file2Arr.length; j++) {
				if (file1Arr[i].equals(file2Arr[j])) {
					word = 1;
				}
			}
			if (word == 0) {
				resultString.append(file1Arr[i]).append(" ");
			}
		}
		for (int i = 0; i < file2Arr.length; i++) {
			int word = 0;
			for (int j = 0; j < file1Arr.length; j++) {
				if (file2Arr[i].equals(file1Arr[j])) {
					word = 1;
				}
			}
			if (word == 0) {
				resultString.append(file2Arr[i]).append(" ");
			}
		}

		System.out.println(string1);
		System.out.println(string2);
		System.out.println(Arrays.toString(file1Arr));
		System.out.println(Arrays.toString(file2Arr));
		System.out.print(resultString);

		try (PrintWriter a = new PrintWriter("c.txt")) {
			a.println(resultString);
		} catch (FileNotFoundException e) {
			System.out.println("ERROR FILE WRITE");
		}

	}

	public static String readMyFile(File file) throws FileNotFoundException, IOException {
		StringBuilder string1 = new StringBuilder();
		try (Scanner sc = new Scanner(file)) {
			for (; sc.hasNextLine();) {
				string1.append(sc.nextLine()).append(System.lineSeparator());
			}
		}
		return string1.toString();
	}

}
