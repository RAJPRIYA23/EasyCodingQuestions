/*
Given a directed graph. The task is to do Breadth First Search of this graph.

User Task:
You don't need to read input or print anything. Your task is to complete the function bfs() takes the Graph and the number of vertices as its input 
and returns a list containing the BFS traversal of the graph starting from the 0th vertex.

Example:
Input:
2
5 4
0 1 0 2 0 3 2 4
3 2
0 1 0 2

Output:
0 1 2 3 4    // BFS from node 0
0 1 2

Explanation:
Testcase 1: 
0 is connected to 1 , 2 , 3
2 is connected to 4
so starting from 0 , bfs will be 0 1 2 3 4.
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Driverclass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int nov = sc.nextInt();
            int edg = sc.nextInt();

            for (int i = 0; i < nov; i++) list.add(i, new ArrayList<Integer>());

            for (int i = 1; i <= edg; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            ArrayList<Integer>res = new Traversal().bfs(list,nov);
            for (int i =0 ;i < res.size (); i++) 
                System.out.print (res.get (i) + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

/*
*  g[]: adj list of the graph
*  N : number of vertices
*/
class Traversal 
{
    static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> g, int v)
    {
        Boolean visited[] = new Boolean[v];
        Queue<Integer> q = new LinkedList<>();
        
        ArrayList<Integer> res = new ArrayList<Integer>();
        
        for(int i = 0; i < v; i++)
        {
            visited[i] = false;
        }
        
        visited[0] = true;
        q.add(0);
        
        while(!q.isEmpty())
        {
            int x = q.remove();
            res.add(x);
            for(int j = 0; j < g.get(x).size(); j++)
            {
                int data = g.get(x).get(j);
                if(visited[data] == false)
                {
                    visited[data] = true;
                    q.add(data);
                }
            }
        }
        
        return res;
    }
}
