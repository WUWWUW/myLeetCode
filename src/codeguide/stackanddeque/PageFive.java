package codeguide.stackanddeque;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @Title: PageFive
 * @Package codeguide.stackanddeque
 * @Description:
 * @author: WUW
 * @date: 2019/8/3 11:42
 */

import java.util.Stack;

/**
 * 由两个栈组成一个队列
 * 编写一个类，用两个栈实现队列，支持队列的基本操作（add，poll，peek）
 */

/**
 * 栈是先进后出，队列是先进先出，用栈实现队列，可以使用两个栈
 * 一个栈作为压入栈  一个栈作为弹出栈。在压入时 顺序是先进后出，需要再把压入栈的数据一次弹出到弹出栈
 */
public class PageFive {
    public Stack<Integer> stackPush;
    public Stack<Integer> stackPop;

    public PageFive() {
        this.stackPop=new Stack<>();
        this.stackPush=new Stack<>();
    }

    public void pushToPop(){
        if(this.stackPop.isEmpty()){
            while (!stackPush.isEmpty()){
                this.stackPop.push(stackPush.pop());
            }
        }
    }
    public void add(int pushInt){
        stackPush.push(pushInt);
        pushToPop();
    }
    public int poll(){
        if(stackPop.isEmpty()&&stackPush.isEmpty()){
            throw  new RuntimeException("error");
        }
        pushToPop();
        return stackPop.pop();
    }
    public int peek(){
        if(stackPop.isEmpty()&&stackPush.isEmpty()){
            throw  new RuntimeException("error");
        }
        pushToPop();
        return stackPop.peek();
    }
}
