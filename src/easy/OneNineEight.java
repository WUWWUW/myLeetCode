package easy;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: OneNineEight
 * @Package easy
 * @Description:
 * @author: WW
 * @date: 2019/5/14 15:55
 */

/**
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 *
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
 *
 * 示例 1:
 *
 * 输入: [1,2,3,1]
 * 输出: 4
 * 解释: 偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
 *      偷窃到的最高金额 = 1 + 3 = 4 。
 * 示例 2:
 *
 * 输入: [2,7,9,3,1]
 * 输出: 12
 * 解释: 偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
 *      偷窃到的最高金额 = 2 + 9 + 1 = 12 。
 */
//解题思路 动态递归
public class OneNineEight {
    public static int rob(int[] nums) {
        //判断特殊情况，
        int leng = nums.length;
        if(leng == 0){
            return 0;
        }

        if(leng == 1){
            return nums[0];
        }

        if(leng == 2){
            return Math.max(nums[0],nums[1]);
        }

        /*创建一个新数组存储第i位最多可以抢的钱，
         *判断抢到第i个位置时怎么抢的钱最多，
         *并将最大钱数设为result的第i位
         */
        int[] result = new int[leng];
        result[0] = nums[0];
        result[1] = Math.max(nums[0],nums[1]);
        for(int i = 2; i < leng; i++){
            int money1 = result[i-1];
            int money2 = result[i-2] + nums[i];
            result[i] = Math.max(money1,money2);
        }

        return result[leng - 1];
    }

    public static void main(String[] args) {
        int[] a={1,2,3,1};
        System.out.println(rob(a));
    }
}
