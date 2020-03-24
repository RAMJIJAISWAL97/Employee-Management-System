import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int find(int a[], int n, int n2) {
        Arrays.sort(a);
        for(int i = 0;i < n; i++) {
            int j = i + 1, k = n - 1;
            while(j < k) {
                if((a[i] + a[j] + a[k]) == n2)
                return 1;
                else if((a[i] + a[j] + a[k]) > n2)
                k--;
                else 
                j++;
            }
        }
        return 0;
    }
		public static void main(String args[]) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
		while(T>0)
		{
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
           System.out.println(find(a, n1, n2));
		T--;
		}
	}
}