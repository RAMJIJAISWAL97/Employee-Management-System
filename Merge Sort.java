// { Driver Code Starts
import java.util.*;

class Merge_Sort
{
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void mergeSort(int arr[], int l, int r)
    {
        GfG g = new GfG();
        if (l < r)
        {
            int m = (l+r)/2;
            mergeSort(arr, l, m);
            mergeSort(arr , m+1, r);
            g.merge(arr, l, m, r);
        }
    }

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int n = sc.nextInt();
			Merge_Sort ms = new Merge_Sort();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

			GfG g = new GfG();
			mergeSort(arr,0,arr.length-1);

			ms.printArray(arr);
		T--;
		}
	}
}


// } Driver Code Ends
class GfG {
    void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;    int a[] = new int[n1];
        int n2 = r - m;    int b[] = new int[n2];
        for(int  i = l; i <= m;i++) 
            a[i - l] = arr[i];
        for(int  i = m + 1; i <= r;i++) 
            b[i - m - 1] = arr[i];
        int k = l, p = 0, q = 0;
        while(p < n1 || q < n2) {
            if(p < n1 && (q >= n2 || a[p] < b[q]))
                arr[k++] = a[p++];
            else
                arr[k++] = b[q++];
            }
        }
}
