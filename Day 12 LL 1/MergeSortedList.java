import java.util.*;

public class MergeSortedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode Merged = new ListNode();
        ListNode temp = Merged;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                temp.next = list1;
                list1 = list1.next;
            }
            else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        if(list1 != null){
            temp.next = list1;
        }
        if(list2 != null){
            temp.next = list2;
        }
        return Merged.next;
    }
}

// we will create a new linked list and we will compare the values of the two linked lists
// we will add the smaller value to the new linked list
// we will move the pointer of the linked list which has the smaller value
// we will repeat this process until we reach the end of both linked lists
// then we will return the new linked list which is the merged linked list of the two linked lists
// Time complexity - O(n+m) where n and m are the lengths of the two linked lists
// Space complexity - O(1) because we are not using any extra space