package easy; /**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: easy.ThreeEightNine
 * @Package PACKAGE_NAME
 * @Description:
 * @author: WW
 * @date: 2019/5/29 13:38
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 389. 找不同
 *
 * 给定两个字符串 s 和 t，它们只包含小写字母。
 *
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 *
 * 请找出在 t 中被添加的字母。
 *
 *
 *
 * 示例:
 *
 * 输入：
 * s = "abcd"
 * t = "abcde"
 *
 * 输出：
 * e
 *
 * 解释：
 * 'e' 是那个被添加的字母。
 */
//思路：map
public class ThreeEightNine {
    public char findTheDifference(String s, String t) {
        if(s==null||t==null){
            return ' ';
        }

        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==null){
                map.put(s.charAt(i),1);
            }else {
                map.put(s.charAt(i),1+map.get(s.charAt(i)));
            }

        }
        for (int i = 0; i <t.length() ; i++) {
            if(map.get(t.charAt(i))==null||map.get(t.charAt(i))==0){
                return t.charAt(i);
            }else {
                map.put(t.charAt(i),map.get(t.charAt(i))-1);
            }
        }
        return ' ';
    }
}
