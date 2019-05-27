package easy;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: ThreeFive
 * @Package easy
 * @Description:
 * @author: WW
 * @date: 2019/4/18 15:36
 */

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 你可以假设数组中无重复元素。
 *
 * 示例 1:
 *
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * 示例 2:
 *
 * 输入: [1,3,5,6], 2
 * 输出: 1
 * 示例 3:
 *
 * 输入: [1,3,5,6], 7
 * 输出: 4
 * 示例 4:
 *
 * 输入: [1,3,5,6], 0
 * 输出: 0
 */
//解题思路 ：很简单啊，循环比较如果比tar大就返回这个位置，等于也返回这个位置   循环后 还没有还没有返回 则返回length
public class ThreeFive {

    public static int searchInsert(int[] nums, int target) {
        int length=nums.length;
        for(int i=0;i<length;i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return length;
    }
    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        int a=7;
        System.out.println( searchInsert(nums,a));

    }
}
