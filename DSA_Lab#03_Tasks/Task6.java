package dsaCodes;

import java.util.*;

public class Task6 {
	
	public static void sort2D(int arr[][], int col)
    {
        Arrays.sort(arr, new Comparator<int[]>() {
          public int compare(final int[] entry1, 
                             final int[] entry2) {
            if (entry1[col] > entry2[col])
                return 1;
            else
                return -1;
          }
        });  
    }

	public static void main(String[] args) {
		
		int[][] matrix=new int[][] {{3,4},{1,2}};
		int col = 2;
        sort2D(matrix, col - 1);
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.println(matrix[i][j]);
			}
		}
				
	}
	
}
