package com.javaex.io.charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx {
	//	프로젝트 내의 files 디렉터리 위치
	static final String rootPath = 
			System.getProperty("user.dir") + "\\files\\";
	static final String filename = rootPath + "char.txt";
	
	public static void main(String[] args) {
//		writerTest();
		readerTest();
	}

	private static void writerTest() {
		try (
			Writer writer = new FileWriter(filename);
		) {
			writer.write("Himedia Academy\r\n");
			writer.write("Java IO Programming\r\n");
			writer.write("2024.11");
			//	버퍼 비우기
			writer.flush();
			
			System.out.println("문서를 작성했습니다.");
		} catch (FileNotFoundException e) {
			System.err.println("파일을 열 수 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void readerTest() {
		try (
			Reader reader = new FileReader(filename);
		) {
			int data = 0;
			while((data = reader.read()) != -1) {
				System.out.print((char)data);
			}
			
			
			System.out.println();
		} catch (FileNotFoundException e) {
			System.err.println("파일을 열 수 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
