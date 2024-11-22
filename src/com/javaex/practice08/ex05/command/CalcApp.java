package com.javaex.practice08.ex05.command;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//	Command 패턴과 유사한
public class CalcApp {

    public static void main(String[] args) {
    	//	스캐너에서 한 줄 입력
    	//	공백 구분자로 분할
    	//	첫번째 토큰 -> 숫자1
    	//	두번째 토큰 -> 연산자기호
    	//	세번째 토큰 -> 숫자2
    	Scanner scanner = new Scanner(System.in);
    	Map<String, CalculateCommand> commands = new HashMap<>();
    	commands.put("+", new Add());
        commands.put("-", new Sub());
        commands.put("*", new Mul());
        commands.put("/", new Div());
        
    	while(true) {
    		//	한 줄 입력
    		System.out.print(">> ");
    		String line = scanner.nextLine();
    		
    		if (line.equals("/q")) {
    			System.out.println("종료합니다.");
    			break;
    		}
    		
    		String tokens[] = line.split(" ");
    		int leftNum = Integer.valueOf(tokens[0]);
    		int rightNum = Integer.valueOf(tokens[2]);
    		String operator = tokens[1];
    		
    		CalculateCommand command = commands.get(operator);
    		if (command != null) {
    			try {
    				int result = command.calculate(leftNum, rightNum);
    				System.out.println(">> " + result);
    			} catch (ArithmeticException e) {
    				System.err.println(">> " + e.getMessage());
    			}
    		} else {
    			System.err.println(">> 알 수 없는 연산자입니다.");
    		}
    	}
    	
    	scanner.close();
    }
}
