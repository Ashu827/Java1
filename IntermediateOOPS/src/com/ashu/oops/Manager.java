package com.ashu.oops;

import java.util.Scanner;

public class Manager extends Employee{
	
	protected double salary = 40000;
	double Incentive;

	public Manager(String eName, int employeeid, boolean isManager, boolean isLabour) {

		super(eName, employeeid, isManager, isLabour);
		this.isManager = true;
	}

	public double incentive(int target) {

		if (target >= 1 && target < 25) {
			Incentive = 10000;
			return Incentive;
		}

		else if (target >= 25 && target < 35) {
			Incentive = 15000;
			return Incentive;
		}

		else if (target >= 35) {
			Incentive = 25000;
			return Incentive;
		} else {
			Incentive = 0;
			return Incentive;
		}

	}

	public void SalaryCalculation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter target:  ");
		int target = sc.nextInt();
		incentive(target);
		double totalIncome = salary + Incentive;
		System.out.println("The salary of manager is:  " + totalIncome);
	}
}
