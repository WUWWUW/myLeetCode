package easy;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: TwoOneNine
 * @Package easy
 * @Description:
 * @author: WW
 * @date: 2019/5/22 16:32
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的绝对值最大为 k。
 *
 * 示例 1:
 *
 * 输入: nums = [1,2,3,1], k = 3
 * 输出: true
 * 示例 2:
 *
 * 输入: nums = [1,0,1,1], k = 1
 * 输出: true
 * 示例 3:
 *
 * 输入: nums = [1,2,3,1,2,3], k = 2
 * 输出: false
 */
//用map   贼简单
public class TwoOneNine {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int max=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==null){
                map.put(nums[i],i);
            }else if (map.get(nums[i])!=null){
               max=i-map.get(nums[i]);
               if(max<=k){
                   return true;
               }
                map.put(nums[i],i);
            }

        }
        return false;
    }
    public static void main(String[] args) {
        int [] nums = {99,99};
        System.out.println( containsNearbyDuplicate(nums,1));
    }
}
