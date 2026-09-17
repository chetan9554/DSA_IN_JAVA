import java.util.*;
public class factorial{
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1=fact(n-1);
        int fn=n*fact(n-1);
        return fn;
    }
        public static int calSum(int n){
            if(n==1){
                return 1;
            }
            int sm1=calSum(n-1);
            int sm=n+calSum(n-1);
            return sm;
        }
        public static int fabo(int n){
            if(n==0||n==1){
                return n;
            }
           int  f1=fabo(n-1);
           int  f2=fabo(n-2);
           int  fn=f1+f2;
            return fn;
        }
        public static int firstOccurence(int arr[],int key, int i){
            if(i==arr.length){
                return -1;
            }
            if(arr[i]==key){
                return i;
            }
            return firstOccurence(arr,key,i+1);
        }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={4,2,6,5,9,6,4,8};
        int key=6 ;
        System.out.println(firstOccurence(arr,key,0));
    }
}