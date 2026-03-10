
public class MiddleLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

// we will use two pointers to find the middle of the linked list - slow and fast
// slow will move one step at a time and fast will move two steps at a time
// when fast reaches the end of the linked list, slow will be at the middle of the linked list
// which we will return as the result of the function