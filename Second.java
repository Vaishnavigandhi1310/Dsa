import java.util.Arrays;

public class Second{
    public static void main(String[] args){
        int[] arr = {10,40,20};
        
        Arrays.sort(arr);
        int largest = arr[arr.length-1];
        for(int i = arr.length-2;i>=0;i--){
        if(arr[i]<largest){
            System.out.println("second largest element "+arr[i]);
            return;
        }
    }
    System.out.println("no second largest element");
}
}