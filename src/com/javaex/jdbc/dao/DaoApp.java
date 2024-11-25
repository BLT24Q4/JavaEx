package com.javaex.jdbc.dao;

import java.util.Iterator;
import java.util.List;

public class DaoApp {

	public static void main(String[] args) {
		listAuthors();
	}
	
	//	Author Table의 모든 레코드를 출력
	private static void listAuthors() {
		AuthorDao dao = new AuthorDaoImpl();
		
		List<AuthorVo> list = dao.getList();
		Iterator<AuthorVo> iter = list.iterator();
		
		System.out.println("===================");
		
		while (iter.hasNext()) {
			AuthorVo vo = iter.next();
			System.out.println(vo);
		}
	}

}
