package com.ashu.oops;

import java.util.Scanner;

public class Labour extends Employee {
	

	protected double salary = 20000;
	public double overTime;

	public Labour(String eName, int employeeid, boolean isManager, boolean isLabour) {

		super(eName, employeeid, isManager, isLabour);
		this.isLabour = true;

	}

	public double overtime(int extraWorkingHour) {

		double perDayIncome = (double) (salary / 22);
		double perHourIncome = (double) (perDayIncome / 9);
		overTime = (double) (extraWorkingHour * 100);
		return overTime;
	}
	public void SalaryCalculation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter extra working hour of labour:  ");
		int extraWorkingHour = sc.nextInt();
		overtime(extraWorkingHour);
		double totalIncome = (salary + overTime);
		System.out.println("The salary of labour is:  " + totalIncome);
	}
}