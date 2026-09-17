import java.util.Arrays;
public class selectionsort{
    public static void selection(int arr[]){
        int i,j;
        for(i=0;i<arr.length-1;i++){
            int minpos=i;
            for(j=i+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    }
        public static void print(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
        
        }
    }
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        Arrays.sort(arr);
        // selection(arr);
        print(arr);
    }
}