/*
Given elements as nodes of the two linked lists. The task is to multiply these two linked lists, say L1 and L2. 
Note: The output could be large take modulo 10^9+7.

User Task:

The task is to complete the function multiplyTwoLists() which should multiply the given two linked lists and return the result.

Constraints:

1 <= T <= 100
1 <= N, M <= 100

Example:
Input:
2
2
3 2
1
2
3
1 0 0
2
1 0 

Output:
64
1000

Explanation:
Testcase 1: 32*2 = 64.

Testcase 2: 100*10 = 1000.
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}

class MultiplyTwoLL{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Node head=null;
			Node phead=null;
			int n=sc.nextInt();
			while(n-->0){
				int n1=sc.nextInt();
				if(head==null)
				head=new Node(n1);
			else{
				addHead(head,n1);
			}
			}
			int m=sc.nextInt();
			while(m-->0){
				int n1=sc.nextInt();
				if(phead==null)
				phead=new Node(n1);
			else{
				addPhead(phead,n1);
			}
			}
		GfG g=new GfG();

System.out.println(g.multiplyTwoLists(head,phead));
		}
	}
    public static void addHead(Node node,int a) {
          if (node == null)
            return;
		if(node.next==null)
			node.next=new Node(a);
		else
			addHead(node.next,a);
	}
	public static void addPhead(Node node,int a){
		 if (node == null)
            return;
		if(node.next==null)
		node.next=new Node(a);
	else
		addPhead(node.next,a);
	}
	}
	
	// } Driver Code Ends


/*Node is defined as
class Node
{
    int data; 
    Node next;
    Node(int data) {
        this.data=data;
        this.next = null;
    }
}*/

class GfG
{
  /*You are required to complete this method */
  
   public long multiplyTwoLists(Node l1,Node l2)
   {
        Node temp1 = l1, temp2= l2;
        
        long mod = 1000000007L;
        long num1 = 0, num2 = 0;
        
        while (temp1 != null || temp2 != null)
        {
            if(temp1 != null)
            {
                num1 = ( (num1 % mod) * 10 ) % mod + temp1.data;
                temp1 = temp1.next;
            }
            
            if(temp2 != null)
            {
                num2 = ( (num2 % mod) * 10 ) % mod + temp2.data;
                temp2 = temp2.next;
            }
        }
        return ( (num1 % mod) * (num2 % mod)) % mod;
   }
   
}
