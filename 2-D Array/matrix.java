import java.util.*;
public class matrix{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int row,column;
        int arr[][]=new int[3][3];
        System.out.print("enter the size of row and column");
        row=sc.nextInt();
        column=sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                
            }
        }
    }
}

