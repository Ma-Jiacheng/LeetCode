package 交换链表中的节点;

import 链表节点.ListNode;

class Solution {
    public ListNode swapPairs(ListNode head) {
        //设置虚拟头节点
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        //当前节点指向虚拟头节点
        ListNode cur = dummyHead;

        //定义临时节点，两个交换节点
        ListNode temp;
        ListNode firstNode;
        ListNode secondNode;

        //保证拥有两个不为空的节点，进行循环
        while (cur.next != null && cur.next.next != null){
            //保存第三个节点的位置
            temp = cur.next.next.next;
            //保存一号节点的位置
            firstNode = cur.next;
            //保存二号节点的位置
            secondNode = cur.next.next;

            //当前节点（虚拟头节点）指向原第二个节点
            cur.next = secondNode;
            //原第二个节点指向原头节点，实现一二两个节点的交换
            secondNode.next = firstNode;
            //此时二号节点为头节点，一号节点为第二个节点，将一号节点next指向三号节点temp
            firstNode.next = temp;
            //将当前节点移动至三号节点前一个节点（原头节点）
            cur = firstNode;
        }
        return dummyHead.next;
    }
}