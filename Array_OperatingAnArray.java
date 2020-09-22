/*
Given an array A of size N, your task is to do some operations, i.e., search an element, insert an element,
and delete an element by completing the functions. Also, all functions should return a boolean value.

Constraints:
1 <= T <= 100
1 <= N <= 100
1 <= Ai <= 100

Example:
Input:
1
5
2 4 1 0 6
1 2 2 0
Output:
1 1 1
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------


/*Complete the function(s) below*/
class GfG
{		
	public boolean searchEle(int a[],int x)
    {
		for(int i=0;i<a.length;i++)
		{
		    if(a[i]==x)
		        return true;
		}
	    return false;	
    }
	public boolean insertEle(int a[],int y,int yi)
    {
        for(int i=0;i<a.length;i++)
		{
		    if(yi==i)
		    {
		        a[i]=y;
		        return true;
		    }
		}
		return false;
	}
	public boolean deleteEle(int a[],int z)
    {
		for(int i=0;i<a.length;i++)
		{
		    if(a[i]==z)
		    {
		        a[i]=-1;
		    }
		}
		return true;
	}
}
