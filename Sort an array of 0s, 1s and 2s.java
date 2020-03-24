import java.util.*;
class GFG {
    public static void sort(int a[], int n) {
        int l = 0, h = n - 1, m = 0;
        while(m <= h) {
            if(a[m] == 0) {
                int t = a[m];
                a[m] = a[l];
                a[l] = t;
                m++;
                l++;
            }
            else if(a[m] == 2) {
                int t = a[h];
                a[h] = a[m];
                a[m] = t;
                h--;
            } else {
                m++;
            }
        }
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
		    sort(a, n);
		    for(int i = 0;i < n;i++) {
		        System.out.print(a[i]+" ");
		    }
		    System.out.println();
		}
	}
}