package easy; /**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: FourFiveNine
 * @Package PACKAGE_NAME
 * @Description:
 * @author: WW
 * @date: 2019/6/10 10:16
 */

/**

 * 给定一个非空的字符串，判断它是否可以由它的一个子串重复多次构成。给定的字符串只含有小写英文字母，并且长度不超过10000。
 *
 * 示例 1:
 *
 * 输入: "abab"
 *
 * 输出: True
 *
 * 解释: 可由子字符串 "ab" 重复两次构成。
 * 示例 2:
 *
 * 输入: "aba"
 *
 * 输出: False
 * 示例 3:
 *
 * 输入: "abcabcabcabc"
 *
 * 输出: True
 *
 * 解释: 可由子字符串 "abc" 重复四次构成。 (或者子字符串 "abcabc" 重复两次构成。)
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/repeated-substring-pattern
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
//解题思路：两次遍历就行了 第一次遍历取字符串  第二次遍历依次比较 但是中间有很多可以优化的地方来减少遍历次数  最后时间超过90% 说明这个二次遍历也不是很慢
public class FourFiveNine {
    public boolean repeatedSubstringPattern(String s) {
        if(s.equals("")||s==null){
            return false;
        }
        boolean hhh;
        int length=s.length();
        for (int i = 1; i <=length/2 ; i++) {
            hhh=true;
            if(length%i==0){
                String temp=s.substring(0,i);
                for (int j = 1; j <length/i ; j++) {
                    String string= s.substring(i*j,i*(j+1));
                    if(!temp.equals(string)){
                       hhh=false;
                       j=length/i;
                    }
                }
                if(hhh==true){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        FourFiveNine fourFiveNine=new FourFiveNine();

        System.out.println( fourFiveNine.repeatedSubstringPattern("aabaaba"));
    }
}
