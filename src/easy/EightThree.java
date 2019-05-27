package easy;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: EightThree
 * @Package easy
 * @Description:
 * @author: WW
 * 注意：本内容仅限于上海非码科技内部传阅，禁止外泄以及用于其他的商业目
 */
public class EightThree {

    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return head;
        ListNode p = head;
        while(p.next != null) {
            if(p.next.val == p.val)
                p.next = p.next.next;
            else
                p = p.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode node=new ListNode(1);
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(3);
        node.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        ListNode head=deleteDuplicates(node);
        while (head!=null){
            System.out.println(head.val);
            head=head.next;
        }
    }
}

