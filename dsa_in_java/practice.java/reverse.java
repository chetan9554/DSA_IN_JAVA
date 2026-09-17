import java.util.*;
public class reverse{
    public static void reverse(int arr[]){
        int last=arr.length-1; int start=0;
        while(start<last){
        int temp=arr[start];
        arr[start]=arr[last];
        arr[last]=temp;

        start++;
        last--;
        }
    }
    public static void main(String args[]){
        int arr[]={3,5,19,32,33};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    
}
}