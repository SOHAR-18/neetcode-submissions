/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        ListNode s = head, f = head;
        while(f.next != null && f.next.next != null){
            s = s.next;
            f = f.next.next;
        }
        ListNode p = null, c = s.next;
        s.next = null;
        while(c!=null){
            ListNode n = c.next;
            c.next=p;
            p=c;
            c =n;
        } 
        ListNode a = head,b=p;
        while(b!=null){
            ListNode t1 =a.next,t2 = b.next;
            a.next =b;
            b.next =t1;
            a =t1;
            b = t2;
        }
    }
}
