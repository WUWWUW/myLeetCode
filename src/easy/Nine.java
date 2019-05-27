package easy;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: Nine
 * @Package easy
 * @Description:
 * @author: WW
 * @date: 2019/4/17 8:53
 */

import java.util.LinkedList;
import java.util.Queue;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 示例 1:
 *
 * 输入: 121
 * 输出: true
 * 示例 2:
 *
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 *
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 */
//解题思路：1.使用字符串来判断  字符串反转判断；2.使用整数反转，整数反转后进行比较是否相等   和第七题的整数反转类似  这种方法复杂度更低
public class Nine {
    public static boolean isPalindrome(int x) {
//        Queue<Integer> queue=new LinkedList();
//        if(x<0){
//            return false;
//        }else if (x>=0&&x<10){
//            return true;
//        }else if (x==2147483647){
//            return false;
//        }
//        int utils;
//        int last=x;
//        double res;
//        while (last!=0){
//            utils=last%10;
//            last=last/10;
//            queue.add(utils);
//        }
//        res=queue.remove();
//        while (queue.size()!=0){
//            res=res*10+queue.remove();
//        }
//        if ((int)res==x){
//            return true;
//        }
//        return false;
        if(x<0){
            return false;
        }else if(x>=0 && x< 10){
            return true;
        }else{
            int num = x;
            double d = 0;
            while(num>0){
                d = d * 10 + num %10;
                num = num/10;
            }
            if(d == x){
                return true;
            }else{
                return false;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
