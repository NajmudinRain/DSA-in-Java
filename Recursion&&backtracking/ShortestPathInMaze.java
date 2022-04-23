package backtracking;

public class ShortestPathInMaze {
public static void main(String[]args)
{

	int a[][] =
		{
				{ 1, 1, 1, 1, 1, 0, 0, 1, 1, 1 },
				{ 0, 1, 1, 1, 1, 1, 0, 1, 0, 1 },
				{ 0, 0, 1, 0, 1, 1, 1, 0, 0, 1 },
				{ 1, 0, 1, 1, 1, 0, 1, 1, 0, 1 },
				{ 0, 0, 0, 1, 0, 0, 0, 1, 0, 1 },
				{ 1, 0, 1, 1, 1, 0, 0, 1, 1, 0 },
				{ 0, 0, 0, 0, 1, 0, 0, 1, 0, 1 },
				{ 0, 1, 1, 1, 1, 1, 1, 1, 0, 0 },
				{ 1, 1, 1, 1, 1, 0, 0, 1, 1, 1 },
				{ 0, 0, 1, 0, 0, 1, 1, 0, 0, 1 },
		};
	int result=shortestPath(a,0,0,8,0);
//	int result=shortestPath(a,0,0,0,9);//no path possible
	if(result>=100000)
	System.out.println("no path possible");
	else {
		System.out.println(result);
	}
	
	
}

static int shortestPath(int[][]a, int i, int j,int x,int y)// in i and j are starting postion, x and y are destination.
{
	int rows=a.length;
	int cols=a[0].length;
	boolean vis[][]=new boolean[rows][cols]; //default value of boolean is false;
	
	return shortestPath(a,i,j,x,y,vis);
	
}
static boolean isValid(int[][] a, int i, int j, boolean vis[][]) {
	int rows=a.length;
	int cols=a[0].length;
	return i>=0 &&j>=0 && i<rows && j<cols && a[i][j]==1 &&!vis[i][j];
}

static int shortestPath(int[][]a, int i, int j, int x, int y, boolean[][]vis)
{ 
	if(!isValid(a,i,j,vis)) return (100000); //when path is not possible.
	if(i==x && j==y)return 0;
	vis[i][j]=true;
	int left=shortestPath(a,i,j-1,x,y,vis)+1;
	int right=shortestPath(a,i,j+1,x,y,vis)+1;
	int top=shortestPath(a,i-1,j,x,y,vis)+1;
	int bottom=shortestPath(a,i+1,j,x,y,vis)+1;
	//this line make backtracking possible
	vis[i][j]=false;
	return Math.min(Math.min(left, right),Math.min(top, bottom));
}
}