package easy;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: OneOneNine
 * @Package easy
 * @Description:
 * @author: WW
 * @date: 2019/4/28 15:43
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 *
 *
 *
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 * 示例:
 *
 * 输入: 3
 * 输出: [1,3,3,1]
 * 进阶：
 *
 * 你可以优化你的算法到 O(k) 空间复杂度吗？
 */
//解题思路:  1.最暴力的方法 就是杨辉三角I的解法  最后返回这个list的这个索引   2.使用动态规划的方法
public class OneOneNine {
    public static List<Integer> getRow(int  rowIndex) {
//        int hhh= rowIndex+1;
//        List<List<Integer>> lists=new ArrayList<>();
//        List<Integer> list0=new ArrayList<>();
//        if(hhh==0||hhh<0){
//            return list0;
//        }
//        if(hhh==1){
//            List<Integer> list=new ArrayList<>();
//            list.add(1);
//            lists.add(list);
//            return list;
//        }
//        if(hhh==2){
//            List<Integer> list=new ArrayList<>();
//            list.add(1);
//            lists.add(list);
//            List<Integer> list1=new ArrayList<>();
//            list1.add(1);
//            list1.add(1);
//            lists.add(list1);
//            return list1;
//        }
//        List<Integer> list=new ArrayList<>();
//        list.add(1);
//        lists.add(list);
//        List<Integer> list1=new ArrayList<>();
//        list1.add(1);
//        list1.add(1);
//        lists.add(list1);
//        for(int i=0;i<hhh-2;i++){
//            List<Integer> list2=new ArrayList<>();
//            list2.add(1);
//            int x=i+1;
//            for(int j=0;j<x;j++){
//                list2.add(lists.get(i+1).get(j)+lists.get(i+1).get(j+1));
//            }
//            list2.add(1);
//            lists.add(list2);
//        }
//        return lists.get(rowIndex);
        Integer[] dp = new Integer[rowIndex + 1];
        Arrays.fill(dp,1);
        for(int i = 2;i < dp.length;i++){
            for(int j = i - 1;j > 0;j--)
                dp[j] = dp[j] + dp[j - 1];
        }
        List<Integer> res = Arrays.asList(dp);
        return res;

    }
    public static void main(String[] args) {
        getRow(3);
    }
}
