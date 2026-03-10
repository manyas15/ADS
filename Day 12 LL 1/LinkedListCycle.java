// linked list - linear data structure
// as in arr int[] arr = {1,2,5,6,7} -> data is stored in contagious form
// linked list is an inbuilt data structure in java, we can use it by importing java.util.LinkedList
// it is a collection of nodes, each node contains data and a reference to the next node
// LinkedList<Integer> list = new LinkedList<>();
// list.add(1);
// list.add(2);
// list.add(3); -> this way we can add elements to the linked list
// list.get(0) -> this will return the first element of the linked list
// LinkedList<Object> list = new LinkedList<>();
// list.add(1);
// list.add("Manya");
// list.add(3.14f); -> this way we can add different types of data to the linked list

// If we create arraylist - which is a class that implements the List interface, it uses a dynamic array to store the elements.
// ArrayList<Integer> arr = new ArrayList<>();
// arr.add(1);
// arr.add("Manya");
// they will also add

// but in linked list we data from both sides - we can add elements at the beginning and at the end of the linked list
// this is done by using inbuilt functions like addFirst() and addLast(), removeFirst() and removeLast() to remove elements from the linked list

// in linked list element is stored in node form, each node contains data and a reference to the next node
// in data value is stored in the node and reference to the next node is stored in the next pointer of the node
// we can also have a reference to the previous node in the linked list, this is called a doubly linked list
// DDL - in which each node contains a reference to the next node and a reference to the previous node

// Class Node{
//     int data;
//     Node next;
//     Node(){
//         this.data = data;
//         this.next = null;
//     }
//}   -> we will always linkedlist in this way

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }

    ListNode() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}    
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}