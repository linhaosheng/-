package linhao.com.algorithmproject.algorithmUtil;

import android.provider.CalendarContract;

import java.util.Stack;

/**
 * Created by reeman on 2017/11/8.
 */

public class PrintListFromEndToEnd {

    /**
     * 输入个链表的头结点，从尾到头反过来打印出每个结点的值。
     * 使用栈的方式进行。
     * 将链表从头到尾压入栈内，出栈的过程就对应着从尾到头
     */
    public static class ListNode {
        int val;  // 结点的值
        ListNode next;  // 下一个结点
    }

    public static void printListInverselyUsingIteration(ListNode root) {
        Stack<ListNode> stack = new Stack<>();
        while (root != null) {
            stack.push(root);
            root = root.next;
        }
        ListNode tmp;
        while (!stack.isEmpty()) {
            tmp = stack.pop();
            System.out.print(tmp.val + " ");
        }
    }
}
