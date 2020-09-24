/*
Given a sorted array of integers and a key to be searched in the array. Print the position of the key in the array, if present. If it's not present in the array, report it. 

Input:
The first line contains an integer 'T' denoting the number of test cases. Then 'T' test cases follow. Each test case consists of 3 lines.
First line of each test case contains an integer N denoting the size of the array. Second line of each test case consists of 'N' space separated integers 
denoting the elements of the array A[]. The third line contains a key 'k' .

Constraints:
1 <= T <= 100
1 <= N <= 104
1 <= arr[i] <= 10^4

Example:
Input:
2
5
1 2 3 4 5 
4
5
11 22 33 44 55
445

Output:
3
-1

Explanation:
Test Case 1:
4 is present at the index 3 (0-based) in the array.

Test Case 2:
Since 445 is not present in the given array, we return -1. 
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

class GfG
{
	int bin_search(int A[], int left, int right,  int k)
	{
	    int res = -1;
	    int mid = (left+right)/2;
        
        if(left>right)
            return -1;
        if(A[mid]==k)
            return mid;
    
        else
        {
            if(k < A[mid])
                res = bin_search(A,left,mid-1,k);
            else
                res = bin_search(A,mid+1,right,k);
        }
        return res;
	}
}
