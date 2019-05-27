package easy;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: OneOneOne
 * @Package easy
 * @Description:
 * @author: WW
 * @date: 2019/4/28 13:14
 */

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 给定一个二叉树，找出其最小深度。
 *
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例:
 *
 * 给定二叉树 [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回它的最小深度  2.
 */
//解题思路;  1.树的最小深度 可以参考 树的最大深度的递归解法  2.也可以使用层次遍历 层次遍历的变形再来一次哈哈哈
public class OneOneOne {

    public static int minDepth(TreeNode root) {
//        if (root==null){
//            return 0;
//        }
//        if(root.left==null&&root.right==null){
//            return 1;
//        }
//        int level=0;
//        Queue<TreeNode> q=new ArrayDeque<>();
//        q.add(root);
//        while (!q.isEmpty()){
//            int n=q.size();
//            level++;
//            while (n>0){
//                TreeNode node=q.poll();
//                if(node.left==null&&node.right==null){
//                    return level;
//                }
//                if(node.left!=null){
//                    q.add(node.left);
//                }
//                if(node.right!=null){
//                    q.add(node.right);
//                }
//                n--;
//            }
//        }
//        return level;
        if(root==null){
            return 0;
        }
        if(root.left==null){
            return minDepth(root.right)+1;
        }
        if(root.right==null){
            return minDepth(root.left)+1;
        }
        int left=minDepth(root.left);
        int right=minDepth(root.right);

        return left>right?(right+1):(left+1);
    }
    public static void main(String[] args) {
        TreeNode node1=new TreeNode(3);
        TreeNode node2=new TreeNode(9);
        TreeNode node3=new TreeNode(20);
        TreeNode node4=new TreeNode(15);
        TreeNode node5=new TreeNode(7);

        node1.left=node2;
        node1.right=node3;
        node3.left=node4;
        node3.right=node5;

        System.out.println(  minDepth(node1));
    }
}
