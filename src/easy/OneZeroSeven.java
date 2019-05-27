package easy;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: OneZeroSeven
 * @Package easy
 * @Description:
 * @author: WW
 * @date: 2019/4/28 9:37
 */

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 *
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其自底向上的层次遍历为：
 *
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 */
//解题思路;二叉树的层次遍历  使用队列 进行层次遍历 这个问题遇到过很多次了  慢慢的已经完全可以自己写出来  以后遇到相关的层次遍历的变形题目 多总结就好
public class OneZeroSeven {
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lists=new LinkedList<>();
        if (root==null){
            return lists;
        }
        List<Integer> listroot=new ArrayList<>();
        listroot.add(root.val);
        ((LinkedList<List<Integer>>) lists).addFirst(listroot);
        Deque<TreeNode> deque=new LinkedList();
        deque.addLast(root);
        while (deque.size()>0){
            int n=deque.size();
            List<Integer> list=new ArrayList<>();
            while (n>0){
                TreeNode left=deque.getFirst().left;
                if(left!=null){
                    deque.addLast(left);
                    list.add(left.val);
                }
                TreeNode right=deque.getFirst().right;
                if(right!=null){
                    deque.addLast(right);
                    list.add(right.val);
                }
                n--;
                deque.removeFirst();

            }
            if(list.size()>0) {
            ((LinkedList<List<Integer>>) lists).addFirst(list);
            }
        }
        return lists;
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

        List<List<Integer>> lists=levelOrderBottom(node1);
        lists.forEach(p->{
            p.forEach(q->{
                System.out.print(q.toString()+"   ");
            });
            System.out.println();
        });
    }
}
