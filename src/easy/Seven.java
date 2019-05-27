package easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: Seven
 * @Package easy
 * @Description:
 * @author: WW
 * @date: 2019/4/16 10:45
 */

/**
 *给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 * 注意:
 *
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 */
//解题思路：常规的数字转换，考虑正负的影响，使用栈，通过取余10和整除10入栈，再循环出栈得到翻转的数(需要考虑整数溢出的情况），关键代码:
    /*    while (last != 0){
            units = last%10;
            last = last/10;
            q.add(units);
            }
            res = q.remove();
            while (q.size()!=0){
            res = res * 10 + q.remove();
            if (res>Math.pow(2,31)-1 || res<Math.pow(-2,31)){
            res = 0;
            break;
             }
            }
            */
public class Seven {
    public static int reverse(int x) {
        Queue<Integer> q = new LinkedList<>();
        int units;
        int last = x;
        double res;
        if (x!=0){
            while (last != 0){
                units = last%10;
                last = last/10;
                q.add(units);
            }
            res = q.remove();
            while (q.size()!=0){
                res = res * 10 + q.remove();
                if (res>Math.pow(2,31)-1 || res<Math.pow(-2,31)){
                    res = 0;
                    break;
                }
            }
        } else
            res = 0;
        return (int)res;
    }

    public static void main(String[] args) {
        System.out.println( reverse(123));
    }
}
