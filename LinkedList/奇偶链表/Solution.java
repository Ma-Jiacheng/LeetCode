package 奇偶链表;

import 链表节点.ListNode;

class Solution {
    public ListNode oddEvenList(ListNode head) {
        //创建两个新节点，用来存储链表的奇偶节点
        ListNode odd = new ListNode(0);
        ListNode oddHead = odd;
        ListNode even = new ListNode(0);
        ListNode evenHead = even;
        //设置count，判断当前节点的奇偶
        int count = 0;
        //遍历链表
        while(head != null){
            //count记数为1，表示第一个节点
            count++;
            //节点为奇数，将其连接至odd之后
            if(count % 2 == 1){
                odd.next = head;
                odd = odd.next;
            } else {
                //节点为偶数，连接至even之后
                even.next = head;
                even = even.next;
            }
            head = head.next;
        }
        //将偶数链表even结尾设置为null
        even.next = null;
        //将奇数链表最后一个节点，连接偶数链表第一个节点
        odd.next = evenHead.next;
        //返回奇数链表头
        return oddHead.next;
    }
}
