package linhao.com.algorithmproject.algorithmUtil;

/**
 * Created by reeman on 2017/11/8.
 */

public class 树的子结构 {

    /**
     * 输入两棵二叉树A 和B，判断B 是不是A 的子结构。
     * <p>
     * 要查找树A 中是否存在和树B 结构一样的子树，我们可以分成两步：
     * 第一步在树A 中找到和B 的根结点的值一样的结点R， 第二步再判断树A 中以R 为根结点的子树是不是包含和树B 一样的结构。
     */

    public static class BinaryTreeNode {
        int value;
        BinaryTreeNode left;
        BinaryTreeNode right;
    }

    public static boolean hasSubtree(BinaryTreeNode root1, BinaryTreeNode root2) {
        if (root1 == root2) {
            return true;
        }
        if (root2 == null) {
            return true;
        }
        if (root1 == null) {
            return false;
        }
        boolean result = false;
        if (root1.value == root2.value) {
            result = match(root1, root2);
        }
        if (result) {
            return true;
        }
        return hasSubtree(root1.left, root2) || hasSubtree(root1.right, root2);
    }


    public static boolean match(BinaryTreeNode root1, BinaryTreeNode root2) {
        // 只要两个对象是同一个就返回true
        if (root1 == root2) {
            return true;
        }
        // 只要树B的根结点点为空就返回true
        if (root2 == null) {
            return true;
        }
        // 树B的根结点不为空，如果树A的根结点为空就返回false
        if (root1 == null) {
            return false;
        }
        // 如果两个结点的值相等，则分别判断其左子结点和右子结点
        if (root1.value == root2.value) {
            return match(root1.left, root2.left) && match(root1.right, root2.right);
        }
        // 结点值不相等返回false
        return false;
    }
}
