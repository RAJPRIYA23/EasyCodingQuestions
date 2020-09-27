/*
Given a Binary Search Tree of size N, find the Median of its Node values.

Example 1:

Input:
       6
     /   \
   3      8   
 /  \    /  \
1    4  7    9
Output: 6
Explanation: Inorder of Given BST will be:
1, 3, 4, 6, 7, 8, 9. So, here median will 6.

Your Task:
You don't need to read input or print anything. Your task is to complete the function findMedian() which takes the root of the Binary Search Tree
as input and returns the Median of Node values in the given BST.

Median of the BST is:
If number of nodes are even: then median = (N/2 th node + (N/2)+1 th node)/2
If number of nodes are odd : then median = (N+1)/2th n
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

//Initial Template for Java

import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class GfG {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(Node root)
    {
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
    	    	
                Tree g = new Tree();
        		g.findMedian(root);
        		System.out.println();
                    t--;
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Tree
{
    static int inOrder(Node root, int count)
    {
        if(root != null)
        {
            count = inOrder(root.left, count);
            count++;
            count = inOrder(root.right, count);
        }
        return count;
    }
    
    static int cnt = 0;
    
    static int[] median(Node root, int mid, int[] arr)
    {
        if(root != null)
        {
            arr = median(root.left, mid, arr);
            cnt++;
            if(mid == cnt)
                arr[0] = root.data;
            if(mid+1 == cnt)
                arr[1] = root.data;
                
            arr = median(root.right, mid, arr);
        }
        return arr;
    }
    
    public static void findMedian(Node root)
    {
        int count = 0;
        count = inOrder(root,count);
        
        int arr[] =new int[2];
        
        cnt = 0;
        arr = median(root, (int)Math.ceil((double)count/2), arr);
        
        if(count%2 != 0)
            System.out.print(arr[0]);
        else
        {
            double temp = ((double)arr[0]+arr[1])/2;
            if(temp == (int)temp)
                System.out.print((int)temp);
            else
                System.out.print(temp);
        }
    }
}
