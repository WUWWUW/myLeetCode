package easy; /**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: easy.FourOneTwo
 * @Package PACKAGE_NAME
 * @Description:
 * @author: WW
 * @date: 2019/5/30 10:26
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 412. Fizz Buzz
 *

 * 写一个程序，输出从 1 到 n 数字的字符串表示。
 *
 * 1. 如果 n 是3的倍数，输出“Fizz”；
 *
 * 2. 如果 n 是5的倍数，输出“Buzz”；
 *
 * 3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。
 *
 * 示例：
 *
 * n = 15,
 *
 * 返回:
 * [
 *     "1",
 *     "2",
 *     "Fizz",
 *     "4",
 *     "Buzz",
 *     "Fizz",
 *     "7",
 *     "8",
 *     "Fizz",
 *     "Buzz",
 *     "11",
 *     "Fizz",
 *     "13",
 *     "14",
 *     "FizzBuzz"
 * ]
 */
//简单
public class FourOneTwo {
    public static List<String> fizzBuzz(int n) {
        List<String> list=new ArrayList<>();
        for (int i = 1; i <=n ; i++) {
            if(i%3==0&&i%5!=0){
                list.add("Fizz");
            }else if(i%5==0&&i%3!=0){
                list.add("Buzz");
            }else if(i%5==0&&i%3==0){
                list.add("FizzBuzz");
            }else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }

    public static void main(String[] args) {

        System.out.println(fizzBuzz(15));
    }
}
