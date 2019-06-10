package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: FourFourEight
 * @Package PACKAGE_NAME
 * @Description:
 * @author: WW
 * @date: 2019/6/4 9:49
 */
public class FourFourEight {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 1; i <=nums.length; i++) {
            map.put(i,1);
        }
        for (int i = 0; i < nums.length; i++) {
           map.remove(nums[i]);
        }
        for (Integer key : map.keySet()) {
            list.add(key);
      }
        return list;
    }

    public static void main(String[] args) {
        int [] a={4,3,2,7,8,2,3,1};
        System.out.println( findDisappearedNumbers(a));
    }
}
