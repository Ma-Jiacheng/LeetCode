package 反转链表;

import 链表节点.ListNode;

class Solution {
    public ListNode reverseList(ListNode head) {
        //设置当前节点为头节点
        ListNode cur = head;
        //设置一个前驱节点
        ListNode pre = null;
        //设置一个临时节点
        ListNode tmp;

        //循环反转，直到当前节点为空
        while (cur != null){
            //存储当前节点的下一个节点位置
            tmp = cur.next;
            //将当前节点由指向后一个变为指向前驱节点
            cur.next = pre;
            //改变后，pre、cur后移，反转下一个节点
            pre = cur;
            cur = tmp;
        }
        return pre;
    }
}
