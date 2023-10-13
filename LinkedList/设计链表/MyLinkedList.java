package 设计链表;

import 链表节点.ListNode;

class MyLinkedList {
    int size;
    ListNode head;

    //初始化链表，长度为0，头节点值为0
    public MyLinkedList() {
        size = 0;
        head = new ListNode(0);
    }

    //获取链表任意节点元素
    public int get(int index) {
        //如果索引小于零或越界，返回-1
        if (index < 0 || index >= size) {
            return -1;
        }
        //设置当前节点指向头节点
        ListNode cur = head;
        //遍历链表index次，找到索引对应元素
        for (int i = 0; i <= index; i++) {
            cur = cur.next;
        }
        //返回元素的值
        return cur.val;
    }

    //向头节点前添加元素，相当于向0号添加节点
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    //向尾节点前添加元素，相当于向size号添加节点
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    //向链表任意位置添加节点
    public void addAtIndex(int index, int val) {
        //判断输入的index是否越界，如果越界，直接返回
        if (index < 0 || index > size) {
            return;
        }
        //创建要添加的新节点
        ListNode addNode = new ListNode(val);
        //遍历链表，到要添加节点的位置
        ListNode cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        //将新添加节点的后继节点，指向当前节点的后继节点
        addNode.next = cur.next;
        //将当前节点的后继，指向新添加的节点
        cur.next = addNode;
        //链表长度++
        size++;
    }

    //删除链表任意节点
    public void deleteAtIndex(int index) {
        //判断输入的index是否越界，如果越界，直接返回
        if (index < 0 || index >= size) {
            return;
        }
        //遍历链表，到要删除节点的位置
        ListNode cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        //将当前节点的后继节点指向后继节点的后继节点，删除后继节点（目标节点）
        cur.next = cur.next.next;
        size--;
    }
}
