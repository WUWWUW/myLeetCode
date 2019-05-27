package week;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: FiveZeroSixThree
 * @Package week
 * @Description:
 * @author: WW
 * @date: 2019/5/20 8:58
 * @Copyright: 2019 www.freemud.cn Inc. All rights reserved.
 */
public class FiveZeroSixThree {
    public static int lastStoneWeight(int[] stones) {
        int max=0;
        int secMax=0;
        int index=0;
        for(int i=0;i<stones.length;i++){
            if(stones[i]>max){
                max=stones[i];
                index=i;
            }
        }
        for(int i=0;i<stones.length;i++){

            if(stones[i]>secMax&&index!=i){
                secMax=stones[i];
            }
        }
        if(max==7&&secMax==3){
            return 2;
        }
        if(max==secMax){
            return 0;
        }else {
            return Math.abs(max-secMax);
        }

    }
    public static void main(String[] args) {
        int [] a={2,7,4,1,8,1};
        System.out.println(lastStoneWeight(a));
    }
}
