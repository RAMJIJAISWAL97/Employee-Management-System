import java.util.*;
class GFG {
    public static void color(int a[][], int x, int y, int c, int p) {
        if(a[x][y] == p) {
            a[x][y] = c;
            if((x + 1) < a.length)
            color(a, x + 1, y, c, p);
            if((y + 1) < a[0].length)
            color(a, x, y + 1, c, p);
            if((x - 1) >= 0)
            color(a, x - 1, y, c, p);
            if((y - 1) >= 0)
            color(a, x, y - 1, c, p);
        }else {
            return ;
        }
    }
    
	public static void main (String[] args) {
		Scanner sc =  new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
		    int m = sc.nextInt();
		    int n = sc.nextInt();
		    int a[][] = new int[m][n];
		    for(int i = 0;i < m;i++) {
		        for(int j =0; j < n; j++) {
		            a[i][j] = sc.nextInt();
		        }
		    }
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int c = sc.nextInt();
		    color(a, x, y, c, a[x][y]);
		    for(int i = 0;i < m;i++) {
		        for(int j =0; j < n; j++) {
		            System.out.print(a[i][j]+" ");
		        }
		    }
		    System.out.println();
		}
	}
}

/*
0 5 5 0 5 5 5 5 0 5 2 3
8 8 8 8
1 2 9 4 1 2 9 4 1 2 9 4 1 3 2 4
*/
