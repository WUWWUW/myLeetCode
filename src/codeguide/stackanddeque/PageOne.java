package codeguide.stackanddeque;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @Title: PageOne
 * @Package codeguide.stackanddeque
 * @Description:
 * @author: WUW
 * @date: 2019/8/3 11:26
 */

import java.util.Stack;

/**
 * 设计一个有getMin功能的栈
 * 实现一个特殊的栈，在实现栈的基本功能的基础上，再实现返回栈中最小元素的操作
 * 1.pop push getMin操作时间复杂度都是O（1）
 * 2.设计的栈类型可以使用现成的栈结构
 */
public class PageOne {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public PageOne() {
        this.stackData=new Stack<>();
        this.stackMin=new Stack<>();
    }
    public void push(int newNum){
        stackData.push(newNum);
        if(stackMin.isEmpty()){
            stackMin.push(newNum);
        }else {
            if(stackMin.peek()>=newNum){
                this.stackMin.push(newNum);
            }
        }
    }

    public int pop(){
        if (stackData.isEmpty()){
            throw new RuntimeException("error");
        }
        int value=stackData.pop();
        if(value==this.getMin()){
            this.stackMin.pop();
        }
        return value;
    }

    public int getMin(){
        if(stackMin.isEmpty()){
            throw new RuntimeException("error");
        }
        return this.stackMin.peek();
    }
}
