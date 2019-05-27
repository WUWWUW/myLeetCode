package easy;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @Title: TwoNineTwo
 * @Package easy
 * @Description:
 * @author: WUW
 * @date: 2019/5/27 20:44
 */

/**
 * 你和你的朋友，两个人一起玩 Nim 游戏：桌子上有一堆石头，每次你们轮流拿掉 1 - 3 块石头。 拿掉最后一块石头的人就是获胜者。你作为先手。
 *
 * 你们是聪明人，每一步都是最优解。 编写一个函数，来判断你是否可以在给定石头数量的情况下赢得游戏。
 *
 * 示例:
 *
 * 输入: 4
 * 输出: false
 * 解释: 如果堆中有 4 块石头，那么你永远不会赢得比赛；
 *      因为无论你拿走 1 块、2 块 还是 3 块石头，最后一块石头总是会被你的朋友拿走。
 */
//思路：把石头分成每份四个。（3,1）（1,3）(2,2)
        //石头刚好被4整除的 后手一定赢
        //石头不能被4整除  先手赢的办法只有第一次取的数量能保证剩下的数量刚好能被4整除（即让自己成为后手）
public class TwoNineTwo {
    public boolean canWinNim(int n) {
        if(n%4==0){
            return false;
        }
        return true;
    }
}
