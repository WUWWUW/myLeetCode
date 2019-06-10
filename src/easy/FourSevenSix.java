package easy; /**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: FourSevenSix
 * @Package PACKAGE_NAME
 * @Description:
 * @author: WW
 * @date: 2019/6/10 13:46
 */

/**
 * 476. 数字的补数
 *
 * 给定一个正整数，输出它的补数。补数是对该数的二进制表示取反。
 *
 * 注意:
 *
 * 给定的整数保证在32位带符号整数的范围内。
 * 你可以假定二进制数不包含前导零位。
 * 示例 1:
 *
 * 输入: 5
 * 输出: 2
 * 解释: 5的二进制表示为101（没有前导零位），其补数为010。所以你需要输出2。
 * 示例 2:
 *
 * 输入: 1
 * 输出: 0
 * 解释: 1的二进制表示为1（没有前导零位），其补数为0。所以你需要输出0。
 */
public class FourSevenSix {
    public static int findComplement(int num) {
        String res="";
        int temp;
        for (int i = num; i >=1 ; i=i/2) {
            if(i%2==0){
                temp=0;
            }else {
                temp=1;
            }
            res=temp+res;
        }
        int result=0;
        int j=0;
        for (int i = res.length()-1; i >=0; i--) {
            if(res.charAt(i)=='0'){
                result+=Math.pow(2,j);
            }
            j++;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println( findComplement(2));
    }
}
