import java.util.*;
class GFG {
    public static void dfs(char a[][],int dx[],int dy[],int i,int j,int m,int n) { 
        for(int k = 0; k < 4;k++) {
            if((i+dx[k])>=0 && (i+dx[k]) < m && (j+dy[k])>=0 && (j+dy[k]<n) && a[i+dx[k]][j+dy[k]] == 'X') {
                a[(i + dx[k])][(j + dy[k])] = 'o';
                dfs(a, dx, dy, i+dx[k], j+dy[k], m, n);
            }
        }
    }
    public static int Caller(char a[][], int m, int n) {
        int max = 0;
        int dx[] = {-1 , 0  ,0, 1};
        int dy[] = {0 , -1 ,1, 0};
        for(int i = 0;i < m;i++) {
            for(int j = 0;j < n ;j++) {
                if(a[i][j] == 'X') {
                    a[i][j] = 'o';
                    dfs(a, dx, dy, i , j, m, n);
                     max++;
                }
            }
        }
        return max;
    }
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
		    int m = sc.nextInt();
		    int n = sc.nextInt();
		    char a[][] = new char[m][n];
		    for(int i = 0;i < m;i++) {
		        a[i] = sc.next().toCharArray();
		    }
		    System.out.println(Caller(a, m, n));
		}
	}
}
