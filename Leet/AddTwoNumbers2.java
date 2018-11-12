package com.example.neohelloworld.Leet;

//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
//
//        You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
//        Example:
//
//        Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//        Output: 7 -> 0 -> 8
//        Explanation: 342 + 465 = 807.

public class AddTwoNumbers2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;

        ListNode result = new ListNode(0);
        ListNode prev = result;
        int carry=0;

        while(l1!=null && l2!=null){
            prev.next = new ListNode((l1.val+l2.val+carry)%10);
            carry = l1.val+l2.val+carry >=10 ? 1 : 0;
            l1=l1.next;
            l2=l2.next;
            prev=prev.next;
        }

        while(l1!=null){
            prev.next = new ListNode((l1.val+carry)%10);
            carry = l1.val+carry >=10 ? 1 : 0;
            l1=l1.next;
            prev=prev.next;
        }

        while(l2!=null){
            prev.next = new ListNode((l2.val+carry)%10);
            carry = l2.val+carry >=10 ? 1 : 0;
            l2=l2.next;
            prev=prev.next;
        }

        if(carry!=0) prev.next = new ListNode(1);

        return result.next;
    }
}
