/*
You are given an array A of size N. You need to print elements of A in alternate order.

Constraints:
1 <= T <= 200
1 <= N <= 105
1 <= Ai <= 105

Example:
Input:
2
4
1 2 3 4
5
1 2 3 4 5
Output:
1 3
1 3 5
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

//User function Template for Java

// arr[] is the array 
// n is the number of elements in array.
class GfG
{
    public static void print(int arr[], int n)
    {
        int i;
        for(i=0;i<n-1;i=i+2)
        {
            System.out.print(arr[i]+" ");
        }
        if(n==i+1)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
