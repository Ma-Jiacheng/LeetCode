package 移除链表元素;

import 链表节点.ListNode;

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        //处理头节点，判断头节点是否等于val，如果等于，删除头节点
        while(head != null && head.val == val){
            head = head.next;
        }
        //头节点不等于val时，当前节点指向头节点
        ListNode current = head;
        //遍历链表，直到当前节点为空（遍历完成）
        while(current != null){
            //判断当前节点的下一个节点是否等于val
            while(current.next != null && current.next.val == val){
                //如果等于，删除下一个节点
                current.next = current.next.next;
            }
            //若值不等于val，则进入下一个节点
            current = current.next;
        }
        return head;
    }
}
