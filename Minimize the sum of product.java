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
           }
           
           line = br.readLine();
           strarr=line.split(" ");
           int[] a1 = new int[n1];
           for(int i=0;i<n1;i++) {
               if(!strarr[i].trim().equals(""))
               a1[i] = Integer.parseInt(strarr[i].trim());
           }
           Arrays.sort(a);
           Arrays.sort(a1);
           long min = 0;
           for(int i = 0; i < (n1) ;i++) {
               min += a[i] * a1[n1 - 1 -i];
           }
           System.out.println(min);
		T--;
		}
	}
}