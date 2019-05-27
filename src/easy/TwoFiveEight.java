package easy;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: TwoFiveEight
 * @Package easy
 * @Description:
 * @author: WW
 * @date: 2019/5/24 10:13
 */

/**
 * 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
 *
 * 示例:
 *
 * 输入: 38
 * 输出: 2
 * 解释: 各位相加的过程为：3 + 8 = 11, 1 + 1 = 2。 由于 2 是一位数，所以返回 2。
 * 进阶:
 * 你可以不使用循环或者递归，且在 O(1) 时间复杂度内解决这个问题吗？
 */
//思路  ：自己的思路是递归操作  效率不高  但是是最容易想到的 这道题目非常简单(递归)   有更难的解法
public class TwoFiveEight {
    public static int addDigits(int num) {
        if(num<10){
            return num;
        }
        int temp=0;
        String s=String.valueOf(num);
        for (int i = 0; i <s.length() ; i++) {
            temp+=Integer.valueOf(s.substring(i,i+1));
        }
       return addDigits(temp);
    }
    /**  数学规律法
    public int addDigits(int num){
        if(num==0)
            return 0;
        return num%9==0?9:num%9;
    }
     **/
    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }
}
