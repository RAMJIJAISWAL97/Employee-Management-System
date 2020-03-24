import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static LinkedList <Integer> tri(int a[], int n) {
        HashMap <Integer, Integer> map = new HashMap <Integer, Integer>();
        for(int i = 0;i< n;i++) {
            if(map.get(a[i]) != null) {
                map.put(a[i], (Integer)map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
        }
        TreeMap <Integer, String> map1 = new TreeMap <Integer, String>();
        int key = 0, val = 0;
        for(Map.Entry e : map.entrySet()) {
            if(map1.get((Integer)e.getValue()) != null)
                map1.put((Integer)e.getValue(), map1.get((Integer)e.getValue())+" "+(Integer)e.getKey());
            else
                map1.put((Integer)e.getValue(), (Integer)e.getKey()+"");
        }
        LinkedList <Integer> ll = new LinkedList <Integer>();
        for(Map.Entry e : map1.entrySet()) {
            String ss1[] = ((String)e.getValue()).split(" ");
                int ss[] = new int[ss1.length];
            for(int i = 0;i < ss1.length;i++)
                ss[i] = Integer.parseInt(ss1[i]);
            Arrays.sort(ss);
            int m = (Integer)e.getKey();
            for(int i1 =  ss.length - 1; i1 >= 0;i1--) {
                n = ss[i1];
                for(int i = 0;i < m;i++) {
                    ll.addFirst(n);
                }
            }
        }
        
        return ll;
    }
    
	public static void main (String[] args) throws IOException{
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
		   LinkedList <Integer> ll = tri(a, n);
		   for(Integer i : ll) {
		       System.out.print(i+" ");
		   }
		   System.out.println();
		}
	}
}