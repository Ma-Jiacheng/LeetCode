package 删除链表中间节点;

import 链表节点.ListNode;

//两次遍历
class SolutionOne {
    public ListNode deleteMiddle(ListNode head) {
        //定义指针，用于遍历链表
        ListNode cur = head;
        //count用于计算链表长度
        int count = 1;
        //第一次遍历链表，得到链表长度
        while(cur != null && cur.next != null){
            cur = cur.next;
            count++;
        }
        //特殊处理，如果链表长度为1，直接删除返回null。长度为2，删除第二个节点返回头节点
        if(count == 1){
            return null;
        } else if(count == 2){
            head.next = null;
            return head;
        }
        //将指针返回head
        cur = head;
        //取链表长度中值
        count = count / 2;
        //移动指针至链表中间的前一个节点
        while(--count > 0){
            cur = cur.next;
        }
        //删除链表中间节点
        cur.next = cur.next.next;

        return head;
    }
}