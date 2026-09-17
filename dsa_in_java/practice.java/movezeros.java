//move all zeros to the end of the arrays;
import java.util.*;
public class movezeros{
    public static void move(int arr[],int si,int ei){
        if(si>ei){
            return;
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
         move(arr,si+1,ei);
    
}
    public static void main(String args[]){
        int arr[]={3,0,4,0,0,8};
        move(arr,0,arr.length-1);
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }   
    }
}
