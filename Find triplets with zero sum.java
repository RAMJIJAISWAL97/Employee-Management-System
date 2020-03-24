// { Driver Code Starts
import java.util.*;
class Triplets{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			Triplet g=new Triplet();
			if(g.findTriplets(a,n))
				System.out.println("1");
			else
				System.out.println("0");
			
		}
	}
}// } Driver Code Ends
/*Complete the function below*/


class Triplet
{
    // Function to check if triplet is present 
    // arr[]: input array
    // n: size of the array
	public boolean findTriplets(int a[] , int n)
    {
        int n2 = 0;
        Arrays.sort(a);
        for(int i = 0;i < n; i++) {
            int j = i + 1, k = n - 1;
            while(j < k) {
                if((a[i] + a[j] + a[k]) == n2)
                return true;
                else if((a[i] + a[j] + a[k]) > n2)
                k--;
                else 
                j++;
            }
        }
        return false;
    }
}