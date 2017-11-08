package linhao.com.algorithmproject.algorithmUtil;

/**
 * Created by reeman on 2017/11/8.
 */

public class ReplaceBlanks {

    /**
     * 请实现一个函数，把字符串中的每个空格替换成"%20"，例如“We are happy.”，则输出“We%20are%20happy.”。
     * 先判断字符串中空格的数量。根据数量判断该字符串有没有足够的空间替换成"%20"。
     * <p>
     * 如果有足够空间，计算出需要的空间。根据最终需要的总空间，维护一个指针在最后。
     * 从后到前，遇到非空的就把该值挪到指针指向的位置，然后指针向前一位，遇到“ ”，则指针前移，依次替换为“02%”。
     */

    public static int replaceBlank(char[] string, int userLength) {
        if (string == null || string.length < userLength) {
            return -1;
        }
        // 统计字符数组中的空白字符数
        int whiteCount = 0;
        for (int i = 0; i < userLength; i++) {
            if (string[i] == ' ') {
                whiteCount++;
            }
        }
        int targetLength = whiteCount * 2 + userLength;
        int tmp = targetLength; // 保存长度结果用于返回
        if (targetLength > string.length) {
            return -1;
        }
        if (whiteCount == 0) {
            return userLength;
        }
        while (userLength >= 0 && userLength < targetLength) {
            if (string[userLength] == ' ') {
                string[targetLength--] = '0';
                string[targetLength--] = '2';
                string[targetLength--] = '%';
            } else {
                string[targetLength] = string[userLength];
            }
            userLength--;
        }
        return tmp;
    }
}
