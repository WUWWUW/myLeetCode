package easy; /**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: easy.FourZeroOne
 * @Package PACKAGE_NAME
 * @Description:
 * @author: WW
 * @date: 2019/5/29 15:29
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 401. 二进制手表
 *
 * 二进制手表顶部有 4 个 LED 代表小时（0-11），底部的 6 个 LED 代表分钟（0-59）。
 *
 * 每个 LED 代表一个 0 或 1，最低位在右侧。

 * 例如，上面的二进制手表读取 “3:25”。
 *
 * 给定一个非负整数 n 代表当前 LED 亮着的数量，返回所有可能的时间。
 *
 * 案例:
 *
 * 输入: n = 1
 * 返回: ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"]
 *
 *
 * 注意事项:
 *
 * 输出的顺序没有要求。
 * 小时不会以零开头，比如 “01:00” 是不允许的，应为 “1:00”。
 * 分钟必须由两位数组成，可能会以零开头，比如 “10:2” 是无效的，应为 “10:02”。
 */
//思路：直接暴力 从0:00->11:59 直接判断小时位出现的1个数+分秒位出现的1个数
public class FourZeroOne {
    public static List<String> readBinaryWatch(int num) {
        List<String> res=new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j <60 ; j++) {
                if(count(i)+count(j)==num){
                    res.add(i+":"+(j<10?"0"+j:j));
                }
            }
        }
        return res;
    }
    private static int count(int n){
        int res=0;
        while (n!=0){
            n=n&(n-1);
            res++;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(readBinaryWatch(1));
    }
}
