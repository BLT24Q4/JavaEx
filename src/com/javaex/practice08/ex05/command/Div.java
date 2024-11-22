package com.javaex.practice08.ex05.command;

public class Div implements CalculateCommand {

	@Override
	public int calculate(int leftNum, int rightNum) {
		if (rightNum == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
        return leftNum / rightNum;
	}

}
