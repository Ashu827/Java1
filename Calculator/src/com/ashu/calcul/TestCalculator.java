package com.ashu.calcul;

import java.util.Scanner;

public class TestCalculator {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter value for Numbers");
		int number1=scanner.nextInt();
		int number2=scanner.nextInt();
		Calculator calc=new Calculator();
		calc.add(number1, number2);
		calc.sub(number1, number2);
		calc.mul(number1, number2);
		calc.div(number1, number2);

	}

}
