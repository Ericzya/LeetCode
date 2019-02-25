package a2.addTwoNumbers;

/**
 * @author admin
 */
public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int flag = 0;
        ListNode currentNode = new ListNode(0);
        ListNode targetNode = currentNode;
        int tempInteger;
        do {
            tempInteger = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + flag;
            flag = tempInteger / 10;
            tempInteger = tempInteger % 10;
            currentNode.next = new ListNode(tempInteger);
            currentNode = currentNode.next;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        } while (l1 != null || l2 != null);
        if (flag > 0) {
            currentNode.next = new ListNode(flag);
        }
        return targetNode.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(9);
        l1.next.next.next = new ListNode(9);
        ListNode l2 = new ListNode(4);
        l2.next = new ListNode(5);
        l2.next.next = new ListNode(6);
        ListNode resultListNode = addTwoNumbers(l1, l2);
        while (resultListNode != null) {
            System.out.print(resultListNode.val + "\t");
            resultListNode = resultListNode.next;
        }
    }
    /**
     * Definition for singly-linked list.
     */
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
