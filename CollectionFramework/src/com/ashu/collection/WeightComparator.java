package com.ashu.collection;

import java.util.Comparator;

	 class WeightComparator implements Comparator<TreeImplementation>{

			
			public int compare(TreeImplementation p1, TreeImplementation p2) {
				if(p1.getWeight()>p2.getWeight())
				{
					return 1;
				}
				else if(p1.getWeight()==p2.getWeight()){
					if(p1.getHeight()>p2.getHeight()){
						
						return 1;
					}
					
					else
						
					return-1;
				}
				
				return -1;
				
				}
			}
