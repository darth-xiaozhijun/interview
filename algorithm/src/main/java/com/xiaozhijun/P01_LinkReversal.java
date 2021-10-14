package com.xiaozhijun;

/**
 * 链表翻转
 * https://leetcode-cn.com/problems/UHnkqh/submissions/
 */
public class P01_LinkReversal {
    public static void main(String[] args) {
        Node head = new Node(1,new Node(2,new Node(3,new Node(4,new Node(5,null)))));
//        reversal(head);
        recursion(head);
    }

    // 迭代
    public static Node reversal(Node head) {
        Node pre = null,cur = head;
        while (cur != null) {
            Node next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    // 递归
    public static Node recursion(Node head) {
        // 获取到最后一个元素
        if (head == null || head.next == null) {
            return head;
        }
        Node newNode = recursion(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }
}

class Node{
    int val;
    Node next;

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}
