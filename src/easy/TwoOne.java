package easy;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: TwoOne
 * @Package easy
 * @Description:
 * @author: WW
 * @date: 2019/4/17 17:21
 */

/**
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * 示例：
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class TwoOne {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 类似归并排序中的合并过程
//        ListNode dummyHead = new ListNode(0);
//        ListNode cur = dummyHead;
//        while (l1 != null && l2 != null) {
//            if (l1.val < l2.val) {
//                cur.next = l1;
//                cur = cur.next;
//                l1 = l1.next;
//            } else {
//                cur.next = l2;
//                cur = cur.next;
//                l2 = l2.next;
//            }
//        }
//        // 任一为空，直接连接另一条链表
//        if (l1 == null) {
//            cur.next = l2;
//        } else {
//            cur.next = l1;
//        }
//        return dummyHead.next;




        ListNode dumyHead=new ListNode(0);
        ListNode cur=dumyHead;
        while (l1!=null&&l2!=null){
            if(l1.val<l2.val){
                cur.next=l1;
                cur=cur.next;
                l1=l1.next;
            }else {
                cur.next=l2;
                cur=cur.next;
                l2=l2.next;
            }
        }
        if(l1==null){
            cur.next=l2;
        }else {
            cur.next=l1;
        }
        return dumyHead.next;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

  }
