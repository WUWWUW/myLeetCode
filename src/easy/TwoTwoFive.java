package easy;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: TwoTwofive
 * @Package easy
 * @Description:
 * @author: WW
 * @date: 2019/5/23 9:10
 */

import java.util.LinkedList;
import java.util.Queue;

/**
 * 使用队列实现栈的下列操作：
 *
 * push(x) -- 元素 x 入栈
 * pop() -- 移除栈顶元素
 * top() -- 获取栈顶元素
 * empty() -- 返回栈是否为空
 * 注意:
 *
 * 你只能使用队列的基本操作-- 也就是 push to back, peek/pop from front, size, 和 is empty 这些操作是合法的。
 * 你所使用的语言也许不支持队列。 你可以使用 list 或者 deque（双端队列）来模拟一个队列 , 只要是标准的队列操作即可。
 * 你可以假设所有操作都是有效的（例如, 对一个空的栈不会调用 pop 或者 top 操作）。
 */
//简单
public class TwoTwoFive {

}
class MyStack {
    private Queue<Integer> queueA;
    private Queue<Integer> queueB;
    /** Initialize your data structure here. */
    public MyStack() {
        queueA=new LinkedList<>();
        queueB=new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queueA.add(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while (!queueA.isEmpty()&&queueA.size()>1){
            queueB.add(queueA.poll());
        }
        //得到最后插入的元素并删除
        int topElement=queueA.poll();
        queueA=queueB;
        queueB=new LinkedList<>();
        return topElement;
    }

    /** Get the top element. */
    public int top() {
        while (!queueA.isEmpty()&&queueA.size()>1){
            queueB.add(queueA.poll());
        }
        return queueA.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queueA.isEmpty() && queueB.isEmpty();
    }
}
