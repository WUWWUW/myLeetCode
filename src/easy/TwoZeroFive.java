package easy;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: TwoZeroFive
 * @Package easy
 * @Description:
 * @author: WW
 * @date: 2019/5/20 10:26
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 给定两个字符串 s 和 t，判断它们是否是同构的。
 *
 * 如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。
 *
 * 所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。
 * 示例 1:
 *
 * 输入: s = "egg", t = "add"
 * 输出: true
 * 示例 2:
 *
 * 输入: s = "foo", t = "bar"
 * 输出: false
 * 示例 3:
 *
 * 输入: s = "paper", t = "title"
 * 输出: true
 */

public class TwoZeroFive {
    public static boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map = new HashMap<>();
        if(s.length()!=t.length())
            return false;
        for(int i = 0;i<s.length();i++){
            char ss = s.charAt(i);
            char tt = t.charAt(i);
            if(map.containsKey(ss)){
                if(map.get(ss)!=tt)
                    return false;
            }else{
                if(map.containsValue(tt))
                    return false;
                map.put(ss,tt);
            }

        }
        return true;
    }
    public static void main(String[] args) {
        String  s = "paper", t = "tatle";
        isIsomorphic(s,t);
    }
}
