import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static long dp(long a[][], int n) {
        for(int j = 1; j < n;j++) {
            for(int i = 0;i < n;i++) {
                if(i > 0 && i < (n - 1)) {
                        a[j][i] = Math.max(Math.max(a[j-1][i], a[j-1][i - 1]),a[j-1][i+1])  + a[j][i];
                    }
                else if(i == 0 && i < (n - 1)) {
                        a[j][i] = Math.max(a[j-1][i], a[j-1][i+1]) + a[j][i];
                    }
                else if(i > 0 && i == (n - 1)) {
                        a[j][i] = Math.max(a[j-1][i], a[j-1][i-1])  + a[j][i];
                    }
                else {
                        a[j][i] = a[j-1][i] + a[j][i];
                    }
                }
            }
            long max = Integer.MIN_VALUE;
            for(int j = 0;j <n;j++) {
                max = Math.max(a[n - 1][j], max);
            }
            return max;
        }
     
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n =sc.nextInt();
		    long a[][] = new long[n][n];
		    for(int i = 0;i < n;i++) {
		        for(int j = 0;j < n;j++) {
		            a[i][j] = sc.nextInt();
		        }
		    }
		    System.out.println(dp(a, n));
		}
	}
}