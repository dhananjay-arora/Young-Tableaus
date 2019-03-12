package com;

public class Extract {
	
	int m,n;
	
	Extract(int m,int n){
		this.m=m;
		this.n=n;
	}
	public int extract_min(MyArray objA){
	    int x = objA.young_t[0][0];
	    objA.young_t[0][0] = Integer.MAX_VALUE;
	    youngify(objA, 0, 0);
	    return x;
	}
	
	 public void youngify(MyArray objA, int i, int j){
         int x, y;

         x = i;
         y = j;
         int temp;
         if (i + 1 < m){
             if (objA.young_t[i][j] > objA.young_t[i+1][j]){
                 x = i + 1;
                 y = j;
             }
         }
          
         if (j+1 < n){
             if (objA.young_t[x][y] > objA.young_t[i][j+1]){
               x = i;
               y = j+1;
           }
       }
        
       if(x != i || y != j){
           temp = objA.young_t[x][y];
           objA.young_t[x][y] = objA.young_t[i][j];
           objA.young_t[i][j] = temp;
           youngify(objA, x, y);
       }
   }

}