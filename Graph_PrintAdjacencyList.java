/*
Given number of edges 'E' and vertices 'V' of a bidirectional graph. Your task is to build a graph through adjacency list and print the adjacency list for each vertex.

Example:
Input:
2
5 7
0 1
0 4
1 2
1 3
1 4
2 3
3 4
3 3
0 1
1 2
2 0

Output:
0-> 1-> 4
1-> 0-> 2-> 3-> 4
2-> 1-> 3
3-> 1-> 2-> 4
4-> 0-> 1-> 3
0-> 1-> 2
1-> 0-> 2
2-> 1-> 0

Explanation:
Testcase 1: Given graph has 5 nodes and 7 edges. After creating adjacency list of given graph, we have list as:
0-> 1-> 4
1-> 0-> 2-> 3-> 4
2-> 1-> 3
3-> 1-> 2-> 4
4-> 0-> 1-> 3
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
        int t = Integer.parseInt(br.readLine()); 
        
        while(t-- > 0)
        {
            String str[] = br.readLine().trim().split(" ");
            int v = Integer.parseInt(str[0]);
            int e = Integer.parseInt(str[1]);
            
            LinkedList<LinkedList<Integer>> adjl = new LinkedList<LinkedList<Integer>>();
            
            for (int i = 0; i < v; i++) 
            {
                adjl.add(new LinkedList<Integer>());
            }
                
            for(int i = 0; i < e; i++)
            {
                String string[] = br.readLine().trim().split(" ");
                int v1 = Integer.parseInt(string[0]);
                int v2 = Integer.parseInt(string[1]);
                adjl.get(v1).add(v2);
                adjl.get(v2).add(v1);
            }
            
            for(int i = 0; i < v; i++)
            {
                System.out.print(i); 
                for (int j = 0; j < adjl.get(i).size(); j++)
                { 
                    System.out.print("-> "+adjl.get(i).get(j)); 
                } 
                System.out.println();
            }
        }
	}
}
