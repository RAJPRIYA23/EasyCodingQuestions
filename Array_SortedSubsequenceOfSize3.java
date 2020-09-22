/*
Given an array A of N integers, find any 3 elements in it such that A[i] < A[j] < A[k] and i < j < k.

Example 1:

Input:
N = 5
A[] = {1,2,1,1,3}
Output: 1
Explanation: a sub-sequence 1 2 3 exist.
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

/*Complete the function below*/

class GfG
{
    ArrayList<Integer> find3Numbers(ArrayList<Integer> arr, int n)
    {
        ArrayList<Integer> v=new ArrayList<Integer>(3);
        
        int less[] = new int[n];
        int min = 0;
        less[0] = -1;
        
        for(int i=1;i<n;i++)
        {
            if(arr.get(i)<=arr.get(min))
            {
                min = i;
                less[i]=-1;
            }
            else
                less[i] = min;
        }
   
    
        int great[] = new int[n];
        int max = n-1;
        great[n-1] = -1;
        
        for(int k=n-2;k>=0;k--)
        {
            if(arr.get(k)>=arr.get(max))
            {
                max=k;
                great[k]=-1;
            }
            else
                great[k]=max;
        }
   
   
        for(int j=0;j<n;j++)
        {
            if(less[j]!=-1  &&  great[j]!=-1)
            {
                v.add(arr.get(less[j]));
                v.add(arr.get(j));
                v.add(arr.get(great[j]));
                break;
            }
        }
        
        return v;
    }
}
