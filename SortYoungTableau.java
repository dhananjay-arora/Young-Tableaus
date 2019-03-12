package com;


public class SortYoungTableau {

	public static int[] sortArray(MyArray objA, int length, int m, int n) {
		
		int[] arr=new int[length];
		Extract ex=new Extract(m,n);
		for(int i=0;i<length;i++) {
			arr[i]=ex.extract_min(objA);
		}
		
		return arr;
		
	}
	
}
