/*
You are given a sorted array containing only numbers 0 and 1. Find the transition point efficiently. The transition point is a point where "0" ends and "1" begins (0 based indexing).
Note that, if there is no "1" exists, print -1.
Note that, in case of all 1s print 0.

Example 1:
Input:
N = 5
C[] = {0,0,0,1,1}
Output: 3
Explanation: position 3 is 0 and next
one is 1, so answer is 3.


Example 2:
Input:
N = 4
C[] = {0,0,0,0}
Output: -1
Explanation: Since, there is no "1",so
the answer is -1.

Constraints:
1 ≤ N ≤ 500000
0 ≤ C[i] ≤ 1
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

class GfG 
{
    int transitionPoint(int arr[], int n)
    {
        int left=0, right=n-1;
	    int mid=0;
	    int res=-1;
	    if(arr[0]==1)
	        res = 0;
	    else { 
	    while(left<=right)
	    {
	        mid=(left+right)/2;
	        if( mid!=0 && arr[mid] == 1 && arr[mid-1] == 0)
	        {
	            res = mid;
	            break;
	        }
	        else if(arr[mid]==1)
	        {
	           right=mid-1;
	        }
	        else
	        {
	           left=mid+1;
	        }
	    }
	    }
	    return res;
    }
}
