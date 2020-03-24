import java.util.*;
class GFG {
    public static int tri(int a[], int n) {
        HashMap <Integer, Integer> map = new HashMap <Integer, Integer>();
        
        for(int i = 0;i< n;i++) {
            for(int j = i+1;j<n;j++) {
                if(map.get(a[i]+a[j]) != null) {
                    map.put((a[i]+a[j]), (Integer)map.get(a[i]+a[j]) + 1);
                } else {
                    map.put((a[i]+a[j]), 1);
                }
            }
        }
        
        int m = 0;
        for(int i = 0;i < n;i++) {
            if(map.get(a[i]) != null){
                m += map.get(a[i]);
            }
        }
        if(m == 0)
        return -1;
        return m;
    }
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    for(int i = 0;i < n;i++) {
		        a[i] = sc.nextInt();
		    }
		    System.out.println(tri(a, n));
		}
	}
}