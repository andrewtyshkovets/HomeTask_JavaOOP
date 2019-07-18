package com.gmail.tas;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		File sourceCatalog = new File("D:\\Java_Project\\Hometask8e");
		File destinationCatalog = new File("D:\\Java_Project\\Hometask5OOP\\files");
		MyFileFilter mFF = new MyFileFilter("docx", "txt");
		String name = null;
		if (sourceCatalog.isDirectory() && destinationCatalog.isDirectory()) {
			File[] fileList = sourceCatalog.listFiles(mFF);
			for (int i = 0; i < fileList.length; i++) {
				name = fileList[i].getName();
				File copyFile = new File("D:\\Java_Project\\Hometask5OOP\\files\\" + name);
				System.out.println("Copying of file: " + name + " is over");
				try {
					IOService.fileCopy(fileList[i], copyFile);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
