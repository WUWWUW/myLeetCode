package easy;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: TwoTwoSix
 * @Package easy
 * @Description:
 * @author: WW
 * @date: 2019/5/23 9:39
 */

/**
 * 翻转一棵二叉树。
 *
 * 示例：
 *
 * 输入：
 *
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * 输出：
 *
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 */
//递归
public class TwoTwoSix {
    public static TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode temp=root.left;
        root.left=invertTree(root.right);
        root.right=invertTree(temp);
        return root;
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(4);
        TreeNode root1=new TreeNode(2);
        TreeNode root2=new TreeNode(7);
        TreeNode root3=new TreeNode(1);
        TreeNode root4=new TreeNode(3);
        TreeNode root5=new TreeNode(6);
        TreeNode root6=new TreeNode(9);
        root.left=root1;
        root.right=root2;
        root1.left=root3;
        root1.right=root4;
        root2.left=root5;
        root2.right=root6;
        invertTree(root);
    }
}
