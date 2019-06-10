package easy; /**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: FourFourSeven
 * @Package PACKAGE_NAME
 * @Description:
 * @author: WW
 * @date: 2019/6/4 8:57
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 给定平面上 n 对不同的点，“回旋镖” 是由点表示的元组 (i, j, k) ，其中 i 和 j 之间的距离和 i 和 k 之间的距离相等（需要考虑元组的顺序）。
 *
 * 找到所有回旋镖的数量。你可以假设 n 最大为 500，所有点的坐标在闭区间 [-10000, 10000] 中。
 *
 * 示例:
 *
 * 输入:
 * [[0,0],[1,0],[2,0]]
 *
 * 输出:
 * 2
 *
 * 解释:
 * 两个回旋镖为 [[1,0],[0,0],[2,0]] 和 [[1,0],[2,0],[0,0]]
 */

/**
 * 这道题思路其实也比较简单，计算一点和其他点之间的距离，使用哈希表存储，若同一距离出现多次，则可以形成回旋镖。
 * 假设同一距离出现 n 次，由数字规律可推出回旋镖的数量 sum = n*(n-1) 。本人开始只能做到存储到哈希表，然后按该公式累加得到最后结果。
 * 参考了速度第一的答案，优化如下：假设当前同一距离的数量为 n, 回旋镖数量为 n*(n-1), 当再出现一个同一距离时，回旋镖的数量应为 (n+1)*n，与之前相差 (n+1)*n - n*(n-1) = 2*n，
 * 所以只需要把最后答案加上 2*n, 最后 n+1 再存储到哈希表中。
 */
public class FourFourSeven {
    public int numberOfBoomerangs(int[][] points) {
        int ans=0;
        Map<Double,Integer> map=new HashMap<>();
        for (int i = 0; i <points.length ; i++) {
            for (int j = i+1; j <points.length ; j++) {
                double dis=getDistance(points[i],points[j]);
                if(!map.containsKey(dis)){
                    map.put(dis,1);
                }else {
                    int n=map.get(dis);
                    ans+=2*n;
                    map.put(dis,1+n);
                }
            }
            map.clear();
        }
        return ans;
    }
    public double getDistance(int[] numsA,int[] numsB){
       return Math.sqrt( Math.pow(( (numsA[0]-numsB[0])),2)+ Math.pow(( (numsA[1]-numsB[1])),2));
    }

    public static void main(String[] args) {
        int [] a={0,0};
        int [] b={0,1};

    }
}
