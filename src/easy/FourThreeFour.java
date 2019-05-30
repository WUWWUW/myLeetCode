package easy; /**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: easy.FourThreeFour
 * @Package PACKAGE_NAME
 * @Description:
 * @author: WW
 * @date: 2019/5/30 11:59
 */

/**
 * 统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
 *
 * 请注意，你可以假定字符串里不包括任何不可打印的字符。
 *
 * 示例:
 *
 * 输入: "Hello, my name is John"
 * 输出: 5
 */
//每一个不是' '都是一个单词 直到下一个‘ ’出现
public class FourThreeFour {
    public static int countSegments(String s) {
        int i=0,total=0,pre=0;
        while(i<s.length()){
            if(pre==0&&s.charAt(i)!=' '){
                total++;pre=1;
            }
            else if(s.charAt(i)==' ')
                pre=0;
            i++;
        }
        return total;
    }
    public static void main(String[] args) {
        countSegments("Hello, my name is John");
    }
}
