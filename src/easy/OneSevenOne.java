package easy;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: OneSevenOne
 * @Package easy
 * @Description:
 * @author: WW
 * @date: 2019/5/14 9:15
 */

/**
 * 给定一个Excel表格中的列名称，返回其相应的列序号。
 *
 * 例如，
 *
 *     A -> 1
 *     B -> 2
 *     C -> 3
 *     ...
 *     Z -> 26
 *     AA -> 27
 *     AB -> 28
 *     ...
 * 示例 1:
 *
 * 输入: "A"
 * 输出: 1
 * 示例 2:
 *
 * 输入: "AB"
 * 输出: 28
 * 示例 3:
 *
 * 输入: "ZY"
 * 输出: 701
 */
//解题思路：循环 就像求几进制的值一样  循环加值
public class OneSevenOne {
    public static int titleToNumber(String s) {
        if(null==s){
            return 0;
        }
        char[] chars=s.toCharArray();
        int res=0;
        for(int i=0;i<chars.length;i++){
            res=res*26+(chars[i]-'A'+1);
        }
        return res;
    }
    public static void main(String[] args) {
        String a="AAA";
        System.out.println(titleToNumber(a));
    }
}
