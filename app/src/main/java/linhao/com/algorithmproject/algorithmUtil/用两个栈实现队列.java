package linhao.com.algorithmproject.algorithmUtil;

import java.util.Stack;

/**
 * Created by reeman on 2017/11/8.
 */

public class 用两个栈实现队列 {

    public static class MList<T> {
        private Stack<T> putStack = new Stack<>();
        private Stack<T> popStack = new Stack<>();

        public MList() {
        }

        public void AddData(T t) {
            putStack.push(t);
        }

        public T deleteData() {
            if (popStack.isEmpty()) {
                while (!putStack.isEmpty()) {
                    popStack.push(putStack.pop());
                }
            }
            if (popStack.isEmpty()) {
                throw new RuntimeException("No more element.");
            }
            return popStack.pop();
        }
    }
}
