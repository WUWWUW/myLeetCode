package easy;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: OneOneZero
 * @Package easy
 * @Description:
 * @author: WW
 * @date: 2019/4/28 12:43
 */

/**
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 *
 * 本题中，一棵高度平衡二叉树定义为：
 *
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
 *
 * 示例 1:
 *
 * 给定二叉树 [3,9,20,null,null,15,7]
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回 true 。
 *
 * 示例 2:
 *
 * 给定二叉树 [1,2,2,3,3,null,null,4,4]
 *
 *        1
 *       / \
 *      2   2
 *     / \
 *    3   3
 *   / \
 *  4   4
 * 返回 false 。
 */
//解题思路：  先丢这个链接  这个是关于递归问题的解法:http://39.96.217.32/blog/4
    //比较是否是平衡二叉树还有一个比价好的解法 就是比较根节点的左右子树的最大深度 如果的最大深度差大于1则不是平衡二叉树 反之则是  ；这个问题就转换成为求二叉树的最大深度  也是递归但是比较简单
public class OneOneZero {
    public static boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int l=TreeDepth(root.left);
        int r=TreeDepth(root.right);
        int sub=l-r;
        if(sub>1||sub<-1){
            return false;
        }
        return isBalanced(root.left)&&isBalanced(root.right);
    }
    public static int TreeDepth(TreeNode treeNode){
        if(treeNode==null){
            return 0;
        }
        int left=TreeDepth(treeNode.left);
        int right=TreeDepth(treeNode.right);
        return (left>right)?(left+1):(right+1);
    }

    public static void main(String[] args) {

    }
}
