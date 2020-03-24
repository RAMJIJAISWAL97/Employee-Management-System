import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    static long max = Long.MIN_VALUE, cm = Long.MIN_VALUE;
    public static long sub(int a[], int n) {
        if(n < 0)
        return Long.MIN_VALUE;
        if(n == 0) {
             max = a[n];
             cm = a[n];
             return cm;
         }
         cm = Math.max(sub(a, n - 1), 0) + a[n];
         max = Math.max(max, cm);
         return cm;
    }
    public static long dp(int a[], int n) {
         int b[] = new int[n];
         b[0] = a[0];
         int max = a[0];
         for(int i = 1;i < n;i++) {
             b[i] = Math.max(b[i - 1], 0) + a[i];
             if(max < b[i])
             max = b[i];
         }
         return max;
    }
    
    public static long dp2(int a[], int n) {
         int max = a[0],cm = a[0];
         for(int i = 1;i < n;i++) {
             cm = Math.max(cm, 0) + a[i];
             if(max < cm)
             max = cm;
         }
         return max;
    }
    
    public static long dp1(int array[], int n) {
        int currentMax = Integer.MIN_VALUE;
        int totalMax =  Integer.MIN_VALUE;

        for(int i = 0; i < array.length; i++){
            currentMax = Math.max(currentMax, 0) + array[i];
            totalMax = Math.max(totalMax, currentMax);
        }
        return totalMax;
    }
    
	public static void main (String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
	    
		while(T-->0)
		{
		   int n = Integer.parseInt(br.readLine());
           String line = br.readLine();
           String[] strarr=line.split(" ");
           int[] a = new int[n];
       
           for(int i=0;i<n;i++)
           {
               a[i]=Integer.parseInt(strarr[i]);    
           
           }/*
		    sub(a, n - 1);
		    System.out.println(max);
		    system.out.println(dp(a, n));*/
		    System.out.println(dp1(a, n));
		}
	}
}