/*
Given an unsorted array arr[] of size N, rotate it by D elements (clockwise).

Constraints:
1 <= T <= 200
1 <= N <= 107
1 <= D <= N
0 <= arr[i] <= 105

Example:
Input:
2
5 2
1 2 3 4 5 
10 3
2 4 6 8 10 12 14 16 18 20

Output:
3 4 5 1 2
8 10 12 14 16 18 20 2 4 6

Explanation :
Testcase 1: 1 2 3 4 5  when rotated by 2 elements, it becomes 3 4 5 1 2.
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

#include <stdio.h>

int main() 
{
	int t;
    scanf("%d",&t);
    for(int i=1;i<=t;i++)
	{
	    int n=0,d=0,j=0;
	    scanf("%d%d",&n,&d);
	    int arr[n];
	    if(d>n)
	        d=d%n;
        for(j=0;j<n;j++)
        {
            scanf("%d",&arr[j]);
            if(j>=d)
                printf("%d ",arr[j]);
        }
        for(j=0;j<d;j++)
        {
            printf("%d ",arr[j]);
        }
	    printf("\n");
	}
	return 0;
}

