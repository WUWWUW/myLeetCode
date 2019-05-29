package easy; /**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: easy.ThreeEightSeven
 * @Package PACKAGE_NAME
 * @Description:
 * @author: WW
 * @date: 2019/5/29 10:32
 */

import java.util.HashMap;
import java.util.Map;

/**
 *387. 字符串中的第一个唯一字符
 * 提交记录
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 *
 * 案例:
 *
 * s = "leetcode"
 * 返回 0.
 *
 * s = "loveleetcode",
 * 返回 2.
 */
//思路：仍然是map  Java的map真的太好用了  很方便
public class ThreeEightSeven {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==null){
                map.put(s.charAt(i),1);
            }else if (map.get(s.charAt(i))>=1){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }
        for (int i = 0; i <s.length() ; i++) {
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
