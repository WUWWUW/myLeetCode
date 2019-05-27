package easy;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: OneThreeSix
 * @Package easy
 * @Description:
 * @author: WW
 * @date: 2019/5/9 14:50
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 示例 1:
 *
 * 输入: [2,2,1]
 * 输出: 1
 * 示例 2:
 *
 * 输入: [4,1,2,1,2]
 * 输出: 4
 */
//解题思路：使用hashMap比较好
public class OneThreeSix {
    public static int singleNumber(int[] nums) {
        if (nums.length<=0){
            return 0;
        }
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==null){
                map.put(nums[i],1);
            }else {
                map.put(nums[i],2);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==1){
                return nums[i];
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] array={2,2,1};
        System.out.println(singleNumber(array));
    }
}
