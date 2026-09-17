import java.util.*;
public class tiling{
    public static int tilingProblem(int n){
        if(n==0||n==1){
            return 1;
        }
        int fnm1=tilingProblem(n-1);
        int fnm2=tilingProblem(n-2);
        int totalWays=fnm1+fnm2;
        return totalWays;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=sc.nextInt();
        System.out.println(tilingProblem(n));
    }
}