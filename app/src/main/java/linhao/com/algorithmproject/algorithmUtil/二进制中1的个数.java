package linhao.com.algorithmproject.algorithmUtil;

/**
 * Created by reeman on 2017/11/8.
 */

public class 二进制中1的个数 {

    /**
     * 请实现一个函数，输入一个整数，输出该数二进制表示中1的个数。例如把9表示成二进制1001，有2位1。因此如果输入9，该函数输出2。
     * <p>
     * ①位移＋计数 每次右移一位，不断和1进行与运算，直到位0。
     */

    public static int numberOfOne(int n) {
        /**
         *   // JAVA语言规范中，int整形占四个字节，总计32位
         // 对每一个位置与1进行求与操作，再累加就可以求出当前数字的表示是多少位1
         */
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result += n & i;
            n = n >> 1;
        }
        return result;
    }
}
