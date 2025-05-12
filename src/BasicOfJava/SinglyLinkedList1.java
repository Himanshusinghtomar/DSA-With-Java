package BasicOfJava;

public class SinglyLinkedList1 {

    private Node head;

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    private void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    private void remove(int data) {
        Node current = head;
        while (current.data != data) {
            if (current.next == null) {
                break;
            }
            current = current.next;
        }
    }

    private void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList1 sll = new SinglyLinkedList1();
        sll.insert(1);
        sll.insert(2);
        sll.insert(3);
        sll.insert(4);
        sll.insert(5);
        sll.insert(6);

        sll.display();
    }
}

