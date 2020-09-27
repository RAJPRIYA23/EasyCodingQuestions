/*
An ordinary Doubly Linked List requires space for two address fields to store the addresses of previous and next nodes. A memory efficient version of Doubly Linked List
can be created using only one space for address field with every node. This memory efficient Doubly Linked List is called XOR Linked List or Memory Efficient as the list
uses bit-wise XOR operation to save space for one address.
Given stream of data of size N for the linked list, your task is to complete the function insert() and printList(). The insert() function pushes (or inserts at beginning) 
the given data in the linked list and the printList() function returns the linked list as a list.
Note: There is an utility function XOR() that takes two Node pointer to get the bit-wise XOR of the two Node pointer. Use this function to get the XOR of the two pointers.

Example 1:
Input:
LinkedList: 9<->5<->4<->7<->3<->10
Output:
10 3 7 4 5 9
9 5 4 7 3 10

Example 2:
Input:
LinkedList: 58<->96<->31
Output:
31 96 58
58 96 31
Your Task:
The task is to complete the function insert() and printList() as required.
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

#include <stdio.h>
#include <stdlib.h>
#include <stdint.h>

struct Node
{
	int data;
	struct Node* npx;
};

struct Node* XOR (struct Node *a, struct Node *b)
{
	return (struct Node*) ((uintptr_t) (a) ^ (uintptr_t) (b));
}

struct Node* insert(struct Node* head, int data);

void printList (struct Node *head);

int main ()
{
    int t;
    scanf("%d", &t);
    while(t--)
    {
        struct Node *head = NULL;
        int n, tmp;
        
        scanf("%d", &n);
        while(n--)
        {
            scanf("%d", &tmp);
            head = insert(head, tmp);
        }
        printList (head);
        printf("\n");
    }
	return (0);
}
// } Driver Code Ends


/*
Structure of linked list is as
struct Node
{
	int data;
	struct Node* npx; 
};

Utility function to get XOR of two Struct Node pointer
use this function to get XOR of two pointers 
struct Node* XOR (struct Node *a, struct Node *b)
{
	return (struct Node*) ((uintptr_t) (a) ^ (uintptr_t) (b));
}
*/


// function should insert the data to the front of the list
struct Node* insert(struct Node *head, int data)
{
    struct Node *curr = (struct Node *)malloc(sizeof(struct Node));
    
    curr->data = data;
    
    if(head == NULL)
    {
        curr->npx = NULL;
        head = curr;
        return head;
    }
    
    curr->npx = head;
    head = curr;
    return head;
}

void printBack(struct Node *head)
{
    if(head != NULL)
    {
        printBack(head->npx);
        printf("%d ", head->data);
    }
}

// function should prints the contents of doubly linked list
// first in forward direction and then in backward direction
// you should print a next line after printing in forward direction
void printList (struct Node *head)
{
    
    struct Node *curr = head; 
    
	while(curr != NULL)
	{
	    printf("%d ", curr->data);
	    curr = curr->npx;
	}
	printf("\n");
	
	printBack(head);
}
