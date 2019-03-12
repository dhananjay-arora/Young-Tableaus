package com;

public class CheckNumber {

	public static boolean find(MyArray objA, int number, int m, int n) {
		// TODO Auto-generated method stub
		
		int i=m-1,j=0;
		int current;
		
		while(j<n && i>=0) {
			current=objA.young_t[i][j];
			
			if(current==number) {
				return true;
			}else if(number>current) {
				j++;
			}else if(number<current) {
				i--;
			}
		}
		return false;
	}

}
