package easy;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: OneFourOne
 * @Package easy
 * @Description:
 * @author: WW
 * @date: 2019/5/9 15:29
 */

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个链表，判断链表中是否有环。
 *
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 *
 *
 *
 * 示例 1：
 *
 * 输入：head = [3,2,0,-4], pos = 1
 * 输出：true
 * 解释：链表中有一个环，其尾部连接到第二个节点。
 *
 *
 * 示例 2：
 *
 * 输入：head = [1,2], pos = 0
 * 输出：true
 * 解释：链表中有一个环，其尾部连接到第一个节点。
 *
 *
 * 示例 3：
 *
 * 输入：head = [1], pos = -1
 * 输出：false
 * 解释：链表中没有环。
 *
 *
 *
 *
 * 进阶：
 *
 * 你能用 O(1)（即，常量）内存解决此问题吗？
 */
//解题思路 快慢指针
public class OneFourOne {
    public static boolean hasCycle(ListNode head) {
      /**  Set<ListNode> node = new HashSet<>();
        while(head!=null)
        {
            if(node.contains(head))
                return true;
            else
                node.add(head);
            head = head.next;
        }
        return false;
       **/
        // 判断元素
        if (head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null){
            slow = head.next;
            fast = head.next.next;
            if (slow == fast) return true;
        }
        return  false;

    }
    public static void main(String[] args) {
        System.out.println("www");
    }
}
