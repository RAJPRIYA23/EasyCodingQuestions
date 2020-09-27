/*
Given a Binary Search Tree of size N, that may be unbalanced. Your task is to complete the function buildBalancedTree(), 
that convert the given BST into a balanced BST that has minimum possible height.

Examples :

Input:
       30
      /
     20
    /
   10
Output:
     20
   /   \
 10     30

Input:
         4
        /
       3
      /
     2
    /
   1
Output:
      3            3           2
    /  \         /  \        /  \
   1    4   OR  2    4  OR  1    3   OR ..
    \          /                   \
     2        1                     4 
  
Constraints:
1<=T<=100
1<=N<=200

Example:
Input:
2
3
30 20 10
5
10 8 7 6 5
Output:
2
3
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------


import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node right, left;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

class BinarySearchTree
{
     static Node insert(Node node, int data)
    {
     if (node == null)
     {
            return (new Node(data));
    } else 
        {
             
            /* 2. Otherwise, recur down the tree */
            if (data <= node.data)
            {
                node.left = insert(node.left, data);
            } else 
            {
                node.right = insert(node.right, data);
            }
 
            /* return the (unchanged) node pointer */
            return node;
        }
    
    }
    
    int height(Node node) 
{
   if (node==null) return 0;
   else
   {
       int lDepth = height(node.left);
       int rDepth = height(node.right);
       if (lDepth > rDepth)
           return(lDepth+1);
       else 
           return(rDepth+1);
   }
} 
    
         public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node root = null;
            
            while(n-- > 0)
            {
                int data = sc.nextInt();
                root = insert(root, data);
            }
           
             GfG gfg = new GfG();
             
           root =  gfg.buildBalancedTree(root);
            // preOrder(root);
            BinarySearchTree bst = new BinarySearchTree();
             System.out.println(bst.height(root));
        }
    }
    
     void preOrder(Node node) 
    {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
}

// } Driver Code Ends


/*class Node
{
    int data;
    Node right, left;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/

class GfG
{
    ArrayList<Integer> inorder = new ArrayList<Integer>();
        
    void inOrder(Node root)
    {
        if(root != null)
        {
            inOrder(root.left);
            inorder.add(root.data);
            inOrder(root.right);
        }
    }
    
    Node buildBalancedTree(Node root) 
    {
        inorder.clear();
        inOrder(root);
       
        root = construct(0, inorder.size()-1);
        return root;
    }
    
    Node construct(int start, int end)
    {
        if(start > end)
            return null;
        
        int mid = (start + end)/2; 
        Node node = new Node(inorder.get(mid));
        
        node.left = construct(start, mid-1);
        node.right = construct(mid+1, end);
        
        return node;
    }
}
