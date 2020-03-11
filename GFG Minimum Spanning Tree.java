import java.util.*;
import java.io.*;
import java.lang.*;



public class Driver_class {
    
    
    public static void main(String args[])throws IOException
    {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t  =Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split(" ");
            int V = Integer.parseInt(str[0]);
            int E = Integer.parseInt(str[1]);

            ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
            for(int i=0; i<V; i++) {
                ArrayList<Integer> temp = new ArrayList<>();
                for(int j = 0; j < V; j++)
                    temp.add(Integer.MAX_VALUE);
                graph.add(temp);
            }
            str = read.readLine().trim().split(" ");
            int k = 0;
            while(E-- > 0)
            {
                int u = Integer.parseInt(str[k++]);
                int v = Integer.parseInt(str[k++]);
                int w = Integer.parseInt(str[k++]);
                u--;
                v--;
                graph.get(u).set(v, w);
                graph.get(v).set(u, w);
            }

            System.out.println(new MST().spanningTree(V,E,graph));
        }
    }
}
    
    // } Driver Code Ends
//User function Template for Java
class my implements Comparable {
    Integer val = 0;
     String s = "";
     public my(int val, String s) {
         this.val = val;
         this.s = s;
     }
     public int compareTo(Object o) {
         int n = 0;
         my m = (my)o;
         if(m.val == this.val) {
             return 0;
         } else if(m.val > this.val){
             return -1;
         } else {
             return 1;
         }
     }
}
class MST
{
    public static int getP(int p[] , int i) {
        while(p[i] != i) {
            i = p[i];
        }
        return i;
    }
    
    public static boolean union(int p[] , int i, int  j) {
        int i1 = getP(p, i);
        int j1 = getP(p, j);
        //System.out.println(i1+" "+j1+"  ");
        if(i1 != j1) {
            p[i1] = j1;
            return true;
        }
        return false;
    }
    static int spanningTree(int V, int E, ArrayList<ArrayList<Integer>> graph) {
        Queue <my> q = new PriorityQueue<my>();
        
        int n = V;
        int p[] = new int[n];
        for(int  i = 0;i < n;i++) {
            p[i] = i;
        }
        
        for(int i = 0; i< n;i++) {
            for(int  j = i;j < n;j++) {
                int mm = graph.get(i).get(j);
                if(mm != Integer.MAX_VALUE) {
                    q.add(new my(mm, i+"#"+j));
                }
            }
        }
        
        int max = 0;
        while(q.size() > 0) {
            my m = q.poll();
            
            int i = Integer.parseInt(m.s.split("#")[0]);
            int j = Integer.parseInt(m.s.split("#")[1]);
            if(union(p, i, j)) {
                //System.out.println(m.val);
                max += m.val;
            }
        }
        return max;
    }
}
