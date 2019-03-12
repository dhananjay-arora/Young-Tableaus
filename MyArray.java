package com;


public class MyArray {
	
	int m,n;
	int[][] young_t;
	int max= Integer.MAX_VALUE;
	
	public MyArray(int m, int n){
		this.m=m;
		this.n=n;
		young_t=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				young_t[i][j]=max;
			}
		}
	}
	
	public void printArray() {
		int max= Integer.MAX_VALUE;
        for(int i=0;i<m;i++) {
			for(int j = 0;j<n;j++) {
				if(young_t[i][j]==max) 
					System.out.print("- ");
				else
				System.out.print(young_t[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
