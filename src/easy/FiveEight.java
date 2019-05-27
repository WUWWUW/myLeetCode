package easy;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: FiveEight
 * @Package easy
 * @Description:
 * @author: WW
 * @date: 2019/4/18 16:37
 */

/**
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 *
 * 如果不存在最后一个单词，请返回 0 。
 *
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 *
 * 示例:
 *
 * 输入: "Hello World"
 * 输出: 5
 */
//解题思路：将字符串分割成数组  得到数组最后一个元素  返回这个元素的长度
public class FiveEight {
    public static int lengthOfLastWord(String s) {
        if(s==null||s.length()==0) return 0;
        String[] buff = s.split(" ");
        String res = "";
        for(int i=0;i<buff.length;i++){
            if(i==buff.length-1) res=buff[i];
        }
        return res.length();

    }
    public static void main(String[] args) {
        System.out.println(  lengthOfLastWord(" a"));


    }
}
