/*
Given a connected undirected graph. Perform a Depth First Traversal of the graph.
Note: Use recursive approach.

Constraints:
1 <= T <= 100
2 <= N <= 104
1 <= E <= (N*(N-1))/2
Graph doesn't contain multiple edges and self loops.

Example:
Input:
2
5 4
0 1 0 2 0 3 2 4
4 3
0 1 1 2 0 3

Output:
0 1 2 4 3   
0 1 2 3

Explanation:
Testcase 1:
0 is connected to 1 , 2 , 3
1 is connected to 0
2 is connected to 0 and 4
3 is connected to 0
4 is connected to 2
so starting from 0 , dfs will be 0 1 2 4 3.
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

//Initial Template for Java


import java.util.*;
import java.lang.*;
import java.io.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-- > 0)
        {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int nov = sc.nextInt();
            int edg  =sc.nextInt();
            for(int i = 0; i < nov; i++)
                list.add(i, new ArrayList<Integer>());
                
            for(int i = 1; i <= edg; i++)
            {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
                list.get(v).add(u);
            }
            
            ArrayList<Integer> res = new Traversal().dfs(list, nov);
            for (int i = 0; i < res.size (); i++) 
                System.out.print (res.get(i) + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java


/*
g : adjacency list of graph
N : number of vertices

return a list containing the DFS traversal of the given graph
*/

class Traversal
{
    static ArrayList<Integer> res; 
    static Boolean visited[];
    
    static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> g, int v)
    {
        res = new ArrayList<>();
        visited = new Boolean[v];
        for(int i = 0; i < v; i++)
        {
            visited[i] = false;
        }
        
        dft(g, 0);
        return res;
    }
    
    static void dft(ArrayList<ArrayList<Integer>> g, int v)
    {
        visited[v] = true;
        res.add(v);
        for(int j = 0; j < g.get(v).size(); j++)
        {
            int data = g.get(v).get(j);
            if(visited[data] == false)
            {
                dft(g, data);
            }
        }
    }
}

