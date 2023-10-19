package 链表最大孪生和;

import 链表节点.ListNode;

class Solution {
    public int pairSum(ListNode head) {
        //创建快慢指针，设置max初始值
        ListNode fast = head;
        ListNode slow = head;
        int max = Integer.MIN_VALUE;
        //快慢指针遍历链表，找到链表的中间节点
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        //找到链表中间节点后，反转后半个链表，即[1->2->3->4->5->6] --> [1->2->3->6->5->4]
        ListNode tail = reverseList(slow);
        //此时head位于链表头，tail反转至链表中间，遍历至结束
        while(tail != null){
            //每遍历一次，将两个节点的和与max作比较，保存较大的一个
            max = Math.max(max, head.val + tail.val);
            //遍历下一对节点
            head = head.next;
            tail = tail.next;
        }
        return max;
    }
    //反转链表操作
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        ListNode temp;

        while (cur != null) {
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}
