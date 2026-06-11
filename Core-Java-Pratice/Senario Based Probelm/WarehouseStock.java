import java.util.HashSet;

public class WarehouseStock {

    static int findMax(int[] arr) {
        int max = arr[0];
        for (int x : arr) if (x > max) max = x;
        return max;
    }

    static int findMin(int[] arr) {
        int min = arr[0];
        for (int x : arr) if (x < min) min = x;
        return min;
    }

    static int totalStock(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += x;
        return sum;
    }

    static void detectDuplicates(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for (int x : arr) {
            if (!seen.add(x)) duplicates.add(x);
        }
        System.out.println("Duplicates: " + (duplicates.isEmpty() ? "None" : duplicates));
    }

    static int[] rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) rotated[(i + k) % n] = arr[i];
        return rotated;
    }

    static int[][] transpose(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        int[][] result = new int[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[j][i] = grid[i][j];
        return result;
    }

    static void printArray(int[] arr) {
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }

    static void printGrid(int[][] grid) {
        for (int[] row : grid) {
            for (int val : row) System.out.print(val + "\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] stock = {45, 12, 78, 23, 12, 56, 78, 90, 34, 23};
        int k = 3;

        System.out.println("Stock Array:");
        printArray(stock);
        System.out.println("Max Stock   : " + findMax(stock));
        System.out.println("Min Stock   : " + findMin(stock));
        System.out.println("Total Stock : " + totalStock(stock));
        detectDuplicates(stock);

        System.out.println("\nAfter Rotating by " + k + " positions:");
        printArray(rotate(stock, k));

        int[][] shelf = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        System.out.println("\nOriginal Shelf Grid:");
        printGrid(shelf);

        System.out.println("Transposed Shelf Grid:");
        printGrid(transpose(shelf));
    }
}
