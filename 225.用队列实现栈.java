import java.util.ArrayDeque;
import java.util.Deque;

/*
 * @Date: 2022-08-03 10:39:25
 * @LastEditTime: 2022-08-03 11:03:28
 * @FilePath: \LeetCode\225.用队列实现栈.java
 */
/*
 * @lc app=leetcode.cn id=225 lang=java
 *
 * [225] 用队列实现栈
 */

// @lc code=start
class MyStack {

    Deque<Integer> deque;

    public MyStack() {
        deque=new ArrayDeque<>();
    }

    public void push(int x) {
        deque.addLast(x);
    }

    public int pop() {
        int size = deque.size();
        size--;
        while (size-- > 0) {
            deque.addLast(deque.pollFirst());
        }
        return deque.pollFirst();
    }

    public int top() {
        return deque.peekLast();
    }

    public boolean empty() {
        return deque.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
// @lc code=end
