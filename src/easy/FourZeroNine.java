package easy; /**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: easy.FourZeroNine
 * @Package PACKAGE_NAME
 * @Description:
 * @author: WW
 * @date: 2019/5/30 9:18
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 409. 最长回文串
 *
 * 给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。
 *
 * 在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。
 *
 * 注意:
 * 假设字符串的长度不会超过 1010。
 *
 * 示例 1:
 *
 * 输入:
 * "abccccdd"
 *
 * 输出:
 * 7
 *
 * 解释:
 * 我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。
 */
//思路：还是使用map  偶数直接加起来 奇数需要-1  这样    然后map的遍历啊什么的需要掌握 再复习一波
public class FourZeroNine {
    public static int longestPalindrome(String s) {
        int max=0;
        int flag=0;
        Map<Character,Integer> map=new HashMap<>();
        Integer temp;
        for (int i = 0; i <s.length() ; i++) {
            temp=map.get(s.charAt(i));
            if(temp==null||temp==0){
                map.put(s.charAt(i),1);
            }else {
                map.put(s.charAt(i),1+temp);
            }
        }
        for(Integer value:map.values()){
            if(value%2==0){
                max+=value;
            }else {
                max+=(value-1);
                flag=1;
            }
        }
        return max+flag;
    }


    public static void main(String[] args) {

        System.out.println(  longestPalindrome("abccccdd"));
    }
}
