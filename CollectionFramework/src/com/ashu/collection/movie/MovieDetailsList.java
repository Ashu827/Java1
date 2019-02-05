package com.ashu.collection.movie;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javax.xml.soap.Detail;

public class MovieDetailsList {

	
	public static void main(String[] args) {
		LinkedList<Movie_Details> list=new LinkedList<Movie_Details>();
		Movie_Details details1=new Movie_Details("TOH","Amir","fatima","Action");
		Movie_Details details2=new Movie_Details("SD","VarunDhawan","Anushka","Romantic");
		Movie_Details details3=new Movie_Details("Dhoni","Sushant","DishaPatani","Biography");
	
		list.add(details1);
		list.add(details2);
		list.add(details3);
		
		Iterator itr=list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println();
		
		
		System.out.println("Enter operation u want to perform");
		
		System.out.println("1.Add");
		System.out.println("2.Remove");
		System.out.println("3.RemoveAll");
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		switch(num){
		case 1: add_movie();
		
		case 2:remove_movie();
		
		case 3:remove_AllMovies();
		
		case 4:find_movie_By_mov_Name();
		
		case5:find_movie_By_Genre();
		}
		}
	
		private static void find_movie_By_Genre() {
			
			
		}
	
		private static void find_movie_By_mov_Name() {
			
			
		}
	
		private static void remove_AllMovies() {
			
			
		}
	
		private static void remove_movie() {
			
			
		}
	
		private static int add_movie( ) {
			return 0;
			
			
		}
		
		
}
	
	
