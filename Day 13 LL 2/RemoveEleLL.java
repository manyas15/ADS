

public class RemoveEleLL {

    public class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        while (prev.next != null) {
            if (prev.next.val == val) {
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        RemoveEleLL solution = new RemoveEleLL();
        ListNode head = solution.new ListNode(1);
        head.next = solution.new ListNode(2);
        head.next.next = solution.new ListNode(6);
        head.next.next.next = solution.new ListNode(3);
        head.next.next.next.next = solution.new ListNode(4);
        head.next.next.next.next.next = solution.new ListNode(5);
        head.next.next.next.next.next.next = solution.new ListNode(6);
        int valToRemove = 6;
        ListNode result = solution.removeElements(head, valToRemove);
        while (result != null) {
            System.out.print(result.val + " "); // Output: 1 2 3 4 5
            result = result.next;
        }
    }
}


/*
LeetCode 19 — Remove Nth Node From End of List (Medium)
LeetCode 142 — Linked List Cycle II (Medium)
LeetCode 24 — Swap Nodes in Pairs (Medium)
 */
