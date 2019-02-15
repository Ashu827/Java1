package com.ashu.collection;

import java.util.Comparator;

public class DateComp implements Comparator<Date> {

	public int compare(Date date1, Date date2) {
		if (date1.getDd() == date2.getDd() && date1.getMm() == date2.getMm()
				&& date1.getYyyy() != date2.getYyyy()) {
			System.out.println("fail");
			return -1;
		}
		return 1;

	}

}
