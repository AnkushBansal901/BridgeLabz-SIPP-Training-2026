public class TempleRecursion {

    static int moveCount = 0;

    static void hanoi(int n, char from, char to, char aux) {
        if (n == 0) return;
        hanoi(n - 1, from, aux, to);
        System.out.println("Move disk " + n + " from " + from + " to " + to);
        moveCount++;
        hanoi(n - 1, aux, to, from);
    }

    static int binarySearch(int[] arr, int target, int low, int high) {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (arr[mid] == target) return mid;
        if (arr[mid] < target) return binarySearch(arr, target, mid + 1, high);
        return binarySearch(arr, target, low, mid - 1);
    }

    static int sumOfDigits(int n) {
        if (n == 0) return 0;
        return n % 10 + sumOfDigits(n / 10);
    }

    static String reverse(String s) {
        if (s.isEmpty()) return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }

    static boolean isBalanced(String s, int index, int count) {
        if (count < 0) return false;
        if (index == s.length()) return count == 0;
        char c = s.charAt(index);
        if (c == '(') return isBalanced(s, index + 1, count + 1);
        if (c == ')') return isBalanced(s, index + 1, count - 1);
        return isBalanced(s, index + 1, count);
    }

    public static void main(String[] args) {
        System.out.println("=== Tower of Hanoi (3 disks) ===");
        hanoi(3, 'A', 'C', 'B');
        System.out.println("Total Moves: " + moveCount);

        System.out.println("\n=== Binary Search ===");
        int[] prices = {10, 25, 38, 47, 56, 72, 89};
        int idx = binarySearch(prices, 56, 0, prices.length - 1);
        System.out.println("Price 56 found at index: " + idx);

        System.out.println("\n=== Sum of Digits ===");
        System.out.println("sumOfDigits(9453) = " + sumOfDigits(9453));

        System.out.println("\n=== Reverse String ===");
        System.out.println("reverse(\"temple\") = " + reverse("temple"));

        System.out.println("\n=== Balanced Parentheses ===");
        System.out.println("\"(()())\" balanced: " + isBalanced("(()())", 0, 0));
        System.out.println("\"((()\" balanced  : " + isBalanced("(()", 0, 0));
    }
}
