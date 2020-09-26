/*
Given a Linked List of integers, write a function to modify the linked list such that all even numbers appear before all the odd numbers in the modified linked list.
Also, keep the order of even and odd numbers same.

Constraints:

1 ≤ T ≤ 100
1 ≤ N ≤ 100
1 ≤ size of elements ≤ 1000

Example:

Input
3
7
17 15 8 9 2 4 6
4
1 3 5 7
7
8 12 10 5 4 1 6

Output
8 2 4 6 17 15 9
1 3 5 7
8 12 10 4 6 5 1
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
	public static void main (String[] args) throws Exception
	{
	    BufferedReader br = new BufferedReader
		(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine().trim()); 
        
	    while(t-- >0)
	    {
	        LinkedList<Integer> ll1  = new LinkedList<Integer>(); 
	        LinkedList<Integer> ll2  = new LinkedList<Integer>(); 
	        
	        int n = Integer.parseInt(br.readLine().trim());
	        String line = br.readLine().trim();
	    
            StringBuffer sb = new StringBuffer();

            for(int i=0; i< line.length(); i++)
            {

                if ( (line.charAt(i)) == ' ')
                {
                    int temp = Integer.parseInt(sb.toString());
                    if(temp%2 == 0)
                        ll1.add(temp);
                    else
                        ll2.add(temp);
                    sb.delete(0, sb.length());
                }
            
                else
                {
                    sb.append(line.charAt(i));
                }

                if(i == line.length()-1)
                {
                    int temp = Integer.parseInt(sb.toString());
                    if(temp%2 == 0)
                        ll1.add(temp);
                    else
                        ll2.add(temp);
                }
            }
            
            sb.delete(0, sb.length());
            
            ll1.addAll(ll2);
            for(int i=0; i<ll1.size(); i++)
            {
                sb.append(ll1.get(i) + " ");
            }
            System.out.println(sb);
	    }
	}
}
