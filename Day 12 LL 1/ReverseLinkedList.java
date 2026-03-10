
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

// we will use three pointers to reverse the linked list - prev, curr and next
// prev will point to the previous node, curr will point to the current node and next will point to the next node
// we will iterate through the linked list and reverse the pointers of the nodes until we reach the end of the linked list
// at the end of the iteration, prev will point to the new head of the reversed linked list, which we will return as the result of the function