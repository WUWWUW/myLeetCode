package easy;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: TwoFiveSeven
 * @Package easy
 * @Description:
 * @author: WW
 * @date: 2019/5/24 9:14
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个二叉树，返回所有从根节点到叶子节点的路径。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例:
 *
 * 输入:
 *
 *    1
 *  /   \
 * 2     3
 *  \
 *   5
 *
 * 输出: ["1->2->5", "1->3"]
 *
 * 解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3
 */
//dfs  深度搜索  注意返回条件  ，字符串拼接 分支判断等
public class TwoFiveSeven {
    public List<String> mlists=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root==null){
            return mlists;
        }
        dfs(root,String.valueOf(root.val));
        return mlists;
    }
    public void dfs(TreeNode root,String str){
        if(root.left==null&&root.right==null){
            mlists.add(str);
            return;
        }
        if(root.left!=null){
            dfs(root.left,str+"->"+root.left.val);
        }
        if(root.right!=null){
            dfs(root.right,str+"->"+root.right.val);
        }
    }
    public static void main(String[] args) {

    }
}
