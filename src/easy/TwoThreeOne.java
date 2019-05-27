package easy;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: TwoThreeOne
 * @Package easy
 * @Description:
 * @author: WW
 * @date: 2019/5/23 9:52
 */

/**
 * 给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
 *
 * 示例 1:
 *
 * 输入: 1
 * 输出: true
 * 解释: 20 = 1
 * 示例 2:
 *
 * 输入: 16
 * 输出: true
 * 解释: 24 = 16
 * 示例 3:
 *
 * 输入: 218
 * 输出: false
 */
public class TwoThreeOne {
    public static boolean isPowerOfTwo(int n) {
        int res=1;
        for(int i=0;i<31;i++){

            if(n==res){
                return true;
            }
            res*=2;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(  isPowerOfTwo(0));
    }
}
