package 环形链表Ⅱ;

import 链表节点.ListNode;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        //定义快慢指针，起点均为头指针
        ListNode fast = head;
        ListNode slow = head;
        //快指针每次移动两个节点，慢指针每次移动一个节点。如果链表没有环，快指针会先遍历至null，结束并返回
        while (fast != null && fast.next != null) {
            //如果链表有环，则进入环后，快指针会进行循环，直到慢指针也进入环内
            //快指针每次追赶慢指针一个节点，一定会相遇
            fast = fast.next.next;
            slow = slow.next;
            //如果相遇，则证明链表有环
            if (fast == slow) {
                ListNode indexA = fast;
                ListNode indexB = head;
                //定位相遇的节点，使慢指针回到头节点
                while (indexA != indexB) {
                    //快慢指针同时每次遍历一个节点，当再次相遇，即为环的入口
                    indexA = indexA.next;
                    indexB = indexB.next;
                }
                //返回环的入口节点
                return indexA;
            }
        }
        //无环，返回null
        return null;
    }
}