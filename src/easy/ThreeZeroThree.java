package easy;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @Title: ThreeZeroThree
 * @Package easy
 * @Description:
 * @author: WUW
 * @date: 2019/5/27 20:53
 */

/**
 * 给定一个整数数组  nums，求出数组从索引 i 到 j  (i ≤ j) 范围内元素的总和，包含 i,  j 两点。
 *
 * 示例：
 *
 * 给定 nums = [-2, 0, 3, -5, 2, -1]，求和函数为 sumRange()
 *
 * sumRange(0, 2) -> 1
 * sumRange(2, 5) -> -1
 * sumRange(0, 5) -> -3
 * 说明:
 *
 * 你可以假设数组不可变。
 * 会多次调用 sumRange 方法。
 */
//思路会多次调用sumRange方法   所以每次都逐个相加计算子区间的和不是理想的做法。
    //可以在构造方法中实现存储nums前n个元素的和 在sumRange方法里直接调用存储数组来实现
public class ThreeZeroThree {
    private int[] sums;

    public ThreeZeroThree(int[] nums) {
        sums = new int[nums.length];
        if (nums.length == 0) {
            return;

        }
        sums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sums[i] += sums[i - 1] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        if (i == 0) {
            return sums[j];
        } else {
            return sums[j] - sums[i - 1];
        }
    }
}
