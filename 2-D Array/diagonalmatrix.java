import java.util.*;
public class diagonalmatrix{
    public static void print(int arr[],int key){
        int sum;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length-1;j++){
            sum=arr[i]+arr[j];
            if(sum==key)
         
        System.out.print("["+i+","+j+"]");
}
    }
    }
public static void main(String args[]){
   int arr[]={2,7,11,15};
   int key;
   Scanner sc=new Scanner(System.in);
   System.out.print("enter the value of key");
   key=sc.nextInt();
   print(arr,key);
}
}
