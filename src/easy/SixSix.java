package easy;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: SixSix
 * @Package easy
 * @Description:
 * @author: WW
 * @date: 2019/4/22 9:12
 */

/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * 示例 1:
 *
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * 示例 2:
 *
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 */
//解题思路：数组最后一个元素+1   判断是否大于10   如果大于10就继续进位  如果最后数组第一位为10，则申请一个新的数组  将第一位置为1  其他位置则从各个的数组全部移过来
public class SixSix {
    public static  int[] plusOne(int[] digits) {
        int i = digits.length-1;
        digits[i]++;

        for (; i > 0;i--) {
            if (digits[i] == 10) {
                digits[i] = 0;
                digits[i-1]++;
            }
        }
        if (digits[i] != 10) return digits;

        digits[0] = 0;
        int[] result = new int[digits.length+1];
        result[0] = 1;
        for(i = 1; i<result.length; i++)
            result[i] = digits[i-1];
        return result;
    }
    public static void main(String[] args) {
        int [] u={9,9,9};
        int [] x=plusOne(u);
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }

    }
}
