package 删除链表中间节点;

import 链表节点.ListNode;

//快慢指针
class SolutionTwo {
    public ListNode deleteMiddle(ListNode head) {
        //定义快慢两个指针，以及一个前驱指针保存用于连接删除中间节点后的链表
        ListNode fast = head;
        ListNode slow = head;
        ListNode pre = new ListNode(0);
        pre.next = head;
        //如果链表只有一个元素，直接删除，返回null
        if(fast.next == null){
            return null;
        }
        //移动快慢指针，遍历链表
        while(fast != null && fast.next != null){
            //快指针每次移动两个节点，慢指针每次移动一个节点，pre始终位于慢指针前一个节点
            fast = fast.next.next;
            pre = slow;
            slow = slow.next;
        }
        //快指针移动2，慢指针移动1，当快指针移动至链表末尾，慢指针恰好位于链表中间节点，使用pre删除慢指针节点，连接链表
        pre.next = pre.next.next;

        return head;
    }
}
