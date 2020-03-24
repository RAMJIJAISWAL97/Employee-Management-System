import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
		while(T-->0)
		{
		   int n1 = Integer.parseInt(br.readLine().trim());
           boolean[] a = new boolean[n1 + 1];
           if(n1 < 2) {
               System.out.println(0+" "+1);
           }
           a[0] = true;
           a[1] = true;
           for(int i = 2;i <= n1;i += 2) {
               a[i] = true;
           }
           a[2] = false;
           for(int i = 3;i * i <= n1;i += 2) {
               for(int j = i; j * i <= n1; j += 2) {
                   a[i * j] = true;
               }
           }
           for(int i = 2;i < n1;i++) {
               if(!(a[i] || a[n1 - i])) {
                    System.out.println(i+" "+(n1 - i));
                    break;
               }
           }
		}
	}
}