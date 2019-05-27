package easy;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: TwoEight
 * @Package easy
 * @Description:
 * @author: WW
 * @date: 2019/4/18 14:20
 */

/**   kmp算法
 * 实现 strStr() 函数。
 *
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 *
 * 示例 1:
 *
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * 示例 2:
 *
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 * 说明:
 *
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 *
 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
 */
//kmp算法
public class TwoEight {

    public static int strStr(String haystack, String needle) {
        if(needle.length()==0)
            return 0;
        int[] next=getNext(needle.toCharArray());
        int i=0,j=0;
        while(i<haystack.length()&&j<needle.length()){
            if(j==-1||haystack.charAt(i)==needle.charAt(j)){
                i++;
                j++;
            }else
                j=next[j];
        }
        if(j==needle.length())
            return i-j;
        else
            return -1;
    }

    public static int[] getNext(char[] pstr){
        int[] next=new int[pstr.length+1];
        int i=0,j=-1;
        next[0]=-1;
        while(i<pstr.length){
            if(j==-1||pstr[i]==pstr[j]){
                i++;
                j++;
                next[i]=j;
            }else
                j=next[j];
        }
        return next;
    }
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        strStr(haystack,needle);
    }
}
