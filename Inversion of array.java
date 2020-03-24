import java.util.*;
import java.lang.*;
import java.io.*;

class Merge_Sort
{
    static long mergeSort(int arr[], int l, int r)
    {
        GfG g = new GfG();
        if (l < r)
        {
            int m = (l+r)/2;
            long m1 = mergeSort(arr, l, m);
            long m2 = mergeSort(arr , m+1, r);
            return g.merge(arr, l, m, r) + m1 + m2;
        }
        return 0;
    }

	public static void main(String args[]) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
	    
		while(T>0)
		{
		   int n = Integer.parseInt(br.readLine());
           String line = br.readLine();
           String[] strarr=line.split(" ");
           int[] arr = new int[n];
       
           for(int i=0;i<n;i++)
           {
               arr[i]=Integer.parseInt(strarr[i]);    
           
           }
			Merge_Sort ms = new Merge_Sort();
			GfG g = new GfG();
			long nn = mergeSort(arr,0,arr.length-1);
			System.out.println(nn);
		T--;
		}
	}
}
class GfG {
    long merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;    int a[] = new int[n1];
        int n2 = r - m;    int b[] = new int[n2];
        for(int  i = l; i <= m;i++) 
            a[i - l] = arr[i];
            
        for(int  i = m + 1; i <= r;i++) 
            b[i - m - 1] = arr[i];
            
        int k = l, p = 0, q = 0;
        long sum = 0;
        
        while(p < n1 || q < n2) {
            if(p < n1 && (q >= n2 || a[p] <= b[q])) {
                arr[k++] = a[p++];
            } else {
                    arr[k++] = b[q++]; 
                    sum += n1 - p;
                }
            }
            return sum;
        }
}
