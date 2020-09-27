/*
Given a Binary Tree. Check whether all of its nodes have the value equal to the sum of their child nodes.

Example 1:

Input:
     10
    /
  10 
Output: 1
Explanation: Here, every node is sum of
its left and right child.

Your Task:
You don't need to read input or print anything. Your task is to complete the function isSumProperty()
that takes the root Node of the Binary Tree as input and returns 1 if all the nodes in the tree satisfy the following properties. 
Else, it returns 0.
For every node, data value must be equal to the sum of data values in left and right children.
Consider data value as 0 for NULL child.  Also, leaves are considered to follow the property.
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

//Initial Template for Java




//Initial Template for Java

//Contributed by Sudarshan Sharma
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
    void inOrder(Node node) {
        if (node == null) {
            return;
        }
 
        inOrder(node.left);
        System.out.print(node.data + " ");
 
        inOrder(node.right);
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t-- > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
			    Tree g=new Tree();
                System.out.println(g.isSumProperty(root));
    	        
	        }
	}
}

// } Driver Code Ends


//User function Template for Java


/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node left,right;
	
	Node(int key)
	{
	    data = key;
	    left = right = null;
	}
}

*/
class Tree
{
    public static int isSumProperty(Node root)
    {
        int res = result(root);
        if(res != -1)
            return 1;
        else
            return 0;
        
    }
    
    static int result(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        
        if(root.left == null && root.right == null)
        {
            return root.data;
        }
        
        
        int leftsum = result(root.left);
        if(leftsum == -1)
            return -1;
            
        int rightsum = result(root.right);
        if(rightsum == -1)
            return -1;
            
        if(leftsum + rightsum != root.data)
        {
            return -1;
        }
        
        return root.data;
        
    }
}
