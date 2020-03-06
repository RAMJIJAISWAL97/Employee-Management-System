import java.util.*;
class GFG {
    
	public static int bfs(int a[][], int m, int n) {
	    Queue <Integer> q1 = new LinkedList <Integer>();
	    Queue <Integer> q2 = new LinkedList <Integer>();
	    
	    int max = 0;
	    for(int i = 0; i < m; i++) {
	        for(int j = 0;j < n;j++) {
	            if(a[i][j] == 1) {
	                q1.offer(i);
	                q2.offer(j);
	                break;
	            }
	        }
	    }
	    while(q1.size() > 0) {
	        int i = q1.poll();
	        int j = q2.poll();
	        //System.out.println(i+" "+j+" ");
           if(j < n - 1 && (a[i][j + 1] == 2 || a[i][j + 1] == 3)) {
	            if(a[i][j + 1] == 2)
	            return 1;
	            q1.offer(i);
	            q2.offer(j + 1);
	            a[i][j + 1] = 0;
	        }
	  
	        if(i > 0 && (a[i - 1][j] == 2 || a[i - 1][j] == 3)) {
	            if(a[i - 1][j] == 2)
	            return 1;
	            q1.offer(i - 1);
	            q2.offer(j);
	            a[i - 1][j] = 0;
	        }
	        if(j > 0 && (a[i][j - 1] == 2 || a[i][j - 1] == 3)) {
	            if(a[i][j - 1] == 2)
	            return 1;
	            q1.offer(i);
	            q2.offer(j - 1);
	            a[i][j - 1] = 0;
	        }
	        if(i < n - 1 && (a[i + 1][j] == 2 || a[i + 1][j] == 3)) {
	            if(a[i + 1][j] == 2)
	            return 1;
	            q1.offer(i + 1);
	            q2.offer(j);
	            a[i + 1][j] = 0;
	        }
	    }
	    return 0;
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
		    int n = sc.nextInt();
		    int a[][] = new int[n][n];
		    for(int i = 0; i < n;i++) {
		        for(int j = 0;j < n;j++) {
		            a[i][j] = sc.nextInt();
		            //System.out.print(a[i][j]+" ");
		        }
		        //System.out.println();
		    }
		    System.out.println(bfs(a, n, n));
		}
	}
}
