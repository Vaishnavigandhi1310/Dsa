import java.util.Arrays;

public class productTriplet{
	public static void main(String args[]){
		int[] arr = {10,20,60,40,50};
		Arrays.sort(arr);
		int n = arr.length;

		int product1 = arr[n-1]*arr[n-2]*arr[n-3];
		int product2 = arr[0]*arr[1]*arr[n-1];

		int maxProduct = Math.max(product1,product2);

        // int maxProduct = Math.max(product1, product2);
		System.out.println("maxProduct is " + maxProduct);
	}
}