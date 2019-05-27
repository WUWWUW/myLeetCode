package easy;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: OneTwoFive
 * @Package easy
 * @Description:
 * @author: WW
 * @date: 2019/4/28 17:45
 */

/**
 * 125. 验证回文串
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 *
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 * 示例 1:
 *
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 *
 * 输入: "race a car"
 * 输出: false
 */
//解题思路：把所有转换为小写  变为小写的字符串       然后将a-z和0-9 的添加到字符串 最后比较字符串和字符串的逆序是否相等  如果相等则返回true
public class OneTwoFive {
    public static boolean isPalindrome(String s) {
        if(s==null){
            return true;
        }
        String s1=s.toLowerCase();
        int l=s.length();
        StringBuffer stringBuffer=new StringBuffer();
        for(char c:s1.toCharArray()){
            if((c>='0'&&c<='9')||(c>='a'&&c<='z')){
                stringBuffer.append(c);
            }
        }
        return stringBuffer.toString().equals(stringBuffer.reverse().toString());
    }
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(s));
    }
}
