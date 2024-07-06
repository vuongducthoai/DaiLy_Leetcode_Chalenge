package _SourceCode;

import java.util.ArrayList;
import java.util.List;

public class Find_the_Minimum_and_Maximum_Number_of_Nodes_Between_Critical_Points_2058 {
  public static class ListNode{
    int val;
    ListNode next;
    ListNode(){};
    ListNode(int val){
      this.val = val;
    }
    ListNode(int val, ListNode next){
      this.val = val;
      this.next = next;
    }
  }

  public int[] nodesBetweenCriticalPoints(ListNode head) {
    if(head == null || head.next == null || head.next.next == null){
      return new int[]{-1, -1};
    }

    List<Integer> criticalPoints = new ArrayList<>();
    ListNode prev = head;
    ListNode curr = head.next;
    int position = 1;
    while(curr.next != null){
      if((curr.val > prev.val && curr.val > curr.next.val) || curr.val < prev.val && curr.val < curr.next.val){
        criticalPoints.add(position);
      }
      prev = curr;
      curr = curr.next;
      position++;
    }
    if(criticalPoints.size() < 2){
      return new int[]{-1, - 1};
    }
    int minDistance = Integer.MAX_VALUE;
    int maxDistance = criticalPoints.get(criticalPoints.size() -1) - criticalPoints.get(0);
    for(int i = 1; i < criticalPoints.size(); i ++){
      minDistance = Math.min(minDistance, criticalPoints.get(i) - criticalPoints.get(i - 1));
    }
    return new int[]{minDistance, maxDistance};
  }

  public static void main(String[] args) {
      ListNode n1 = new ListNode(3);
      ListNode n2 = new ListNode(1);
      n2.next = n2;
  }
}