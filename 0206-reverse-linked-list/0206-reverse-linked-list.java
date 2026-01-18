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
// class Solution {
//     public ListNode reverseList(ListNode head) {
//         return reverse(head);
//         private ListNode reverse(ListNode head){
//             if(head==null || head.next == null){
//                 return head;
//             }
//             ListNode newhead = reverse(head.next);
//             ListNode front = head.next;
//             front.next=head;
//             head.next=null;
//         }
//         return newhead;

        
//     }
// }

// class Solution {
//     public ListNode reverseList(ListNode head) {
//         return reverse(head);
//     }
    
//     private ListNode reverse(ListNode head) {
//         if (head == null || head.next == null) {
//             return head;
//         }

//         ListNode newHead = reverse(head.next); // Recursively reverse the list
//         head.next.next = head; // Reverse the link
//         head.next = null; // Break the original link

//         return newHead; // Return the new head of the reversed list
//     }
// }


//brute force iterative
class Solution {
    public ListNode reverseList(ListNode head) {

            if(head==null || head.next == null){
                return head;
            }
            ListNode temp = head;
            ListNode prev = null;
            while(temp!=null){
            
            ListNode front = temp.next;
            temp.next = prev;
            prev=temp;
            temp= front;
            }

        return prev;
    }
    
}



