/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void dp(int a[], int a1[], int n1, int n2) {
        TreeMap <Integer, Integer> map = new TreeMap <Integer, Integer>();
        for(int x : a) {
            if(map.get(x) != null) {
                map.put(x, (Integer)map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
        int j = 0, m = 0;
        for(int i =0; i< n2;i++) {
            if(map.get(a1[i]) != null) {
                m = map.get(a1[i]);
                map.remove(a1[i]);
                for(int k = 0;k < m; k++) {
                    a[j + k] = a1[i];
                }
                j = j + m;
            }
        }
        for(Map.Entry ent : map.entrySet()) {
            int aa = (Integer)ent.getKey();
            m = (Integer)ent.getValue();
            for(int k = 0;k < m; k++) {
                a[j + k] = aa;
            }
            j = j + m;
        }
    }
    public static void main (String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
		while(T-->0) {
		   String s[] = br.readLine().split(" ");
		   int n1 = Integer.parseInt(s[0]);
		   int n2 = Integer.parseInt(s[1]);
           String line = br.readLine();
           String[] strarr=line.split(" ");
           int[] a = new int[n1];
           for(int i=0;i<n1;i++)
           {
               a[i]=Integer.parseInt(strarr[i]);    
           }
           String lin = br.readLine();
           strarr=lin.split(" ");
           int[] a1 = new int[n1];
           for(int i=0;i<n2;i++) {
               a1[i]=Integer.parseInt(strarr[i]);    
           }
           
		    dp(a, a1, n1, n2);
		    for(int i = 0;i < n1;i++)
		    System.out.print(a[i]+" ");
		    System.out.println();
		}
	}
}