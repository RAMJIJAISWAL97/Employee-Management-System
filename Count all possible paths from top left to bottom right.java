import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static long dp(int n1, int n2) {
        long a[][] = new long[n1][n2];
        for(int i = 0;i < n1;i++) {
            a[i][0] = 1;
        }
        for(int i = 0;i < n2;i++) {
            a[0][i] = 1;
        }
        
        for(int i = 1;i < n1;i++) {
            for(int j = 1;j < n2;j++) {
                a[i][j] = (a[i - 1][j] + a[i][j - 1]) % 1000000007;
            }
        }
        return (a[n1-1][n2 - 1] % 1000000007);
    }
     
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n1 =sc.nextInt();
		    int n2 =sc.nextInt();
		    System.out.println(dp(n1, n2));
		}
	}
}import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static long dp(int n1, int n2) {
        long a[][] = new long[n1][n2];
        for(int i = 0;i < n1;i++) {
            a[i][0] = 1;
        }
        for(int i = 0;i < n2;i++) {
            a[0][i] = 1;
        }
        
        for(int i = 1;i < n1;i++) {
            for(int j = 1;j < n2;j++) {
                a[i][j] = (a[i - 1][j] + a[i][j - 1]) % 1000000007;
            }
        }
        return (a[n1-1][n2 - 1] % 1000000007);
    }
     
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n1 =sc.nextInt();
		    int n2 =sc.nextInt();
		    System.out.println(dp(n1, n2));
		}
	}
}import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static long dp(int n1, int n2) {
        long a[][] = new long[n1][n2];
        for(int i = 0;i < n1;i++) {
            a[i][0] = 1;
        }
        for(int i = 0;i < n2;i++) {
            a[0][i] = 1;
        }
        
        for(int i = 1;i < n1;i++) {
            for(int j = 1;j < n2;j++) {
                a[i][j] = (a[i - 1][j] + a[i][j - 1]) % 1000000007;
            }
        }
        return (a[n1-1][n2 - 1] % 1000000007);
    }
     
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n1 =sc.nextInt();
		    int n2 =sc.nextInt();
		    System.out.println(dp(n1, n2));
		}
	}
}import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static long dp(int n1, int n2) {
        long a[][] = new long[n1][n2];
        for(int i = 0;i < n1;i++) {
            a[i][0] = 1;
        }
        for(int i = 0;i < n2;i++) {
            a[0][i] = 1;
        }
        
        for(int i = 1;i < n1;i++) {
            for(int j = 1;j < n2;j++) {
                a[i][j] = (a[i - 1][j] + a[i][j - 1]) % 1000000007;
            }
        }
        return (a[n1-1][n2 - 1] % 1000000007);
    }
     
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n1 =sc.nextInt();
		    int n2 =sc.nextInt();
		    System.out.println(dp(n1, n2));
		}
	}
}