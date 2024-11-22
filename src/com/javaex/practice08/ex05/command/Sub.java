package com.javaex.practice08.ex05.command;

public class Sub implements CalculateCommand {
	
	@Override
	public int calculate(int leftNum, int rightNum) {
		return leftNum - rightNum;
	}

}
