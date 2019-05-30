package easy; /**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: easy.FourThreeSeven
 * @Package PACKAGE_NAME
 * @Description:
 * @author: WW
 * @date: 2019/5/30 13:47
 */


import java.util.HashMap;
import java.util.Map;

/**
 * 437. 路径总和 III
 *
 * 给定一个二叉树，它的每个结点都存放着一个整数值。
 *
 * 找出路径和等于给定数值的路径总数。
 *
 * 路径不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。
 *
 * 二叉树不超过1000个节点，且节点数值范围是 [-1000000,1000000] 的整数。
 *
 * 示例：
 *
 * root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8
 *
 *       10
 *      /  \
 *     5   -3
 *    / \    \
 *   3   2   11
 *  / \   \
 * 3  -2   1
 *
 * 返回 3。和等于 8 的路径有:
 *
 * 1.  5 -> 3
 * 2.  5 -> 2 -> 1
 * 3.  -3 -> 11
 */
public class FourThreeSeven {
    public int pathSum(TreeNode root, int sum) {
        if (root==null){
            return 0;
        }
        return pathSum(root.left,sum)+pathSum(root.right,sum)+dfs(root,sum);
    }
    public int dfs(TreeNode node,int sum){
        if(node==null)
            return 0;
        int count=0;
        if(node.val==sum){
            count=1;
        }
        return count+dfs(node.left,sum-node.val)+dfs(node.right,sum-node.val);
    }

    public static void main(String[] args) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(1,1);
        map.put(1,1);
        map.put(1,2);
    }
}

class TreeNode {
  int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }
