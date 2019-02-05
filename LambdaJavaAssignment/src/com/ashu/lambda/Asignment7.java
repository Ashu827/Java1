package com.ashu.lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Asignment7 {

	public static void main(String[] args) {

		HashMap<Integer, String> hash=new HashMap<Integer, String>();

		hash.put(10,"Ashu");
		hash.put(20,"Sidd");
		hash.put(5,"Vij");
		hash.put(10,"Ashutosh");

		for(Entry<Integer, String> entry:hash.entrySet()){
			System.out.println(+entry.getKey()+""+entry.getValue());
		}

		ArrayList<String> arr=(ArrayList<String>) hash.entrySet().stream()
				.map(index->index.getKey()+index.getValue())
				.collect(Collectors.toList());
		System.out.println(arr);

		String arr1=(String) arr.stream()
				.map(index->index)
				.reduce("",String :: concat);
		System.out.println(arr1);
	}
}
