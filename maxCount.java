


// // public class maxCount{
// //     public static void main(String args[]){
// //           int[] arr = {4, 5, 4, 6, 4, 5, 6, 6, 6};
// //         int maxCount=0;
// //         int maxNumber=arr[0];

// //         for(int i=0;i<arr.length;i++){
// //             int count=0;
        
// //         for(int j=0;j < arr.length;j++){
// //             if(arr[i]==arr[j]){
// //                 count++;
// //             }
// //         }
// //         if(count>maxCount){
// //             maxCount=count;
// //             maxNumber=arr[i];
// //         }
// //     }
// //     System.out.println("max count: "+maxNumber);
// //     System.out.println("max occurence number: "+maxCount);
// // }
// // }




// public class maxCount{
//     public static void main(String args[]){
//           int[] arr = {4, 5, 4, 6, 4, 5, 6, 6, 6};
//         int maxCount=0;
//         int maxNumber=arr[0];

//         for(int i=0;i<arr.length;i++){
//             int count=0;
        
//         for(int j=0;j < arr.length;j++){
//             if(arr[i]==arr[j]){
//                 count++;
//             }
//         }
//         if(count>maxCount){
//             maxCount=count;
//             maxNumber=arr[i];
//         }
//     }
//     System.out.println("max count: "+maxNumber);
//     System.out.println("max occurence number: "+maxCount);
// }
// }



// public class maxCount{
//     public static void main(String args[]){
//           int[] arr = {4, 5, 4, 6, 4, 5, 6, 6, 6};
//         int maxCount=0;
//         int maxNumber=arr[0];

//         for(int i=0;i<arr.length;i++){
//             int count=0;
        
//         for(int j=0;j < arr.length;j++){
//             if(arr[i]==arr[j]){
//                 count++;
//             }
//         }
//         if(count>maxCount){
//             maxCount=count;
//             maxNumber=arr[i];
//         }
//     }
//     System.out.println("max count: "+maxNumber);
//     System.out.println("max occurence number: "+maxCount);
// }
// }




public class maxCount{
    public static void main(String args[]){
          int[] arr = {4, 5, 4, 6, 4, 5, 6, 6, 6};
        int maxCount=0;
        int maxNumber=arr[0];

        for(int i=0;i<arr.length;i++){
            int count=0;
        
        for(int j=0;j < arr.length;j++){
            if(arr[i]==arr[j]){
                count++;
            }
        }
        if(count>maxCount){
            maxCount=count;
            maxNumber=arr[i];
        }
    }
    System.out.println("max count: "+maxNumber);
    System.out.println("max occurence number: "+maxCount);
}
}