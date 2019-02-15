package com.ashu.collection;

public class Date {
	
	int dd;
	int mm;
	int yyyy;
	
	public Date(int dd,int mm,int yyyy) {
		this.dd=dd;
		this.mm=mm;
		this.yyyy=yyyy;
	}

	public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public int getYyyy() {
		return yyyy;
	}

	public void setYyyy(int yyyy) {
		this.yyyy = yyyy;
	}

	@Override
	public String toString() {
		return "Date [dd=" + dd + ", mm=" + mm + ", yyyy=" + yyyy + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		Date obj=(Date) o;
		return this.dd==obj.dd &&  this.mm==obj.mm &&  this.yyyy==obj.yyyy;
	}
	
	private int hash() {
	
		return dd+mm+yyyy;
	}
		
	


}
