/*
You are given an array A, of N elements. Find minimum index based distance between two elements of the array, x and y.

Example:
Input:
N = 4
A[] = {1,2,3,2}
x = 1, y = 2
Output: 1
Explanation: x = 1 and y = 2. There are
two distances between x and y, which are
1 and 3 out of which the least is 1.
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

/*Complete the function below*/
class GfG
{
    long minDist(long arr[], int n, long x, long y)
    {
        int min=-1,pos_x=-1,pos_y=-1,cnt=0;
        Boolean prev_x=false, prev_y=false;
        int dist[] = new int[n];
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                pos_x=i;
                prev_x=true;
            }
            if(arr[i]==y)
            {
                pos_y=i;
                prev_y=true;
            }
            if(prev_x==true && prev_y==true)
            {
                dist[cnt]=Math.abs(pos_x-pos_y);
                cnt++;
                if(pos_y>pos_x)
                    prev_x=false;
                else
                    prev_y=false;
                
            }
        }
        
        if(dist[0]==0)
            min=-1;
        else
        {
            min=dist[0];
            for(int i=0;i<cnt;i++)
            {
                if(dist[i]<min)
                    min=dist[i];
            }
        }
        return min;
    }
}
