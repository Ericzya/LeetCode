package alpha2.addTwoNumbers;

/**
 * @author admin
 */
public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int currentDigit = 0;
        int nextDigit = 0;
        ListNode targetNode = new ListNode(0);
        ListNode currentNode = targetNode;
        int result;
        while (l1 != null || l2 != null) {
            result = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + currentNode.val;
            currentDigit = result % 10;
            nextDigit = result / 10;
            currentNode.val = currentDigit;
            if (nextDigit == 0 && (l1 == null || l1.next == null) && (l2 == null || l2.next == null)) {
                break;
            }
            currentNode.next = new ListNode(nextDigit);
            currentNode = currentNode.next;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        return targetNode;

    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
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
