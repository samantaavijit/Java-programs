package com.avijitsamanta.DataStructure.LinkedList;

/*/
Input :
1 2 3
8 9 9
OutPut :
9 1 3 1
Explanation :
1+8 = 9
2+9 = (11) 1
3+9 = (12+ carry 1) = (13) 3
                           1
   SO 9 1 3 1
 */
public class AddTwoNumbers {
    static class ListNode {
        ListNode next;
        int val;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    private static ListNode insertNode(ListNode node, int val) {
        if (node == null)
            return new ListNode(val);
        if (node.next == null)
            node.next = new ListNode(val);
        else
            insertNode(node.next, val);
        return node;
    }

    private static void display(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    private static ListNode addTwoNumber(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode head;
        head = insertNode(null, 1);
        head = insertNode(head, 8);
        head = insertNode(head, 3);
        head = insertNode(head, 9);
        display(head);

        head = addTwoNumber(head, head);
        display(head);


    }

}
