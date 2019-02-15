package com.ashu.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Assignment7 {


	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hash=new HashMap<Integer, String>();
		
		hash.put(10,"Ashu");
		hash.put(20,"Sidd");
		hash.put(5,"Vij");
		hash.put(10,"Ashutosh");
		System.out.println(hash);
		for(java.util.Map.Entry<Integer, String> entry:hash.entrySet()){
			System.out.println(+entry.getKey()+""+entry.getValue());
		}
		
		ArrayList<String> arr=(ArrayList<String>) hash.entrySet().stream()
				.map(index->index.getKey()+index.getValue())
				.collect(Collectors.toList()));
		
		
	}
}
