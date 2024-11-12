package com.javaex.api.util.date;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		Calendar custom = Calendar.getInstance();
		
		//	달력의 날짜 설정
		custom.set(2012, 8, 24); //	-> 2012년 9월 24일을 의미
		//	주의: 월 정보는 실제 월 -1 

		//	캘린더 상수로 날짜 정보를 받을 수 있음
		int year = now.get(Calendar.YEAR);	//	연 정보 get
		int month = now.get(Calendar.MONTH) + 1;	//	월 정보
		int date = now.get(Calendar.DATE);	//	일 정보
		
		System.out.printf("오늘은 %d년 %d월 %d일 입니다.%n",
				year, month, date);
		//	날짜 조작 : 현재 시간으로부터 10년 뒤로 여행해 봅시다.
		Calendar future = Calendar.getInstance();
		future.add(Calendar.YEAR, 10); //	10년을 더한다
		
		System.out.printf("10년뒤: %d년 %d월 %d일 %n",
				future.get(Calendar.YEAR),
				future.get(Calendar.MONTH) + 1,
				future.get(Calendar.DATE));
		
		//	이 날은 무슨 요일?
		int dow = future.get(Calendar.DAY_OF_WEEK);
		System.out.println("요일:" + dow);
		
	}

}
