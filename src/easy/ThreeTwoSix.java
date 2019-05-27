package easy;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @Title: ThreeTwoSix
 * @Package easy
 * @Description:
 * @author: WUW
 * @date: 2019/5/27 21:05
 */

/**
 * 给定一个整数，写一个函数来判断它是否是 3 的幂次方。
 *
 * 示例 1:
 *
 * 输入: 27
 * 输出: true
 * 示例 2:
 *
 * 输入: 0
 * 输出: false
 * 示例 3:
 *
 * 输入: 9
 * 输出: true
 * 示例 4:
 *
 * 输入: 45
 * 输出: false
 * 进阶：
 * 你能不使用循环或者递归来完成本题吗？
 */
//:思路 简单
public class ThreeTwoSix {

    public boolean isPowerOfThree(int n) {
        if (n == 0) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }

    public static void main(String[] args) {

    }
}
