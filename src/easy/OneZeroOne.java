package easy;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: OneZeroOne
 * @Package easy
 * @Description:
 * @author: WW
 * @date: 2019/4/26 10:19
 */

/**
 *给定一个二叉树，检查它是否是镜像对称的。
 *
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 *
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 * 说明:
 *
 * 如果你可以运用递归和迭代两种方法解决这个问题，会很加分。
 */
//解题思路  ;使用递归  还是 关于二叉树的问题 第一时间想到递归  关于二叉树的各种问题如 这个镜像比较啊 二叉树遍历啊这些
public class OneZeroOne {
    public static boolean isSymmetric(TreeNode root) {
        return judege(root,root);
    }
    public static boolean judege(TreeNode root1,TreeNode root2){
        if(root1==null&&root2==null){
            return true;
        }
        if(root1==null||root2==null){
            return false;
        }
        if(root1.val!=root2.val){
            return false;
        }
        return judege(root1.left,root2.right)&&judege(root1.right,root2.left);
    }
    public static void main(String[] args) {

    }
}
