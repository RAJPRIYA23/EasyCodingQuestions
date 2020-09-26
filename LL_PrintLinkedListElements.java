/*
You are given the pointer to the head node of a linked list. You have to print all of its elements in order in a single line.
User Task:
The task is to complete the function display() which prints the elements of the linked list.

Example:
Input:
2
2
1 2
1
4

Output:
1 2
4
Explanation:
Testcase 1: Here the first line denotes an integer 'T' the no of test cases and the next line denotes 'N' the no of nodes of linked list . 
Then the line after that contains N space separated integers denoting the values of the nodes of the linked list.
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.*;

class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}



public class linkedlist {

    Node head;
    public void addToTheLast(Node node) {

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = node;
        }
    }
 public static void main(String args[]) {

        int value;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            linkedlist llist = new linkedlist();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            llist.addToTheLast(head);
                    
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }	
            GfG pl=new GfG();
            pl.printList(llist.head);
        System.out.println();
            t--;
        }
    }
}// } Driver Code Ends


/* Node is defined as
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/

//--------------------------------------------------------------------------------------------------------
class GfG
{
    // Print elements of a linked list on console
    // head pointer input could be NULL as well
    // for empty list
    void printList(Node head)
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
