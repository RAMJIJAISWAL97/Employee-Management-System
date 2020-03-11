import java.util.*;
class GFG {
    public static boolean is(int x, int y , int m, int n, int a[][]) {
         if((x >= 0 && y >= 0 && x < m && y < n) && (a[x][y] == 1)) {
             return true;
         }
         return false;
    }
    public static int color(int a[][],int m, int n, int x, int y) {
        int dx[] = {0, 0, 1, -1};
        int dy[] = {1, -1, 0, 0}; 
        Queue <Integer> q1 = new LinkedList <Integer>();
        Queue <Integer> q2 = new LinkedList <Integer>();
        Queue <Integer> q3 = new LinkedList <Integer>();
        if(a[0][0] == 0)
        return -1;
        if(x == 0 && y == 0)
        return 0;
        q1.offer(0);
        q2.offer(0);
        q3.offer(0);
        a[0][0] = 0;
        int nn = -1;
        while(q1.size() > 0) {
            int i = q1.poll();
            int j = q2.poll();
            int c = q3.poll();
            for(int k = 0; k < 4; k++) {
                if(is(i + dx[k], j + dy[k], m , n, a)) {
                    q1.offer(i + dx[k]);
                    q2.offer(j + dy[k]);
                    q3.offer(c + 1);
                    if(((i + dx[k]) == x)  && (((j + dy[k]) == y))) {
                        return (c + 1);
                    }
                    a[i + dx[k]][j + dy[k]] = 0;
                }
            }
            
        }
        return  -1;
    }
    
	public static void main (String[] args) {
		Scanner sc =  new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
		    int m = sc.nextInt();
		    int n = sc.nextInt();
		    int a[][] = new int[m][n];
		    for(int i = 0;i < m;i++) {
		        for(int j =0; j < n; j++) {
		            a[i][j] = sc.nextInt();
		            //System.out.print(a[i][j]+" ");
		        }
		        //System.out.println();
		    }
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    System.out.println(color(a, m, n, x, y));
		}
	}
}
