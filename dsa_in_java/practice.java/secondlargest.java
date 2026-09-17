import java.util.*;
public class secondlargest{
    public static int largest(int arr[]){
        //find first largest element of the array;
        int flargest= arr[0];
        for(int i=0;i<arr.length;i++){
            if(flargest<arr[i]){
                flargest=arr[i];
            }
        }
        
       //find second largest element of the array;
       int slargest=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
        if(arr[i]!=flargest && arr[i]>slargest){
            slargest=arr[i];
        }
       }
       return slargest;
    }
    public static void main(String args[]){
        int arr[]={22,12,34,9,5,3,43};
        System.out.println(largest(arr));
    }
}