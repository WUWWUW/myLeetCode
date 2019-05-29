package easy; /**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: easy.FourZeroZero
 * @Package PACKAGE_NAME
 * @Description:
 * @author: WW
 * @date: 2019/5/29 14:13
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 400. 第N个数字
 *
 * 题目描述
 * 在无限的整数序列 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...中找到第 n 个数字。
 *
 * 注意:
 * n 是正数且在32为整形范围内 ( n < 231)。
 *
 * 示例 1:
 *
 * 输入:
 * 3
 *
 * 输出:
 * 3
 * 示例 2:
 *
 * 输入:
 * 11
 *
 * 输出:
 * 0
 *
 * 说明:
 * 第11个数字在序列 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... 里是0，它是10的一部分。
 */
//思路：不会还
public class FourZeroZero {
    public static int findNthDigit(int n) {
        StringBuffer sb=new StringBuffer();
        for(int i=1;i<Math.pow(2,31);i++){
            sb.append(String.valueOf(i));
        }
        return Integer.valueOf(sb.substring(n,n+1));
    }

    public static void main(String[] args) {
        findNthDigit(10);
    }
}
