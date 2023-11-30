import java.util.LinkedList;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example 1:
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 * <p>
 * Example 2:
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 * <p>
 * Example 3:
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 * <p>
 * Constraints:
 * The number of nodes in each linked list is in the range [1, 100].
 * 0 <= Node.val <= 9
 * It is guaranteed that the list represents a number that does not have leading zeros.
 */
public class AddTwoReversedLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(2);
        l1.add(4);
        l1.add(3);

        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(5);
        l2.add(6);
        l2.add(4);

        System.out.println(addToNum(l1, l2));
    }

    public static LinkedList<Integer> addToNum(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        String num1 = "";
        String num2 = "";
        char[] sum;
        LinkedList<Integer> result = new LinkedList<>();

        for (Integer i : l1)
            num1 = num1.concat(i.toString());
        for (Integer i : l2)
            num2 = num2.concat(i.toString());


        sum = String.valueOf(Integer.parseInt(num1) + Integer.parseInt(num2)).toCharArray();
        for (int i = sum.length - 1; i >= 0; i--)
            result.add(Integer.parseInt(String.valueOf(sum[i])));


        return result;
    }
}
