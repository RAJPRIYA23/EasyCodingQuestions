/*
Given an array A of integers. The task is to complete the function which returns an integer denoting the length of the longest sub-sequence such that elements in the
sub-sequence are consecutive integers, the consecutive numbers can be in any order.

Constraints:
1 <= T <= 100
1 <= N <= 106
1 <= Ai <= 108

Example(To be used only for expected output):
Input:
2
7
1 9 3 10 4 20 2
11
36 41 56 35 44 33 34 92 43 32 42
Output:
4
5

Explanation:
Testcase 1: Logest consecutive subsequence is 1, 2, 3, 4 of length 4.
*/

class GfG
{
    // Function to find Longest Consecutive Subsequence
    int findLongestConseqSubseq(int arr[], int n)
    {
        int max=0,cnt=0;
        
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++)
        {
            if(arr[i+1]-arr[i]==0) 
                continue;
            if(arr[i+1]-arr[i]==1) 
                cnt++;
            else 
            {
                if(cnt>max)
                    max=cnt;
                cnt=0;
            }
        }
        if(cnt>max)
            max=cnt;
         
	    return max+1;
    }
}
