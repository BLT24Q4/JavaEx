package com.javaex.io.charstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class Thief {
	String name;
	float height;
	float weight;
	
	public Thief(String name, float height, float weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Thief [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}
}

public class ScannerEx {
	static final String rootPath = 
			System.getProperty("user.dir") + "\\files\\";
	static final String filename =
			rootPath + "thieves.txt";
	
	public static void main(String[] args) {
		File file = new File(filename);
		
		try (
			Scanner scanner = new Scanner(file);
		) {
			while(scanner.hasNextLine()) {
				String name = scanner.next();
				float height = scanner.nextFloat();
				float weight = scanner.nextFloat();
				
				Thief thief = new Thief(name, height, weight);
				System.out.println(thief);
				scanner.nextLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
	}

}
