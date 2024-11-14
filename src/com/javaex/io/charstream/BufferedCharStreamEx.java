package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedCharStreamEx {
	//	프로젝트 내의 files 디렉터리 위치
	static final String rootPath = 
			System.getProperty("user.dir") + "\\files\\";
	static final String source =
			rootPath + "last-leaf.txt";
	static final String target = 
			rootPath + "last-leaf-filtered.txt";
	
	public static void main(String[] args) {
		try (
			Reader fr = new FileReader(source);
			Writer fw = new FileWriter(target);
			
			//	보조 스트림(버퍼)
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
		) {
			//	문장 단위로 입출력
			String line = "";
			while((line = br.readLine()) != null) {
				if (line.toLowerCase().contains("leaf") ||
					line.toLowerCase().contains("leaves")) {
					bw.write(line);
					bw.newLine();
				}
			}
			System.out.println("문서를 저장했습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
