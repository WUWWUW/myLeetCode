package easy;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: TwoZeroTwo
 * @Package easy
 * @Description:
 * @author: WW
 * @date: 2019/5/15 9:21
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 编写一个算法来判断一个数是不是“快乐数”。
 *
 * 一个“快乐数”定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是无限循环但始终变不到 1。如果可以变为 1，那么这个数就是快乐数。
 *
 * 示例:
 *
 * 输入: 19
 * 输出: true
 * 解释:
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 */
//循环判断   但是注意会有死循环的数 一直周期死循环 要注意处理  如果数字在一定周期出现重复 直接返回false
public class TwoZeroTwo {
    public static boolean isHappy(int n) {
        int hpaayNum=0;
        if(n<=0){
            return false;
        }
        Map<Integer,Integer> map=new HashMap<>();
        while (n>0){
            int a=n%10;
            hpaayNum+=a*a;
            n=n/10;
            if(n==0){
                if (hpaayNum == 1) {
                    return true;
                }
                if(map.get(hpaayNum)!=null){
                    return false;
                }else {
                    map.put(hpaayNum,1);
                }
                n=hpaayNum;
                hpaayNum=0;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(isHappy(19));
    }
}
