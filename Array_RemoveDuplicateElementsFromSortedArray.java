/*
Given a sorted array A of size N. The function remove_duplicate takes two arguments .
The first argument is the sorted array A[ ] and the second argument is 'N' the size of the array and returns the size of the new converted array A[ ] with no duplicate element.

Constraints:
1 <= T <= 100
1 <= N <= 104
1 <= A[ ] <= 106

Example:
Input  (To be used only for expected output) :
2
5
2 2 2 2 2 
3
1 2 2
Output
2
1 2
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

class GfG
{
        /*You are required to complete this function */
	int remove_duplicate(int a[], int N)
	{
	    int cnt=0,last_number=0;
		for(int i=0;i<N;i++)
		{
		    if(last_number!=a[i])
		    {
		        last_number=a[i];
		        a[cnt]=last_number;
		        cnt++;
		    }
		}
		return cnt;
	}
}
