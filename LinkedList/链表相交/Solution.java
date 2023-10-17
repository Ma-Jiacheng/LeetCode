package 链表相交;

import 链表节点.ListNode;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //创建两个指针，指向两个链表的头节点
        ListNode curA = headA;
        ListNode curB = headB;
        //保存两个链表的长度
        int lenA = 0;
        int lenB = 0;
        //遍历链表A，得到A链表的长度
        while (curA != null) {
            lenA++;
            curA = curA.next;
        }
        //遍历链表B，得到B链表的长度
        while (curB != null) {
            lenB++;
            curB = curB.next;
        }
        //将指针返回至链表头
        curA = headA;
        curB = headB;
        //判断两个链表的长度，始终让A链表为较长的那个
        if (lenB > lenA) {
            ListNode tmpNode = curA;
            curA = curB;
            curB = tmpNode;

            int tmpLen = lenA;
            lenA = lenB;
            lenB = tmpLen;
        }
        //保证两个链表从长度相同的位置开始一起遍历，移动A链表指针至lenA-lenB处
        int gap = lenA - lenB;
        while (gap-- > 0) {
            curA = curA.next;
        }
        //此时A,B链表长度相等，同时遍历，直到找到指针相同的节点，即为交点
        while (curA != null){
            if (curA == curB){
                return curA;
            }
            curA = curA.next;
            curB = curB.next;
        }
        //遍历完成没有发现交点，返回null
        return null;
    }
}