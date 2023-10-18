package 分割链表;

import 链表节点.ListNode;

class Solution {
    public ListNode partition(ListNode head, int x) {
        //新建两张链表，存储大于等于及小于x的元素
        ListNode small = new ListNode(0);
        ListNode large = new ListNode(0);
        //设置新链表头的位置
        ListNode sHead = small;
        ListNode lHead = large;
        //遍历链表
        while (head != null) {
            //找到值大于等于x的节点，将其添加至large链表
            if (head.val >= x) {
                large.next = head;
                large = large.next;
            } else {
                //找到值小于x的节点，将其添加至small链表
                small.next = head;
                small = small.next;
            }
            head = head.next;
        }
        //将large链表末尾设置为空
        large.next = null;
        //将small链表尾部连接large链表头部
        small.next = lHead.next;
        //返回small链表头，此时两张链表按顺序拼接在一起
        return sHead.next;
    }
}
