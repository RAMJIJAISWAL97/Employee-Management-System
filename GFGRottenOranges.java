import java.util.*;
class GFG {
    
	public static int bfs(int a[][], int m, int n) {
	    Queue <Integer> q1 = new LinkedList <Integer>();
	    Queue <Integer> q2 = new LinkedList <Integer>();
	    Queue <Integer> q3 = new LinkedList <Integer>();
	    
	    int max = 0;
	    for(int i = 0; i < m; i++) {
	        for(int j = 0;j < n;j++) {
	            if(a[i][j] == 2) {
	                q1.offer(i);
	                q2.offer(j);
	                q3.offer(0);
	            }
	        }
	    }
	    while(q1.size() > 0) {
	        int i = q1.poll();
	        int j = q2.poll();
	        int c = q3.poll();
	        max = Math.max(max, c);
	        if(i > 0 && a[i - 1][j] == 1) {
	            a[i - 1][j] = 2;
	            q1.offer(i - 1);
	            q2.offer(j);
	            q3.offer(c + 1);
	        }
	        if(j > 0 && a[i][j - 1] == 1) {
	            a[i][j - 1] = 2;
	            q1.offer(i);
	            q2.offer(j - 1);
	            q3.offer(c + 1);
	        }
	        if(i < m - 1 && a[i + 1][j] == 1) {
	            a[i + 1][j] = 2;
	            q1.offer(i + 1);
	            q2.offer(j);
	            q3.offer(c + 1);
	        }
	        if(j < n - 1 && a[i][j + 1] == 1) {
	            a[i][j + 1] = 2;
	            q1.offer(i);
	            q2.offer(j + 1);
	            q3.offer(c + 1);
	        }
	    }
	    return max;
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
		    int m = sc.nextInt();
		    int n = sc.nextInt();
		    int a[][] = new int[m][n];
		    for(int i = 0; i < m;i++) {
		        for(int j = 0;j < n;j++) {
		            a[i][j] = sc.nextInt();
		        }
		    }
		    int nnm = bfs(a, m, n);
		    for(int i = 0; i < m;i++) {
		        for(int j = 0;j < n;j++) {
		            if(a[i][j] == 1) {
		                nnm = -1;
		            }
		        }
		    }
		    System.out.println(nnm);
		}
	}
}
