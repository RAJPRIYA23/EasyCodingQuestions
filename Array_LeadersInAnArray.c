/*
Given an array of positive integers. Your task is to find the leaders in the array.
Note: An element of array is leader if it is greater than or equal to all the elements to its right side. Also, the rightmost element is always a leader. 

Constraints:
1 <= T <= 100
1 <= N <= 107
0 <= Ai <= 107

Example:
Input:
3
6
16 17 4 3 5 2
5
1 2 3 4 0
5
7 4 5 7 3
Output:
17 5 2
4 0
7 7 3

Explanation:
Testcase 3: All elements on the right of 7 (at index 0) are smaller than or equal to 7. Also, all the elements of right side of 7 (at index 3) are smaller than 7.
And, the last element 3 is itself a leader since no elements are on its right.
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

#include <stdio.h>
#include <stdbool.h>

int main() 
{
    int t=0,i=0;
    scanf("%d",&t);
    for(i=1;i<=t;i++)
    {
        int n=0,j=0,cnt=0;
        scanf("%d",&n);
        int arr[n], arr2[n];
        
        for(j=0;j<n;j++)
        {
            scanf("%d",&arr[j]); 
        }
        
        arr2[cnt]=arr[n-1];
        int top=arr2[cnt];
        cnt++;
            
        for(j=n-2;j>=0;j--)
        {
            if(arr[j]>=top)
            {
                arr2[cnt]=arr[j];
                top=arr2[cnt];
                cnt++;
            }
        }
        for(j=cnt-1;j>=0;j--)
        {
            printf("%d ",arr2[j]);
        }
        printf("\n");
	}
    return 0;
}
