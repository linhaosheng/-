package linhao.com.algorithmproject.algorithmUtil;

/**
 * Created by reeman on 2017/11/8.
 */

public class 二叉树的镜像 {

    /**
     * 请完成一个函数，输入一个二叉树，该函数输出它的镜像。
     * <p>
     * 先前序遍历这棵树的每个结点，如果遍历到的结点有子结点，就交换它的两个子结点。当交换完所有非叶子结点的左右子结点之后，就得到了树的镜像。
     */

    public static class BinaryTreeNode {
        int value;
        BinaryTreeNode left;
        BinaryTreeNode right;
    }

    public static void mirror(BinaryTreeNode node) {
        if (node == null) {
            return;
        }
        BinaryTreeNode tmp = node.left;
        node.left = node.right;
        node.right = tmp;
        mirror(node.left);
        mirror(node.right);
    }

}
