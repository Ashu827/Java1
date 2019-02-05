package Assignment_9;

import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter value for CTC");
		int CTC=scanner.nextInt();
		if(CTC>0 && CTC<180000){

			System.out.println(" Tax Amount is Nil");
		}
		else if(CTC>=180000 && CTC<=300000)
		{
			int remainingAmount=CTC-180000;
			double tax=remainingAmount*0.1;
			System.out.println("Tax Amount is "+tax);
		}
		else if(CTC>300000 && CTC<=500000)
		{
			int amount1=CTC-180000;
			if(amount1>300000){
				int amount2=amount1-300000;
				double tax1=300000*0.1;
				double tax2=amount2*0.2;
				System.out.println("Tax Amount is " +(tax1+tax2));
			}
			else
			{
			double tax3=amount1*0.1;
			System.out.println(tax3);
			}
			
		}
		else if(CTC>500000 && CTC<=1000000)
		{
			int amount=CTC-180000;
			double tax1=300000*0.1;
			int amount1=amount-300000;
			
			double tax2=300000*0.2;
			int amount2=amount-480000;
			double tax3=amount2*0.3;

			System.out.println("Tax Amount is " +(tax1+tax2+tax3));
		}

	}

}


