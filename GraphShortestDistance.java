import java.util.*;
class Graph {
    LinkedList ll[] = null;
    public Graph(int n) {
        ll = new LinkedList[n];
    }
    public void add(int u, int v) {
        if(ll[u] == null)
        ll[u] = new LinkedList <Integer> ();
        ll[u].add(v);
    }
    public int vist(int u) {
        int n = ll.length;
        Queue <Integer> q = new LinkedList<Integer>();
        boolean b[] = new boolean[n];
        int step[] = new int[n];
        q.offer(u);
        b[u] = true;
        while(q.size() > 0) {
            int nn = q.poll();
            LinkedList l1 = ll[nn];
            int i = 0;
            if(l1 != null) {
                while(i < l1.size()) {
                    if(!b[(Integer)l1.get(i)]) {
                        q.offer((Integer)l1.get(i));
                        step[(Integer)l1.get(i)] = step[nn] + 1;
                        b[(Integer)l1.get(i)] = true;
                    }
                    ++i;
                }
            }
        }
        return step[n - 1];
    }
    
    public int count() {
        int count = 0;
	    int n = ll.length;
	    while(n-- > 0) {
	            if(ll[n] != null)
	            count += ll[n].size();
	   }
	   return count;
    }
}
class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-- > 0) {
	        int n = sc.nextInt();
	        Graph g = new Graph(n + 1);
	        for(int i = 2; i <= n ;i++) {
	            g.add(i - 1, i);
	            if(i % 3 == 0)
	            g.add(i / 3, i);
	        }
	        System.out.println(g.vist(1));
	    }
	}
}
