import java.util.*;
public class prifixSum{
public static void subArray(int arr[]){
int sum=0,cSum=0;
 int maxSum=Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++){
    sum+=arr[i];
       System.out.print(sum+" " );
}
         for(int i=0;i<arr.length;i++){
             for(int j=0;j<arr.length;j++){
             cSum=i==0?arr[j]:arr[j]-arr[i-1];
             if(cSum>maxSum)
                maxSum=cSum;
             
             
         }
    }
    System.out.println("maximum subarray sum is:"+maxSum);
}


public static void main(String args[]){
int arr[]={1,-2,6,-1,3};
subArray(arr);
}
}