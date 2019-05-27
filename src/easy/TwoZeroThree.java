package easy;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: TwoZeroThree
 * @Package easy
 * @Description:
 * @author: WW
 * @date: 2019/5/20 9:23
 */

/**
 *  删除链表中等于给定值 val 的所有节点。
 *
 * 示例:
 *
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 */
//循环链表 判断是否值相同 相同则跳过   重点：注意循环的界限 防止报空对象异常
public class TwoZeroThree {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode header = new ListNode(-1);
        header.next = head;
        ListNode cur = header;
        while(cur.next != null){
            if(cur.next.val == val ){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return header.next;
    }
    public static void main(String[] args) {
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(6);
        ListNode node4=new ListNode(3);
        ListNode node5=new ListNode(4);
        ListNode node6=new ListNode(5);
        ListNode node7=new ListNode(6);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;
        node6.next=node7;
        int val=6;
        removeElements(node1,6);
    }
}
