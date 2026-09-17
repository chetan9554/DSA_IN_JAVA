import java.util.*;
public class findmaxormin{
    public static int largest(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        return largest;

    }
    public static int smallest(int arr[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(smallest>arr[i]){
                smallest=arr[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]){
        int arr[]={12,6,3,9,14};
        System.out.println(largest(arr));
        System.out.println(smallest(arr));
    }
    }
