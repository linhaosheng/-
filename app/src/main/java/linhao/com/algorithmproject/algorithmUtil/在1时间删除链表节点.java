package linhao.com.algorithmproject.algorithmUtil;

/**
 * Created by reeman on 2017/11/8.
 */

public class 在1时间删除链表节点 {

    /**
     * 给定单向链表的一个头指针和节点指针，定义一个函数在O(1)时间删除该节点。
     * <p>
     * 由于给定了节点指针，那么要删除该节点。只要把该节点的值替换为下一个节点的值，同时让该节点直接指向下一个节点的下一个节点。
     * 相当于顶包代替了下一个节点，该节点自然就不存在。
     * <p>
     * 需要注意的是如果指定节点是头结点，那么直接把头结点定义为下一个节点即可。如果是尾节点，需要循环遍历到该节点，然后让尾节点的上一个节点的指针为空即可。
     */

    public static class ListNode {
        int value;
        ListNode next;
    }

    public static ListNode deleteNode(ListNode head, ListNode toBeDeleted) {
        // 如果输入参数有空值就返回表头结点
        if (head == null || toBeDeleted == null) {
            return head;
        }
        if (head == toBeDeleted) {
            return head.next;
        }
        // 在多个节点的情况下，如果删除的是最后一个元素
        if (toBeDeleted.next == null) {
            ListNode tmp = head;
            while (tmp.next != toBeDeleted) {
                tmp = tmp.next;
            }
            // 删除待结点
            tmp.next = null;
        } else {
            toBeDeleted.value = toBeDeleted.next.value;
            toBeDeleted.next = toBeDeleted.next.next;
        }
        return head;
    }
}
