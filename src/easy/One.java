package easy;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: One
 * @Package easy
 * @Description:
 * @author: GYW
 * @date: 2019/4/16 9:03
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
//结题思路：1.暴力，两次循环可以找出   2.哈希表，把数组的值作为key，索引作为value，一次遍历可以得到结果，使用空间换时间。
public class One {
    /**
     * 暴力解法   两层便利
     * @param
     */
//    public static int[] twoSum(int[] nums, int target) {
//        for(int i=0;i<nums.length;i++){
//            int a=target-nums[i];
//            for(int j=0;j<nums.length;j++){
//                if(a==nums[j]&&i!=j){
//                    return new int[]{i,j};
//                }
//            }
//        }
//        return null;
//    }

    /**
     * 使用哈希表通过以空间换取速度的方式，我们可以将查找时间从 O(n)O(n) 降低到 O(1)O(1)。哈希表正是为此目的而构建的，
     * 它支持以 近似 恒定的时间进行快速查找。我用“近似”来描述，是因为一旦出现冲突，
     * 查找用时可能会退化到 O(n)O(n)。但只要你仔细地挑选哈希函数，在哈希表中进行查找的用时应当被摊销为 O(1)O(1)。
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        int a;
        for(int i=0;i<nums.length;i++){
            a=target-nums[i];
            if(map.containsKey(a)&&i!=map.get(a)){
                return new int[]{i,map.get(a)};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums={2,1,4,7};
        int target=3;
        int [] arry= twoSum(nums,target);

        System.out.println(    arry[0]+" "+arry[1]);
    }
}
