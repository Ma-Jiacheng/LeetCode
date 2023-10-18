package 移除重复节点;

import 链表节点.ListNode;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public ListNode removeDuplicateNodes(ListNode head) {
        //链表为空，直接返回null
        if (head == null) {
            return null;
        }
        //创建Set集合，利用特性实现重复元素检查
        Set<Integer> single = new HashSet<Integer>();
        //将链表头元素添加至Set集合
        single.add(head.val);
        //设置前驱节点
        ListNode preNode = head;
        //遍历链表
        while (preNode.next != null){
            //设置后继节点，始终位于前驱节点后一位
            ListNode curNode = preNode.next;
            //将后继节点的值向Set集合中添加，如果成功，则前驱节点向后移动一位
            if (single.add(curNode.val)){
                preNode = preNode.next;
            } else {
                //如果添加失败，则后继节点的元素重复，将其删除
                preNode.next = preNode.next.next;
            }
        }
        //返回链表头
        return head;
    }
}