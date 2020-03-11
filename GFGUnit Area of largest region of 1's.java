import java.util.*;
class GFG {
    public static int m1 = 1;
    public static void dfs(int a[][],int dx[],int dy[],int i,int j,int m,int n) { 
        for(int k = 0; k < 8;k++) {
            if((i+dx[k])>=0 && (i+dx[k]) < m && (j+dy[k])>=0 && (j+dy[k]<n) && a[i+dx[k]][j+dy[k]] == 1) {
                m1++;
                a[(i + dx[k])][(j + dy[k])] = 2;
                dfs(a, dx, dy, i+dx[k], j+dy[k], m, n);
            }
        }
    }
    public static int Caller(int  a[][], int m, int n) {
        int max = 0;
        int dx[] = {-1 , -1 , -1 , 0  , 0, 1, 1, 1};
        int dy[] = {-1 , 0 , 1 , -1 ,1, -1, 0, 1};
        for(int i = 0;i < m;i++) {
            for(int j = 0;j < n ;j++) {
                if(a[i][j] == 1) {
                    a[i][j] = 2;
                    dfs(a, dx, dy, i , j, m, n);
                     max = Math.max(m1 , max);
                     m1 = 1;
                }
            }
        }
        max = Math.max(m1 , max);
        return max;
    }
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
		    int m = sc.nextInt();
		    int n = sc.nextInt();
		    int a[][] = new int[m][n];
		    for(int i = 0; i < m;i++) {
		        for(int j = 0; j < n; j++) {
		            a[i][j] = sc.nextInt();
		        }
		    }
		    System.out.println(Caller(a, m, n));
		}
	}
}
