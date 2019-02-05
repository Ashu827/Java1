package com.ashu.collection;

import java.util.Comparator;

public class TreeImplementation {

	
	String name;
	int height;
	int weight;
	
	public TreeImplementation(String name, int height, int weight) {
		this.name=name;
		this.height=height;
		this.weight=weight;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "TreeImplementation [name=" + name + ", height=" + height
				+ ", weight=" + weight + "]";
	}
	
	
}
