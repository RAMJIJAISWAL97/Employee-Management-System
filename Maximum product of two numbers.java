import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
		public static void main(String args[]) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
		while(T>0)
		{
		   int n1 = Integer.parseInt(br.readLine().trim());
           String line = br.readLine();
           String[] strarr=line.split(" ");
           int[] a = new int[n1];
           int c = 0, c1 = 0;
           for(int i=0;i<n1;i++) {
               if(!strarr[i].trim().equals(""))
               a[i] = Integer.parseInt(strarr[i].trim());
               if(c < a[i] || c1  < a[i]) {
                   if(c < a[i]) {
                        c1 = c;
                        c = a[i];
                   } else {
                       c1 = a[i];
                   }
               }
           }
           System.out.println(c * (long)c1);
		T--;
		}
	}
}