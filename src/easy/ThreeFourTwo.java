package easy; /**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: easy.ThreeFourTwo
 * @Package PACKAGE_NAME
 * @Description:
 * @author: WW
 * @date: 2019/5/28 9:20
 */
/**
 *给定一个整数 (32 位有符号整数)，请编写一个函数来判断它是否是 4 的幂次方。
 *
 * 示例 1:
 *
 * 输入: 16
 * 输出: true
 * 示例 2:
 *
 * 输入: 5
 * 输出: false
 * 进阶：
 * 你能不使用循环或者递归来完成本题吗？
 */
//思路：不适用循环和递归  一般求是不是几的幂这种情况都是有数学规律的(但是我感觉自己发现不了)  使用这个方法 我觉得还行  可以作模板方法
public class ThreeFourTwo {
    public static boolean isPowerOfFour(int num) {
        while (num > 4) {
            if (num % 4 != 0) {
                break;
            } else {
                num = num / 4;
            }
        }
        return num == 1 || num == 4;
    }
    public static boolean isPowerOfThree(int num) {
        while (num > 3) {
            if (num % 3 != 0) {
                break;
            } else {
                num = num / 3;
            }
        }
        return num == 1 || num == 3;
    }

    public static void main(String[] args) {

        System.out.println( isPowerOfFour(10));
        System.out.println(isPowerOfThree(243));
    }
}
