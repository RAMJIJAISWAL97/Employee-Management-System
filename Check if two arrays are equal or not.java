import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    /*public static Long dp1(Long a[], Long a2[], Long n) {
        TreeMap <Long, Long> map1 = new TreeMap <Long, Long>();
        TreeMap <Long, Long> map2 = new TreeMap <Long, Long>();
        for(Long i = 0;i < n;i++) {
            if(map1.get(a[i]) != null) {
                map1.put(a[i], (Long)(map1.get(a[i]) + 1));
            } else {
                map1.put(a[i], 1l);
            }
            if(map2.get(a2[i]) != null) {
                map2.put(a2[i], (Long)(map2.get(a2[i]) + 1));
            } else {
                map2.put(a2[i], 1l);
            }
        }
        Long j = 0, m = 0;
        for(Map.Entry ent : map1.entrySet()) {
            Long aa = (Long)ent.getKey();
            if((Long)ent.getValue() != map2.get(aa)) 
            return 0;
        }
        return 1;
    }*/
    
    public static boolean dp(long a[], long a2[], long n) {
        Arrays.sort(a);
        Arrays.sort(a2);
        return Arrays.equals(a, a2);
    }
    
    public static void main (String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long T = Long.parseLong(br.readLine());
		while(T-->0) {
		   String s[] = br.readLine().split(" ");
		   long n = Long.parseLong(s[0]);
           String line = br.readLine();
           String[] strarr=line.split(" ");
           long[] a = new long[(int)n];
           for(int i=0;i<n;i++)
           {
               a[i]=Long.parseLong(strarr[i]);    
           }
           String lin = br.readLine();
           strarr=lin.split(" ");
           long[] a1 = new long[(int)n];
           for(int i=0;i<n;i++) {
               a1[i]=Long.parseLong(strarr[i]);    
           }
		    if(dp(a, a1, n))
		    System.out.println(1);
		    else
		    System.out.println(0);
		}
	}
}