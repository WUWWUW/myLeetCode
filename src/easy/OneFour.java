package easy;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: OneFour
 * @Package easy
 * @Description:
 * @author: WW
 * @date: 2019/4/17 15:36
 */

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 */
//解题思路：首先找到最短的字符串，这样可以减少以后比较的次数，循环找到最短的字符串   然后两层循环进行查找 符合条件的最长子串
public class OneFour {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        int length=strs.length;
        int minLength=strs[0].length();
        int minIndex=0;
        boolean flag=true;
        for(int i=0;i<length;i++){
            if(minLength>strs[i].length()){
                minLength=strs[i].length();
                minIndex=i;
            }
        }
        StringBuffer result=new StringBuffer();
        String minString=strs[minIndex];
        for(int i=0;i<minLength;i++){
            for(int j=0;j<length;j++){
                if(minString.charAt(i)!=strs[j].charAt(i)){
                    flag=false;
                    break;
                }
            }
            if (false==flag){
                break;
            }
            result.append(minString.charAt(i));
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
            String [] strings={"flower","flow","flight"};

        System.out.println(longestCommonPrefix(strings));
    }
}
