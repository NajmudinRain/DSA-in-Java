package Recursion;

public class Floodfill {
	public static void main(String[]args)
	{
		int a[][] = {{1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 0},
                {1, 0, 0, 1, 1, 0, 1, 1},
                {1, 2, 2, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 2, 2, 0},
                {1, 1, 1, 1, 1, 2, 1, 1},
                {1, 1, 1, 1, 1, 2, 2, 1},
                };
		floodFill(a,0,0,3,1);
		
		printmatrix(a);
	}

	static void floodFill(int[][]a,int r, int c,int toFill, int prevFill)
	{
		int rows=a.length;
		int cols=a[0].length;
		if(r<0||r>=rows || c<0 ||c>=cols) //out of matrix
		{
			return;
		}
		if(a[r][c]!=prevFill){ //if curr postion is not equal to prev pos
		return;	
		}
		a[r][c]=toFill; 
	 
		floodFill(a,r-1,c,toFill,prevFill); 
		floodFill(a,r+1,c,toFill,prevFill);
		floodFill(a,r,c-1,toFill,prevFill);
		floodFill(a,r,c+1,toFill,prevFill);
		
	}
	static void printmatrix(int[][]a) { 
		for(int[]arr:a)
		{
			for(int element:arr)
			{
				System.out.print(element+ " ");
			}
			System.out.println();
		}
	}
}
