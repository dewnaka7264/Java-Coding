import java.util.Arrays;
public class ArrayAscending {
    public static void main(String[] args) {

        int[] numbers = {5, 12, 9, 27, 8, 35, 15};

        // Sort the array in descending order
        bubbleSortDescending(numbers);

        System.out.println(Arrays.toString(numbers));
    }

    static void bubbleSortDescending(int[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] < arr[i]) {
                    // Swap arr[i-1] and arr[i]
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }
}
