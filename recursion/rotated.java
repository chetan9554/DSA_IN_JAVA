import java.util.*;
public class rotated{
    public static int  print(int arr[],int key,int si,int ei){
        int i=si;
        if(si>ei){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        else{
            return print(arr,key,si+1,ei);
        }
    }
    public static void main(String args[]){
        int arr[]={4,5,6,7,0,1,2};
        int index=print(arr,9,0,arr.length-1);
        System.out.println(index);
    }
}