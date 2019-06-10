package easy; /**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: FourSixOne
 * @Package PACKAGE_NAME
 * @Description:
 * @author: WW
 * @date: 2019/6/10 10:40
 */

/**
 * 461. 汉明距离
 *
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 *
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 *
 * 注意：
 * 0 ≤ x, y < 231.
 *
 * 示例:
 *
 * 输入: x = 1, y = 4
 *
 * 输出: 2
 *
 * 解释:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 *        ↑   ↑
 *
 * 上面的箭头指出了对应二进制位不同的位置。
 */
//解题思路：这道题目 不难 主要是二进制的操作吧 首先用异或运算 这样  得到的值就是两个数不相同的为构成的数  然后求该值的二进制数中1的个数
public class FourSixOne {
    public int hammingDistance(int x, int y) {
        int temp=x^y;
        String result="";
        int sum;
        int res=0;
        for (int i = temp; i>=1; i/=2) {
            if(i%2==0){
                sum=0;
            }else {
                sum=1;
                res++;
            }
            result=sum+result;
        }
        System.out.println(result);
        return res;
    }

    public static void main(String[] args) {
        FourSixOne fourFiveNine=new FourSixOne();
        System.out.println(fourFiveNine.hammingDistance(1,4));
    }
}
