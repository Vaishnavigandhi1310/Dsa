// import java.util.Arrays;

// public class thirdLargest {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5, 6};

//         Arrays.sort(arr); // Sort in ascending order

//         int count = 1; // count of distinct elements
//         int thirdLargest = -1;

//         for (int i = arr.length - 2; i >= 0; i--) {
//             if (arr[i] != arr[i + 1]) {
//                 count++;
//                 if (count == 3) {
//                     thirdLargest = arr[i];
//                     break;
//                 }
//             }
//         }

//         if (count < 3) {
//             System.out.println("No third largest number.");
//         } else {
//             System.out.println("Third largest number: " + thirdLargest);
//         }
//     }
// }
import java.util.Arrays;

public class thirdLargest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        Arrays.sort(arr); // Sort in ascending order

        int count = 1; // count of distinct elements
        int thirdLargest = -1;

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != arr[i + 1]) {
                count++;
                if (count == 3) {
                    thirdLargest = arr[i];
                    break;
                }
            }
        }

        if (count < 3) {
            System.out.println("No third largest number.");
        } else {
            System.out.println("Third largest number: " + thirdLargest);
        }
    }
}
