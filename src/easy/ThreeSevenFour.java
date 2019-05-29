package easy; /**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: easy.ThreeSevenFour
 * @Package PACKAGE_NAME
 * @Description:
 * @author: WW
 * @date: 2019/5/29 10:01
 */

/**
 * 我们正在玩一个猜数字游戏。 游戏规则如下：
 * 我从 1 到 n 选择一个数字。 你需要猜我选择了哪个数字。
 * 每次你猜错了，我会告诉你这个数字是大了还是小了。
 * 你调用一个预先定义好的接口 guess(int num)，它会返回 3 个可能的结果（-1，1 或 0）：
 *
 * -1 : 我的数字比较小
 *  1 : 我的数字比较大
 *  0 : 恭喜！你猜对了！
 * 示例 :
 *
 * 输入: n = 10, pick = 6
 * 输出: 6
 */
//思路：二分法 平常思路
public class ThreeSevenFour {
    public int guessNumber(int n) {
        int start=0;
        int end=n;
        int temp=end/2;
        while (start<end){
            int guessResult=guess(temp);
            if(guessResult==-1){
                end=temp-1;
                temp=start+(end-start)/2;
            }else if(guessResult==1){
                start=temp+1;
                temp=start+(end-start)/2;
            }else {
                return temp;
            }
        }
        return end;
    }
    //模拟会使用的方法
    public int guess(int n){
        return -1;
    }
}
