/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        if (node == null || node.next == null) {
            return; // Should never happen as per problem constraints
        }

        node.val = node.next.val; // Copy next node’s value
        node.next = node.next.next; // Delete next node by skipping it
    }
}

    
