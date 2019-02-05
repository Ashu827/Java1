package com.ashu.singleton;

public class Client {
	 int a, b;
	public void accept(int a, int b){
		this.a=a;
		this.b=b;
	}
	public int div(){
		return a/b;
	}
	public static void main(String[] args) {
		Client c= new Client();
		c.accept(10, 0);
		try {
			int result = c.div();
			System.out.println(result);
			System.out.println("My Name is Onkar");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("hii");
		} finally {
			System.out.println();
		}
		System.out.println("hii");
	}
}
