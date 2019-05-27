package easy;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: OneOneEight
 * @Package easy
 * @Description:
 * @author: WW
 * @date: 2019/4/28 15:18
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 *
 *
 *
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 * 示例:
 *
 * 输入: 5
 * 输出:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 */
//解题思路;感觉没有什么思路  如果杨辉三角这周题目度做不出来  呐就别去找工作了
public class OneOneEight {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists=new ArrayList<>();
        if(numRows==0||numRows<0){
            return lists;
        }
        if(numRows==1){
            List<Integer> list=new ArrayList<>();
            list.add(1);
            lists.add(list);
            return lists;
        }
        if(numRows==2){
            List<Integer> list=new ArrayList<>();
            list.add(1);
            lists.add(list);
            List<Integer> list1=new ArrayList<>();
            list1.add(1);
            list1.add(1);
            lists.add(list1);
            return lists;
        }
        List<Integer> list=new ArrayList<>();
        list.add(1);
        lists.add(list);
        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(1);
        lists.add(list1);
        for(int i=0;i<numRows-2;i++){
            List<Integer> list2=new ArrayList<>();
            list2.add(1);
            int x=i+1;
            for(int j=0;j<x;j++){
                list2.add(lists.get(i+1).get(j)+lists.get(i+1).get(j+1));
            }
            list2.add(1);
            lists.add(list2);
        }
        return lists;

    }
    public static void main(String[] args) {
      List<List<Integer>> lists=  generate(5);
      lists.forEach(p->{
          p.forEach(q->{
              System.out.print(q+"  ");
          });
          System.out.println();
      });

    }
}
