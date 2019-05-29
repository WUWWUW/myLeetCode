package easy; /**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: easy.ThreeFourNine
 * @Package PACKAGE_NAME
 * @Description:
 * @author: WW
 * @date: 2019/5/28 10:58
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 * 示例 1:
 *
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2]
 * 示例 2:
 *
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [9,4]
 * 说明:
 *
 * 输出结果中的每个元素一定是唯一的。
 * 我们可以不考虑输出结果的顺序。
 */
//数组方面的操作用map 是真的方便了   map大法好  其实用set会更方便 因为set里面不能有相同的元素   不过复杂度应该一样 因为set也是通过map操作的  我们直接把remove的操作拿出来自己写也是一样的
public class ThreeFourNine {
    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            if(map.get(nums1[i])!=null){
                continue;
            }
            map.put(nums1[i],1);
        }
        for(int i=0;i<nums2.length;i++){
            if(map.get(nums2[i])!=null){
                list.add(nums2[i]);
                map.remove(nums2[i]);
            }
        }
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] num1={1,2,2,1};
        int[] num2={2,2};
        intersection(num1,num2);
    }
}
