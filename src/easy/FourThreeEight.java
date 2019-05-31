package easy; /**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: easy.FourThreeEight
 * @Package PACKAGE_NAME
 * @Description:
 * @author: WW
 * @date: 2019/5/31 14:56
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 给定一个字符串 s 和一个非空字符串 p，找到 s 中所有是 p 的字母异位词的子串，返回这些子串的起始索引。
 *
 * 字符串只包含小写英文字母，并且字符串 s 和 p 的长度都不超过 20100。
 *
 * 说明：
 *
 * 字母异位词指字母相同，但排列不同的字符串。
 * 不考虑答案输出的顺序。
 * 示例 1:
 *
 * 输入:
 * s: "cbaebabacd" p: "abc"
 *
 * 输出:
 * [0, 6]
 *
 * 解释:
 * 起始索引等于 0 的子串是 "cba", 它是 "abc" 的字母异位词。
 * 起始索引等于 6 的子串是 "bac", 它是 "abc" 的字母异位词。
 *  示例 2:
 *
 * 输入:
 * s: "abab" p: "ab"
 *
 * 输出:
 * [0, 1, 2]
 *
 * 解释:
 * 起始索引等于 0 的子串是 "ab", 它是 "ab" 的字母异位词。
 * 起始索引等于 1 的子串是 "ba", 它是 "ab" 的字母异位词。
 * 起始索引等于 2 的子串是 "ab", 它是 "ab" 的字母异位词。
 */
//map真好  但是这个复杂度太高了   而且需要多次使用一个map对象 我只能多次深拷贝 就很难受
public class FourThreeEight {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        Map<Character,Integer> map=new HashMap<>();
        Character c;
        for(int i=0;i<p.length();i++){
            c=p.charAt(i);
            if(map.get(c)==null||map.get(c)==0){
                map.put(p.charAt(i),1);
            }else {
                map.put(p.charAt(i),1+map.get(c));
            }
        }
        for (int i = 0; i <=s.length()-p.length(); i++) {
            String string=s.substring(i,i+p.length());
            HashMap<Character,Integer> map1=new HashMap();
            map1.putAll(map);
            if (isSame(string,map1)==true){
                list.add(i);
            }
        }
        return list;
    }
    public boolean isSame(String string,Map<Character,Integer> map){
        for (int j = 0; j <string.length() ; j++) {

            if(map.get(string.charAt(j))==null||map.get(string.charAt(j))==0){
               return false;
            }else if(map.get(string.charAt(j))>=1){
                map.put(string.charAt(j),map.get(string.charAt(j))-1);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        FourThreeEight fourThreeEight=new FourThreeEight();
        System.out.println(fourThreeEight.findAnagrams( "baa" ,"aa"));
    }
}
