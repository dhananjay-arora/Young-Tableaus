package com;


public class InsertKey {
	static void insert_key(MyArray objA, int i, int j, int key) {
		// TODO Auto-generated method stub
		int x, y, max, temp;
        
        if (objA.young_t[i][j] < key){
            System.out.println("No more insertions possible. Or the tableau is full");
            return;
        }
        objA.young_t[i][j] = key;
        x = i;
        y = j;
        max = Integer.MAX_VALUE;
      
        while( (i > 0 || j > 0) && (max > objA.young_t[i][j]) ){
         temp = objA.young_t[x][y];
         objA.young_t[x][y] = objA.young_t[i][j];
         objA.young_t[i][j] = temp;
         i = x;
         j = y;
              
         if (i - 1 >= 0 && objA.young_t[i][j] < objA.young_t[i-1][j]){
             x = i -1;
             y = j;
         }
        
         if(j -1 >= 0 && objA.young_t[x][y] < objA.young_t[i][j-1]){
        	 x = i;
        	 y = j - 1;
         }
         max = objA.young_t[x][y];
        }
	}
}
