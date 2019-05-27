package easy;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: FiveThree
 * @Package easy
 * @Description:
 * @author: WW
 * @date: 2019/4/18 16:16
 */

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 示例:
 *
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * 进阶:
 *
 * 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
 */
//最大子序列和：动态规划经典题目
public class FiveThree {
    public static int maxSubArray(int[] nums) {
//        int ans = nums[0], sum = nums[0];
//        for(int i = 1; i < nums.length; i++){
//            sum = Math.max(nums[i], sum + nums[i]);
//            ans = Math.max(ans, sum);
//        }
//        return ans;

        int ans=nums[0],sum=nums[0];
        for(int i=1;i<nums.length;i++){
            sum=Math.max(nums[i],sum+nums[i]);
            ans=Math.max(ans,sum);
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray(nums);
    }
}
