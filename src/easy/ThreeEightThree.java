package easy; /**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: easy.ThreeEightThree
 * @Package PACKAGE_NAME
 * @Description:
 * @author: WW
 * @date: 2019/5/29 10:14
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，判断第一个字符串ransom能不能由第二个字符串magazines里面的字符构成。如果可以构成，返回 true ；否则返回 false。
 *
 * (题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。)
 *
 * 注意：
 *
 * 你可以假设两个字符串均只含有小写字母。
 *
 * canConstruct("a", "b") -> false
 * canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 */
//思路：又一次的map大法  但是这次执行用时特别长 只超过了百分之十几的朋友  我再想想有没有更好的方法
public class ThreeEightThree {
    public static boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote==null||ransomNote==null){
            return false;
        }
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            if(map.get(magazine.charAt(i))==null){
                map.put(magazine.charAt(i),1);
            }else if(map.get(magazine.charAt(i))!=null){
                map.put(magazine.charAt(i),1+map.get(magazine.charAt(i)));
            }
        }
        for (int i = 0; i <ransomNote.length(); i++) {
            if(!map.containsKey(ransomNote.charAt(i))||map.get(ransomNote.charAt(i))==0){
                return false;
            }else if(map.get(ransomNote.charAt(i))>=1){
                map.put(ransomNote.charAt(i),map.get(ransomNote.charAt(i))-1);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String ransomNote="a";
        String magazine="b";

        System.out.println(canConstruct(ransomNote,magazine));
    }
}
