package easy;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: TwoZeroSix
 * @Package easy
 * @Description:
 * @author: WW
 * @date: 2019/5/22 14:59
 */

/**
 * 反转一个单链表。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 */
//解题思路：链表反转 一定要回！！！！！！  三个解法  ：1。递归  2.转换成list  3.普通解法 用两个中间变量
public class TwoZeroSix {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null; //前指针节点
        ListNode curr = head; //当前指针节点
        //每次循环，都将当前节点指向它前面的节点，然后当前节点和前节点后移
        while (curr != null) {
            ListNode nextTemp = curr.next; //临时节点，暂存当前节点的下一节点，用于后移
            curr.next = prev; //将当前节点指向它前面的节点
            prev = curr; //前指针后移
            curr = nextTemp; //当前指针后移
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(4);
        ListNode node5=new ListNode(5);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        reverseList(node1);
    }

    /**  递归解法
     *   public ListNode reverseList(ListNode head) {
     *         return reverse(head, null);
     *     }
     *
     *     private ListNode reverse(ListNode current, ListNode pre) {
     *         if (current == null) {
     *             return pre;
     *         }
     *         ListNode next = current.next;
     *         current.next = pre;
     *         return reverse(next, current);
     *     }
     */
}
