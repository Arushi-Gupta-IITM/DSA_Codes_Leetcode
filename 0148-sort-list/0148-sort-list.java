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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;

        while(temp != null) {
            int val = temp.val;
            list.add(val);
            temp = temp.next;
        }

        Collections.sort(list);

        if(list.size() > 0) {
            ListNode ans = new ListNode(list.get(0), null);
            temp = ans;

            for(int i=1; i<list.size(); i++) {
                temp.next = new ListNode(list.get(i), null);
                temp = temp.next;
            }

            return ans;
        }
        
        return null;
    }
}