package easy; /**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: easy.ThreeFourFive
 * @Package PACKAGE_NAME
 * @Description:
 * @author: WW
 * @date: 2019/5/28 10:18
 */

/**
 * 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 *
 * 示例 1:
 *
 * 输入: "hello"
 * 输出: "holle"
 * 示例 2:
 *
 * 输入: "leetcode"
 * 输出: "leotcede"
 * 说明:
 * 元音字母不包含字母"y"。
 */
//思路：两个哨兵分别往中间跑,遇到元音就停下, 两个都停下了就交换,然后接着跑
public class ThreeFourFive {
    public String reverseVowels(String s) {
        if(s==null){
            return s;
        }
        char[] chars=s.toCharArray();
        int low=0,high=chars.length-1;
        char temp;
        while (low<=high){
            while (low<=high&&!isValid(chars[low])){
                low++;
            }
            while (low<=high&&!isValid(chars[high])){
                high--;
            }
            if(low<=high){
                temp=chars[low];
                chars[low]=chars[high];
                chars[high]=temp;
                low++;
                high--;
            }
        }
        return new String(chars);
    }
    public boolean isValid(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            return true;
        }
        return false;
    }
}
