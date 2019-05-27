package easy;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: TwoThreeFour
 * @Package easy
 * @Description:
 * @author: WW
 * @date: 2019/5/23 11:03
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 请判断一个链表是否为回文链表。
 *
 * 示例 1:
 *
 * 输入: 1->2
 * 输出: false
 * 示例 2:
 *
 * 输入: 1->2->2->1
 * 输出: true
 * 进阶：
 * 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 */
//链表转为list
public class TwoThreeFour {
    public static boolean isPalindrome(ListNode head) {
        List<Integer> list=new ArrayList<>();
        while (head!=null){
            list.add(head.val);
            head=head.next;
        }
        List<Integer> list1=list.subList(0,list.size()/2);
        int a=list.size()/2;
        List<Integer> list2;
        if(list.size()%2==0){
            list2=list.subList(a,list.size());
        }else {
            list2=list.subList(a+1,list.size());
        }
        for(int i=0;i<list2.size();i++){
            int x=list1.get(list2.size()-1-i);
            int y=list2.get(i);
            if(x!=y){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        ListNode node1=new ListNode(-129);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(2);
        ListNode node4=new ListNode(-129);
        node1.next=node4;
        System.out.println( isPalindrome(node1));
    }
}
