package 删除倒数第N个节点;

import 链表节点.ListNode;

//快慢指针
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //设置虚拟头节点
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        //定义快慢指针，指向虚拟头节点
        ListNode fastIndex = dummyNode;
        ListNode slowIndex = dummyNode;
        //移动快指针，至n+1个节点处
        for (int i = 0; i < n + 1; i++) {
            fastIndex = fastIndex.next;
        }
        //同时移动快慢指针，因为快指针已经移动了n+1次
        //所以，当快指针到达链表末尾为null时，慢指针落后快指针n+1个节点，即倒数n个节点的前一个节点
        while (fastIndex != null) {
            fastIndex = fastIndex.next;
            slowIndex = slowIndex.next;
        }
        //删除倒数n个节点
        slowIndex.next = slowIndex.next.next;
        //返回头节点
        return dummyNode.next;
    }
}