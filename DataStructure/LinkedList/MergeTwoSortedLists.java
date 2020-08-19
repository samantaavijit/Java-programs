package com.avijitsamanta.DataStructure.LinkedList;

public class MergeTwoSortedLists {
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
        ListNode node = head;
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp=new ListNode(0);
        ListNode cur=temp;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                cur.next=l1;
                l1=l1.next;
            }else{
                cur.next=l2;
                l2=l2.next;
            }
            cur=cur.next;
        }
        if(l1!=null){
            cur.next=l1;
        }

        if(l2!=null){
            cur.next=l2;
        }
        return temp.next;
    }

    public static void main(String[] args) {
        ListNode l1, l2;
        l1 = insertNode(null, 1);
        l1 = insertNode(l1, 4);
        l1 = insertNode(l1, 5);
        display(l1);

        l2 = insertNode(null, 2);
        l2 = insertNode(l2, 3);

        display(l2);

       ListNode head= mergeTwoLists(l1, l2);
       display(head);
    }
}
