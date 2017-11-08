package linhao.com.algorithmproject.algorithmUtil;

/**
 * Created by reeman on 2017/11/8.
 */

public class 合并两个排序的链表 {

    /**
     * 输入两个递增排序的链表，合并这两个链表并使新链表中的结点仍然是按照递增排序的。
     * <p>
     * *Step1.**定义一个指向新链表的指针，暂且让它指向NULL；
     * <p>
     * *Step2.**比较两个链表的头结点，让较小的头结点作为新链表的头结点；
     * <p>
     * *Step3.**有两种方法。
     * <p>
     * ①递归比较两个链表的其余节点，让较小的节点作为上一个新节点的后一个节点；
     * <p>
     * ②循环比较两个链表的其余节点，让较小的节点作为上一个新节点的后一个节点。直到有一个链表没有节点，然后将新链表的最后一个节点直接指向剩余链表的节点。
     */

    public static class ListNode {
        int value;
        ListNode next;
    }

    /**
     * 输入两个递增排序的链表，合并这两个链表并使新链表中的结点仍然是按照递增排序的
     *
     * @param head1 第一个有序链表
     * @param head2 第二个有序链表
     * @param head1
     * @param head2
     * @return
     */
    public static ListNode merge(ListNode head1, ListNode head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        ListNode root = new ListNode();
        ListNode pointer = root;
        while (head1 != null && head2 != null) {
            if (head1.value < head2.value) {
                pointer.next = head1;
                head1 = head1.next;
            } else {
                pointer.next = head2;
                head2 = head2.next;
            }
        }
        if (head1 != null) {
            pointer.next = head1;
        }
        if (head2 != null) {
            pointer.next = head2;
        }
        return root.next;
    }
}
