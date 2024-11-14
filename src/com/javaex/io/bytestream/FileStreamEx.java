package com.javaex.io.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStreamEx {
	//	프로젝트 내의 files 디렉터리 위치
	static final String rootPath = 
			System.getProperty("user.dir") + "\\files\\";
	static final String source = rootPath + "img.jpg";
	static final String target = rootPath + "img_copy.jpg";
	
	public static void main(String[] args) {
//		InputStream is = null;
//		OutputStream os = null;
		
		try (
				InputStream is = new FileInputStream(source);
				OutputStream os = new FileOutputStream(target);
		)
		{
//			is = new FileInputStream(source);
//			os = new FileOutputStream(target);
			
			int data = 0;
			
			while ((data = is.read()) != -1) {
				os.write(data);
			}
			
			System.out.println("파일을 복사했어요.");
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없어요.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			/*
			try {
				if (is != null) is.close();
				if (os != null) os.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			*/
		}

	}

}
