package easy;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: TwoSixThree
 * @Package easy
 * @Description:
 * @author: WW
 * @date: 2019/5/24 10:28
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 编写一个程序判断给定的数是否为丑数。
 *
 * 丑数就是只包含质因数 2, 3, 5 的正整数。
 *
 * 示例 1:
 *
 * 输入: 6
 * 输出: true
 * 解释: 6 = 2 × 3
 * 示例 2:
 *
 * 输入: 8
 * 输出: true
 * 解释: 8 = 2 × 2 × 2
 * 示例 3:
 *
 * 输入: 14
 * 输出: false
 * 解释: 14 不是丑数，因为它包含了另外一个质因数 7。
 * 说明：
 *
 * 1 是丑数。
 * 输入不会超过 32 位有符号整数的范围: [−231,  231 − 1]。
 */
//自己的想法有很多问题 还用了很多double循环  和HashSet 这样时间和空复杂度都非常高了 不好
    //看看了别人的做法是逆向思维就很好  反过来整除2 3 5 进行判断 看看能否被2 3 5 整除 而不是像自己那样去 尝试分解质因数  不过分解质因数 自己也要会写
public class TwoSixThree {
    public static boolean isUgly(int num) {
//        if(num<2){
//            return true;
//        }
//        if(num==-2147483648){
//            return false;
//        }
//        Set<Integer> set=new HashSet<>();
//        if(isPrime(num))
//        {
//          set.add(num);
//        } else{
//            while(num!=1) {
//                for (int j = 2; j <= num; j++){
//                    //对最后一个进行特殊处理
//                    if (j == num) {
//                        num = 1;
//                        set.add(j);
//                        break;
//                    }
//                    if(num%j==0){
//                        num=num/j;
//                        set.add(j);
//                        break;
//                    }
//                 }
//            }
//        }
//        set.remove(2);
//        set.remove(3);
//        set.remove(5);
//        if(set.size()>0){
//            return false;
//        }
//        return true;
        if( num <= 0 )
            return false;
        else if( num == 1 )
            return true;
        else
        {
            while( num > 1 )
            {
                if( num % 2 == 0 )
                    num = num / 2;
                else if( num % 3 == 0 )
                    num = num / 3;
                else if( num % 5 == 0 )
                    num = num / 5;
                else
                    return false;
            }
        }
        return true;
    }
    public static boolean isPrime(int i)
    {
        boolean isPrime = true;
        for (int j = 2; j<=Math.sqrt(i);j++)
        {
            if(i%j==0)
                isPrime = false;
        }
        return isPrime;
    }
    public static void main(String[] args) {
        System.out.println( isUgly(2));
    }
}
