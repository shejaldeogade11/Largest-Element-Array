package Array;
import java.util.Arrays;

public class Arraylarg {

 public static void main(String[] args) {
    int arr[]={12,45,7,798,2};
    //brute force approach  sort technic  used O(nlogn) time complexity
   //  Arrays.sort(arr);
   //  System.out.println(arr[arr.length-1]);

   //Optimal solution O(n) complexity
   int largest=arr[0];
   for(int i=1;i<arr.length;i++ ){
      if(arr[i] > largest) {
         largest = arr[i];
      }
   }
   System.out.println(largest);

 }
}

