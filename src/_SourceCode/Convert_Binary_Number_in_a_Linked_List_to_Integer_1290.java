package _SourceCode;

public class Convert_Binary_Number_in_a_Linked_List_to_Integer_1290 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {};
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }

    public static int getDecimalValue(ListNode head) {
        ListNode currNode = head;
        int len = 0;
        while(currNode != null){
            len++;
            currNode = currNode.next;
        }
        len--;
        int ans = 0;
        currNode = head;
        while(currNode != null){
            ans += currNode.val * Math.pow(2, len);
            len--;
            currNode = currNode.next;
        }
        return ans;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(0);
        ListNode n3 = new ListNode(1);
        n1.next = n2;
        n2.next = n3;
        System.out.println(getDecimalValue(n1));
    }
}
