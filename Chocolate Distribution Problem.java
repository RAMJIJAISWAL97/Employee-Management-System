import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static int dp1(int a[], int n, int k) {
        Arrays.sort(a);
        if(n <= k)
            return (a[n - 1] - a[0]);
            
        int min = Integer.MAX_VALUE;
        for(int i = 0;(i + k - 1) < n;i++) {
            min = Math.min(min, (a[i + k - 1] - a[i]));
        }
        return min;
    }
	public static void main (String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
		while(T-->0) {
		   int n = Integer.parseInt(br.readLine());
           String line = br.readLine();
           String[] strarr=line.split(" ");
           int[] a = new int[n];
           for(int i=0;i<n;i++) {
               a[i]=Integer.parseInt(strarr[i]);    
           }
           int k = Integer.parseInt(br.readLine());
		   System.out.println(dp1(a, n, k));
		}
	}
}