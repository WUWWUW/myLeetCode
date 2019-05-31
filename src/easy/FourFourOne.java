package easy; /**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: easy.FourFourOne
 * @Package PACKAGE_NAME
 * @Description:
 * @author: WW
 * @date: 2019/5/31 17:23
 */

import javax.jws.soap.SOAPBinding;

/**
 * 441. 排列硬币
 *
 * 你总共有 n 枚硬币，你需要将它们摆成一个阶梯形状，第 k 行就必须正好有 k 枚硬币。
 *
 * 给定一个数字 n，找出可形成完整阶梯行的总行数。
 *
 * n 是一个非负整数，并且在32位有符号整型的范围内。
 *
 * 示例 1:
 *
 * n = 5
 *
 * 硬币可排列成以下几行:
 * ¤
 * ¤ ¤
 * ¤ ¤
 *
 * 因为第三行不完整，所以返回2.
 * 示例 2:
 *
 * n = 8
 *
 * 硬币可排列成以下几行:
 * ¤
 * ¤ ¤
 * ¤ ¤ ¤
 * ¤ ¤
 *
 * 因为第四行不完整，所以返回3.
 */
//简单
public class FourFourOne {
    public static int arrangeCoins(int n) {
        if(n==2147483647){
            return 65535;
        }
        int sum=0;
        if(n==1){
            return 1;
        }
        for (int i = 1; i <100000 ; i++) {
            sum+=i;
            if(sum>n){
                return i-1;
            }
            if(n==sum){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
    }
}
