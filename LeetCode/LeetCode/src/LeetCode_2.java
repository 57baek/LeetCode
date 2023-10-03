public class LeetCode_2 {
    // Basic LinkedList
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {
        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // Read the ListNode and make it into an int form
    public static int listNodeReader(ListNode ln) {

    }

    public static ListNode listNodeDivider(int num) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    }




}



    /*
    // Function to get the length of a linked list
    public static int getLength(ListNode head) {
        int length = 0;
        ListNode node = head;
        // Traverse the linked list and count nodes
        while(node != null) {
            length++;
            node = node.next;
        }
        return length;
    }
    public static ListNode convertToLinkedList(int num) {
        ListNode fakeHead = new ListNode();
        ListNode current = fakeHead;
        if(num == 0) {
            current.next = new ListNode(0);
            current = current.next;
        }
        while(num > 0) {
            int digit = num % 10; // return the ones digit
            num = num / 10; // delete the ones digit and make tenth digit into ones digit
            current.next = new ListNode(digit);
            current = current.next;
        }
        return fakeHead.next; // skip the fakeHead in the beginning
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int l1_length = LeetCode_2.getLength(l1);
        int l2_length = LeetCode_2.getLength(l2);
        int l1_temp = 0;
        int l2_temp = 0;
        int n1 = 0;
        int n2 = 0;
        ListNode ln1 = l1;
        ListNode ln2 = l2;
        // input: 1 -> 2 -> 3 = 321
        while(ln1 != null) { // && n <= l1_Length
            l1_temp = l1_temp + ln1.val * (int) Math.pow(10, n1);
            ln1 = ln1.next;
            n1++;
        }
        while(ln2 != null) { // && n <= l2_Length
            l2_temp = l2_temp + ln2.val * (int) Math.pow(10, n2);
            ln2 = ln2.next;
            n2++;
        }
        int combined = l1_temp + l2_temp;
        ListNode result = LeetCode_2.convertToLinkedList(combined);
        return result;
    }public static void main(String[] args) {
        LeetCode_2 lc2 = new LeetCode_2();

        ListNode node9 = new ListNode(1); // tail
        ListNode node8 = new ListNode(9, node9);
        ListNode node7 = new ListNode(9, node8);
        ListNode node6 = new ListNode(9, node7);
        ListNode node5 = new ListNode(9, node6);
        ListNode node4 = new ListNode(9, node5); // head

        ListNode node3 = new ListNode(8);
        ListNode node2 = new ListNode(9, node3);

        ListNode node1 = new ListNode(3);

        ListNode result = lc2.addTwoNumbers(node1, node2);
        System.out.println("Result Linked List:");
        lc2.printLinkedList(result);

        System.out.println("Length of node10: " + lc2.getLength(node1));
    }

    public void printLinkedList(ListNode head) {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }

        System.out.println(); // Print a newline at the end for better formatting
    }
}

/**
 * input: 1 -> 2 -> 3 = 123
 * while(ln1 != null) { // && n <= l1_Length
 *      l1_temp = l1_temp + ln1.val * (int) Math.pow(10, (l1_length - 1 - n1));
 *      ln1 = ln1.next;
 *      n1++;
 * }
 * while(ln2 != null) { // && n <= l2_Length
 *      l2_temp = l2_temp + ln2.val * (int) Math.pow(10, (l2_length - 1 - n2));
 *      ln2 = ln2.next;
 *      n2++;
 * }
 */

/**
 * public static int placeExtractor(int num, int Nth_place) { // place(n): 10^n
 *         if (Nth_place <= 0) {
 *             throw new IllegalArgumentException("Place should be greater than 0.");
 *         }
 *         return (int) ((num / Math.pow(10, Nth_place - 1)) % 10);
 *     }
 */
