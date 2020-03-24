 //{ Driver Code Starts
//Initial Template for C

// C program for implementation of Bubble sort
#include <stdio.h>
 
void swap(int *xp, int *yp)
{
    int temp = *xp;
    *xp = *yp;
    *yp = temp;
}

void bubble(int arr[], int i, int n);
 
// A function to implement bubble sort
void bubbleSort(int arr[], int n)
{
   int i, j;
   for (i = 0; i < n-1; i++)      
        bubble(arr, i, n);
}
 
/* Function to print an array */
void printArray(int arr[], int size)
{
    int i;
    for (i=0; i < size; i++)
        printf("%d ", arr[i]);
    printf("\n");
}
 
// Driver program to test above functions
int main()
{
    int arr[1000],n,T,i;
  
    scanf("%d",&T);
    
    while(T--){
        
    scanf("%d",&n);
    
    for(i=0;i<n;i++)
      scanf("%d",&arr[i]);
      
    bubbleSort(arr, n);
    printArray(arr, n);
    }
    return 0;;
}// } Driver Code Ends
void bubble(int a[], int i, int n) {
    for(int i = 0;i < n - 1;i++) {
        int tp = 1;
        for(int j = 1;j < (n - i);j++) {
            if(a[j - 1] > a[j]) {
                int t = a[j - 1];
                a[j - 1] = a[j];
                a[j] = t;
                tp = 0;
            }
        }
        if(tp == 1)
        return ;
    }
}