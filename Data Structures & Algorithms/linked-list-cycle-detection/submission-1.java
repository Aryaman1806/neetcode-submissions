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
    public boolean hasCycle(ListNode head) {
    HashSet<ListNode> nodeSet = new HashSet<>();
    ListNode list = head;
    while(list != null){
        if(nodeSet.contains(list)){
            return true;
        }
        else{
            nodeSet.add(list);
        }
        list = list.next;
    }
    return false;
    }
}
