public class maxCount {
    public static void main(String[] args) {
        int[] arr = {4, 5, 4, 6, 4, 5, 6, 6, 6};

        int maxCount = 0;
        int maxNumber = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            // Count occurrences of arr[i]
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // Check if this is the max so far
            if (count > maxCount) {
                maxCount = count;
                maxNumber = arr[i];
            }
        }

        System.out.println("Sabse zyada baar aaya number: " + maxNumber);
        System.out.println("Aane ki sankhya (count): " + maxCount);
    }
}
