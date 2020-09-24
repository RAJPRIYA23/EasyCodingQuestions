/*
Given an unsorted array of size N, use selection sort to sort arr[] in increasing order by repeatedly selecting the minimum element from unsorted subarray and putting it in the sorted subarray. 

Example 1:

Input :
N = 5
arr[] = {4, 1, 3, 9, 7}

Output: 1 3 4 7 9

Explanation:
Maintain sorted (in bold) and unsorted subarrays.
Select 1. Array becomes 1 4 3 9 7.
Select 3. Array becomes 1 3 4 9 7.
Select 4. Array becomes 1 3 4 9 7.
Select 7. Array becomes 1 3 4 7 9.
Select 9. Array becomes 1 3 4 7 9.
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.*;

class SelectionSort
{
	void selectionSort(int arr[])
	{
		int n = arr.length;
		GfG obj = new GfG();
		for(int i=n-1; i>=0; i--)
		{
			int j = obj.select(arr, i);
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}	
	}
	
	void printArray(int arr[])
	{
		int n = arr.length;
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		SelectionSort ss = new SelectionSort();
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n]; 
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
		
			//GfG obj = new GfG();
			ss.selectionSort(arr);
			
			ss.printArray(arr);
			t--;
		}
		
	}
}
// } Driver Code Ends


/* The task is to complete select() which is used 
   as shown below to implement selectionSort() */

/* A function to implement selection sort
class SelectionSort
{
	void selectionSort(int arr[])
	{
		int n = arr.length;
		GfG obj = new GfG();
		for(int i=n-1; i>=0; i--)
		{
			int j = obj.select(arr, i);
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}	
	}
} */
class GfG
{
    int  select(int arr[], int i)
    {
        int max_index = i;
	    for(int j=i-1 ; j>= 0 ; j--)
	    {
	        if(arr[j] > arr[max_index])
	            max_index = j;
	    }
	    return max_index;
    }
}
