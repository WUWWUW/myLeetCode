package easy;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: TwoSix
 * @Package easy
 * @Description:
 * @author: WW
 * @date: 2019/4/18 9:18
 */

/**
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 *
 * 示例 1:
 *
 * 给定数组 nums = [1,1,2],
 *
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 *
 * 你不需要考虑数组中超出新长度后面的元素。
 * 示例 2:
 *
 * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 *
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 *
 * 你不需要考虑数组中超出新长度后面的元素。
 */
//解题思路：有两条线 一条线要计算重复的数字个数用来返回   一条线要保证正确的移动来实现数组原地的换位置 移动位置 这样
public class TwoSix {
    public static int removeDuplicates(int[] nums) {
        int length=nums.length;
        if(length==0){
            return 0;
        }
        int n=0;
        int x=0;
        for(int i=0;i<length-1;i++){
            for(int j=i+1;j<length;j++){
                nums[x]=nums[i];
                if(nums[i]==nums[j]){
                    n++;
                    i=j;
                }
            }
            x++;
        }
        nums[x]=nums[length-1];
        for (int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        return length-n;
    }

    public static void main(String[] args) {
        int [] nums= {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(nums));

    }
}
