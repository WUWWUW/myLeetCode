package easy;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: TwoNineZero
 * @Package easy
 * @Description:
 * @author: WW
 * @date: 2019/5/27 15:14
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一种规律 pattern 和一个字符串 str ，判断 str 是否遵循相同的规律。
 *
 * 这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应规律。
 *
 * 示例1:
 *
 * 输入: pattern = "abba", str = "dog cat cat dog"
 * 输出: true
 * 示例 2:
 *
 * 输入:pattern = "abba", str = "dog cat cat fish"
 * 输出: false
 * 示例 3:
 *
 * 输入: pattern = "aaaa", str = "dog cat cat dog"
 * 输出: false
 * 示例 4:
 *
 * 输入: pattern = "abba", str = "dog dog dog dog"
 * 输出: false
 * 说明:
 * 你可以假设 pattern 只包含小写字母， str 包含了由单个空格分隔的小写字母。
 */
//思路：使用map 数组分隔 一个一个比较放入map
public class TwoNineZero {
    public static boolean wordPattern(String pattern, String str) {
        Map<Character,String> map=new HashMap<>();
        char[] p=pattern.toCharArray();
        String[] s=str.split(" ");
        if(p.length!=s.length){
            return false;

        }
        for(int i=0,size=p.length;i<size;i++){
            if(map.containsKey(p[i])){
                if(!map.get(p[i]).equals(s[i])){
                    return false;
                }
            }else if(map.containsValue(s[i])){
                return false;
            }
            map.put(p[i],s[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern="abba";
        String str="dog dog dog dog";
        wordPattern(pattern,str);
    }
}
