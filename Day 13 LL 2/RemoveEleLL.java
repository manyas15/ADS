public class RemoveEleLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node removeElement(Node head, int val) {
        while (head != null && head.data == val) {
            head = head.next;
        }

        Node current = head;

        while (current != null && current.next != null) {
            if (current.next.data == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(6);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next = new Node(6);

        System.out.println("Original list:");
        printList(head);

        int valToRemove = 6;
        head = removeElement(head, valToRemove);

        System.out.println("List after removing " + valToRemove + ":");
        printList(head);
    }
}


/*
LeetCode 19 — Remove Nth Node From End of List (Medium)
LeetCode 142 — Linked List Cycle II (Medium)
LeetCode 24 — Swap Nodes in Pairs (Medium)
 */