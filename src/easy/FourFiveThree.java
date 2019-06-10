package easy; /**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: FourFiveThree
 * @Package PACKAGE_NAME
 * @Description:
 * @author: WW
 * @date: 2019/6/4 11:07
 */

/**
 * 给定一个长度为 n 的非空整数数组，找到让数组所有元素相等的最小移动次数。每次移动可以使 n - 1 个元素增加 1。
 *
 * 示例:
 *
 * 输入:
 * [1,2,3]
 *
 * 输出:
 * 3
 *
 * 解释:
 * 只需要3次移动（注意每次移动会增加两个元素的值）：
 *
 * [1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
 */
// 转换思想
// n-1个值+1，相当与1个值-1
// 要使所有相等，每个都减小到数组的最小值
// O(n)
public class FourFiveThree {
    public int minMoves(int[] nums) {
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            min=nums[i]<min?nums[i]:min;
        }
        return sum-min*nums.length;
    }

    public static void main(String[] args) {

    }
}
