package Leetcode;

///**
// * Definition for singly-linked list.

public class MergeTwoSortedLists { 
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode root = new ListNode();
        ListNode previousNode = root; 
        while (list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                previousNode.next = list1;
                list1 = list1.next;
            }else{
                previousNode.next = list2;
                list2 = list2.next;
            }
            previousNode = previousNode.next;
        }
        previousNode.next = list1 != null ? list1 : list2;
        return root.next;
    }
}
