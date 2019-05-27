package easy;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: OneZeroEight
 * @Package easy
 * @Description:
 * @author: WW
 * @date: 2019/4/28 10:40
 */

import java.util.Arrays;

/**
 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
 *
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 *
 * 示例:
 *
 * 给定有序数组: [-10,-3,0,5,9],
 *
 * 一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
 *
 *       0
 *      / \
 *    -3   9
 *    /   /
 *  -10  5
 */
public class OneZeroEight {
    public static TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0){
            return null;
        }
        TreeNode root=new TreeNode(nums[nums.length/2]);
        root.left=sortedArrayToBST(Arrays.copyOfRange(nums,0,nums.length/2));
        root.right=sortedArrayToBST(Arrays.copyOfRange(nums,nums.length/2+1,nums.length));
        return root;
    }

    public static void main(String[] args) {
        int [] nums={-10,-3,0,5,9};
        sortedArrayToBST(nums);
    }
}
