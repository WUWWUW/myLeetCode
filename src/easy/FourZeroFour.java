package easy; /**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: easy.easy.FourZeroFour
 * @Package PACKAGE_NAME
 * @Description:
 * @author: WW
 * @date: 2019/5/29 15:39
 */

import easy.TreeNode;

/**
 * 计算给定二叉树的所有左叶子之和。
 *
 * 示例：
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * 在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24
 */
//Java递归先序遍历
public class FourZeroFour {
    int sum;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root!=null){
            getSum(root);
            return sum;
        }
        return 0;
    }
    public void getSum(TreeNode root){
        if(root!=null){
            if(root.left!=null){
                if(root.left.left==null&&root.left.right==null){
                    sum+=root.left.val;
                }
            }
        }
        getSum(root.left);
        getSum(root.right);
    }
    public static void main(String[] args) {

    }
}
