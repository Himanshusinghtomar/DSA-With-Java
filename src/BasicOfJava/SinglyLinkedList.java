package BasicOfJava;
/*A singly linked list is a fundamental data structure,
it consists of nodes where each node contains a data field and a reference to the next node in the linked list.
The next of the last node is null,
 indicating the end of the list. Linked Lists support efficient insertion and deletion operations.
 */
public class SinglyLinkedList {
    // Function to traverse and print the singly linked list
    public static void traverseList(Node head) {

        // A loop that runs till head is nullptr
        while (head != null) {

            // Printing data of current node
            System.out.print(head.data + " ");

            // Moving to the next node
            head = head.next;
        }
        System.out.println();
    }

    // Driver code
    public static void main(String[] args) {

        // Create a hard-coded linked list:
        // 10 -> 20 -> 30 -> 40
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        // Example of traversing the node and printing
        traverseList(head);
    }

}
// Definition of a Node in a singly linked list
class Node {
    int data;
    Node next;

    // Constructor to initialize the node with data
    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}