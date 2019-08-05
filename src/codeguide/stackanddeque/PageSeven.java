package codeguide.stackanddeque;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @Title: PageSeven
 * @Package codeguide.stackanddeque
 * @Description:
 * @author: WUW
 * @date: 2019/8/3 12:21
 */

import java.util.Stack;

/**
 * 用递归函数和栈操作逆序一个栈
 */
public class PageSeven {
    public static int getAndRemoveLastElement(Stack<Integer> stack){
        int result=stack.pop();
        if(stack.isEmpty()){
            return result;
        }else {
            int last=getAndRemoveLastElement(stack);
            stack.push(result);
            return last;
        }
    }
    public static void resverse(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int i=getAndRemoveLastElement(stack);
        resverse(stack);
        stack.push(i);
    }

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        resverse(stack);
    }
}
