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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        
        ListNode slow =head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next !=null){
            slow=slow.next;
            fast = fast.next.next;

        }
        ListNode newhead = reverse(slow.next);
        ListNode first =head;
        ListNode sec = newhead;
        while(sec!=null){
            if(first.val != sec.val){
                reverse(newhead);
                return false;
            }
            first = first.next;
            sec= sec.next;
            
        } 
        reverse(newhead);
        return true;
        
    }
    private ListNode reverse(ListNode head){
            ListNode temp =head;
            ListNode prev =null;
            while(temp!=null){
                ListNode front = temp.next;
                temp.next=prev;
                prev = temp;
                temp= front;
            }
            return prev;
        }

}