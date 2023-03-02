// Delete even nodes from the list
// medium
// Problem Statement
// Given a circular singly linked list containing N nodes, the task is to delete all the even nodes from the list.

// Note:-The first digit of the list will always be an odd integer.

// Note:Examples in Sample Input and Output just shows how a linked list will look like depending on the questions. Do not copy-paste as it is in custom input
// Input
// User Task:
// Since this will be a functional problem, you don't have to take input. You just have to complete the function deleteEven() that takes head node of circular linked list as parameter.

// Constraints:
// 1 <=N <= 1000
// 1 <= Node. data <= 1000
// Output
// Return the head of the modified list
// Example
// Sample Input:-
// 4
// 1 2 3 4

// Sample Output:-
// 1 3

/*

 class Node 
{  
    int data;  
    Node next;  
    Node(int x)  
    {  
        data = x;  
        next = null;  
    }  
};
*/
static Node deleteEven(Node head){
    Node ptr = head;
    Node next;
    do{
        if(ptr.data % 2 == 0)
        deleteNode(head, ptr);
        next = ptr.next;
        ptr = next;
    }
    while(ptr != head);
    return head;
} 
static Node deleteNode(Node head_ref, Node del){
    Node temp = head_ref;
    if(head_ref == del)
        head_ref = del.next;
    while(temp.next != del){
        temp = temp.next;
    }
    temp.next = del.next;

    return head_ref;
}