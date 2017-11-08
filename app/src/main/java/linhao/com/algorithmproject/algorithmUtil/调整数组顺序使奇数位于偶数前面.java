package linhao.com.algorithmproject.algorithmUtil;

/**
 * Created by reeman on 2017/11/8.
 */

public class 调整数组顺序使奇数位于偶数前面 {

    /**
     * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位予数组的后半部分。
     * <p>
     * 这个题目要求把奇数放在数组的前半部分， 偶数放在数组的后半部分，因此所有的奇数应该位于偶数的前面。也就是说我们在扫描这个数组的时候， 如果发现有偶数出现在奇数的前面，我们可以交换它们的顺序，交换之后就符合要求了。
     * <p>
     * 因此我们可以维护两个指针，第一个指针初始化时指向数组的第一个数字，它只向后移动：第二个指针初始化时指向数组的最后一个数字， 它只向前移动。在两个指针相遇之前，
     * 第一个指针总是位于第二个指针的前面。如果第一个指针指向的数字是偶数，并且第二个指针指向的数字是奇数，我们就交换这两个数字。
     */


    public static void reorderOddEven(int[] arr) {
        if (arr == null || arr.length < 1) {
            return;
        }
        // 从左向右记录偶数的位置
        int start = 0;
        // 从右向左记录奇数的位置
        int end = arr.length - 1;
        while (start < end) {
            while (start < end && arr[start] % 2 != 0) {
                start++;
            }
            while (start < end && arr[end] % 2 == 0) {
                end++;
            }
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
        }
    }
}
