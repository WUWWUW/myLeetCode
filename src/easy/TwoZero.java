package easy;

import java.util.Stack;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: TwoZero
 * @Package easy
 * @Description:
 * @author: WW
 * @date: 2019/4/17 16:26
 */

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 示例 1:
 *
 * 输入: "()"
 * 输出: true
 * 示例 2:
 *
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 *
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 *
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 *
 * 输入: "{[]}"
 * 输出: true
 */
//解题思路：括号匹配一定要用栈  ，括号的匹配就是出栈和入栈的操作，需要考虑栈是否为空等，括号匹配不难，
// 这个套路要记住，这应该是第三或者第四次做这个题目 还是花了挺久的，下次要将思路先理清楚
public class TwoZero {
    public static boolean isValid(String s) {
        Stack<Character> stack=new Stack();
        boolean flag=true;
        int n=s.length();
        if(s.equals("")){
            return true;
        }else if(n<2){
            return false;
        }
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
           switch (c){
               case '(':stack.push(c);break;
               case '[':stack.push(c);break;
               case '{':stack.push(c);break;
               case ')':
                   if(stack.size()==0){
                       flag=false;
                       break;
                   }
                   if('('!=stack.pop()){
                       flag=false;
                   }
                   break;
               case ']':
                   if(stack.size()==0){
                       flag=false;
                       break;
                   }
                   if('['!=stack.pop()){
                       flag=false;
                   }
                   break;
               case '}':
                   if(stack.size()==0){
                       flag=false;
                       break;
                   }
                   if('{'!=stack.pop()){
                       flag=false;
                   }
                   break;
               default:flag=false;break;
           }
           if(flag==false){
               break;
           }
        }
        if(stack.size()>0){
            flag=false;
        }
        return flag;
    }
    public static void main(String[] args) {
        String s="()";
        System.out.println(isValid(s));
    }
}
