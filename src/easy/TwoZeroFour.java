package easy;

import static java.lang.Math.sqrt;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: TwoZeroFour
 * @Package easy
 * @Description:
 * @author: WW
 * @date: 2019/5/20 9:44
 */

/**
 * 统计所有小于非负整数 n 的质数的数量。
 *
 * 示例:
 *
 * 输入: 10
 * 输出: 4
 * 解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 */
//两层循环
public class TwoZeroFour {
    public static int countPrimes(int n) {
        int res=1;//从3开始计算，所以初始为1
        if(n<3) return 0;
        else
        {
            for(int i=3;i<n;i++)
            {
                if(i%2==0)
                    continue;
                Boolean flag=true;//false表示不是素数
                for(int j=3;j<=sqrt(i);j+=2)
                {
                    if(i%j==0)
                    {
                        flag=false;
                        break;
                    }
                }
                if(flag)
                {
                    res++;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
}
