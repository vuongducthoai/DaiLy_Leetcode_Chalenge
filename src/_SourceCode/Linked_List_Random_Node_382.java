package _SourceCode;

import java.util.Random;

public class Linked_List_Random_Node_382 {
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
    ListNode head;
    Random random;
    public Linked_List_Random_Node_382(ListNode head) {
        this.head = head;
        this.random = new Random();

    }

    public int getRandom() {
        ListNode c = head;
        int r = c.val;
        for(int i = 1; c.next != null; i++){
            System.out.println(random.nextInt(i + 1));
            c = c.next;
            if(random.nextInt(i + 1) == i) r = c.val;
        }
        return r;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next =  new ListNode(2);
        head.next.next = new ListNode(3);
        Linked_List_Random_Node_382 solution = new Linked_List_Random_Node_382(head);
        System.out.println(solution.getRandom());
    }
}
