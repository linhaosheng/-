package linhao.com.algorithmproject.algorithmUtil;

/**
 * Created by reeman on 2017/11/8.
 */

public class 反转链表 {

    /**
     * 定义一个函数，输入一个链表的头结点，反转该链表并输出反转后链表的头结点。
     * <p>
     * ①遍历。将指向下一个节点的指针指向上一个节点。
     * <p>
     * ②递归。先让指向下一个节点的指针为空，然后递归调用，最后再将指向下一个节点的指针指向上一个节点。
     */

    public static class Node {
        int value;
        Node next;
        Node cur;
        Node pre;
    }

    public static Node reverseHead(Node head) {
        if (head == null) {
            return head;
        }
        Node pre = head;
        Node cur = head.next;
        Node next = null;
        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        head.next = null;
        head = pre;
        return head;
    }
}
