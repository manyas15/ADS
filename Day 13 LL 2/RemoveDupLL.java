

public class RemoveDupLL {

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

    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        while (node != null && node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        RemoveDupLL solution = new RemoveDupLL();
        ListNode head = solution.new ListNode(1);
        head.next = solution.new ListNode(1);
        head.next.next = solution.new ListNode(2);
        ListNode result = solution.deleteDuplicates(head);
        while (result != null) {
            System.out.print(result.val + " "); // Output: 1 2
            result = result.next;
        }
    }
}
