package easy; /**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: easy.ThreeSixSeven
 * @Package easy
 * @Description:
 * @author: WW
 * @date: 2019/5/29 9:23
 */

import static java.lang.Math.pow;

/**
 * 给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。
 *
 * 说明：不要使用任何内置的库函数，如  sqrt。
 *
 * 示例 1：
 *
 * 输入：16
 * 输出：True
 * 示例 2：
 *
 * 输入：14
 * 输出：False
 */
//思路：这个题目有多种解法 最简单也就是直接暴力循环查找 可以通过 但是时间复杂度很高
    //还有可以使用的方法 二分法，公式法(利用 1+3+5+7+9+…+(2n-1)=n^2，即完全平方数肯定是前n个连续奇数的和)，  牛顿迭代法（公式有一..复杂） 其实使用公式法就够了
public class ThreeSixSeven {
    // 暴力循环
    public boolean isPerfectSquare1(int num) {
        if(num==1){
            return true;
        }
        for(int i=1;i<=num/2;i++){
            if(i*i==num){
                return true;
            }
        }
        return false;
    }

    // 二分法
     public boolean isPerfectSquare2(int num) {
         int start=1;
         int end=num;
         int mid=start+(end-start)/2;
         while(start<=end)
         {
             if(pow(mid,2)>num)
         {
             end=mid-1;
         }
         else if(pow(mid,2)<num)
         {
             start=mid+1;
         }
         else
            return true;
         mid=(end-start)/2+start;
         }
         return false;
     }
     //公式法
    public boolean isPerfectSquare3(int num){
        int i=1;
        while (num>0){
            num-=i;
            i+=2;
        }
        return num==0;
    }
}
