package com.ashu.service;

import java.security.Provider;

import com.ashu.service.supp.MyDate;
import com.ashu.service.supp.MyTestRecord;

public class TestDateDifferenceProvider {
	

	public static void main(String[] args) {
		DateDifferenceProvider provider=new DateDifferenceProvider();
		MyTestRecord[] myTestrecord=new MyTestRecord[15];
		myTestrecord[0]=new MyTestRecord(new MyDate (06,04,2011),new MyDate(06,04,2011),0);
		myTestrecord[1]=new MyTestRecord(new MyDate (06,04,2011),new MyDate(18,04,2011),12);
		myTestrecord[2]=new MyTestRecord(new MyDate (06,04,2011),new MyDate(18,05,2011),42);
		myTestrecord[3]=new MyTestRecord(new MyDate (06,04,2011),new MyDate(18,06,2011),73);
		myTestrecord[4]=new MyTestRecord(new MyDate (06,04,2011),new MyDate(18,12,2011),256);
		myTestrecord[5]=new MyTestRecord(new MyDate (06,04,2011),new MyDate(18,12,2012),622);
		myTestrecord[6]=new MyTestRecord(new MyDate (06,04,2011),new MyDate(18,12,2013),987);
		myTestrecord[7]=new MyTestRecord(new MyDate (06,04,2011),new MyDate(18,12,2113),37511);
		myTestrecord[8]=new MyTestRecord(new MyDate (06,04,2011),new MyDate(18,12,2413),147084);
		myTestrecord[9]=new MyTestRecord(new MyDate (06,04,2011),new MyDate(18,12,2813),293181);
		myTestrecord[10]=new MyTestRecord(new MyDate (06,01,2011),new MyDate(06,03,2011),59);
		myTestrecord[11]=new MyTestRecord(new MyDate (06,01,2012),new MyDate(06,03,2012),60);
		myTestrecord[12]=new MyTestRecord(new MyDate (06,02,2012),new MyDate(06,03,2012),29);
		myTestrecord[13]=new MyTestRecord(new MyDate (22,01,2012),new MyDate(15,11,2012),298);
		myTestrecord[14]=new MyTestRecord(new MyDate (06,02,2012),new MyDate(06,12,2012),304);
		
		
		
		
	
//	for(MyTestRecord testRecord:myTestrecord){
//	int calculatordiff=provider.getDateDifference(testRecord.getStartdate(), testRecord.getEnddate());
//					if(calculatordiff==testRecord.getActualdifference())
//					System.out.println("test case pass");
//					else
//					System.out.println("Test Case failed"+" Actual =" + myTestrecord[index].getActualdifference()+ 
//							" calculated ="+ calculatordiff);}
			
		for (int index=0; index < myTestrecord.length; index++) {
			long calculatedDiff = provider.getDateDifference(myTestrecord[index].getStartdate(),
					myTestrecord[index].getEnddate());
			if (calculatedDiff == myTestrecord[index].getActualdifference()) {
				System.out.println("Test Case passed");
			} else {
				System.err.println("Test Case failed"+" Actual =" + myTestrecord[index].getActualdifference()+ " calculated ="+ calculatedDiff);
			}
		}
			}
}