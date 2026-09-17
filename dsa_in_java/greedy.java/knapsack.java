import java.util.*;
public class knapsack{
    public static void main(String args[]){
    int value[]={60,100,120};
    int weight[]={10,20,30};
    int w=50;
    double ratio[][]=new double[value.length][0];
    for(int i=0;i<value.length-1;i++){
        ratio[i][0]=1;
        ratio[i][1]=value[i]/(double)weight[i];
    }
    Arrays.sort(ratio,(a,b)->Double.compare(a[1],b[1]));

      int capacity=w;

    int  finalvalue=0;
    for(int i=value.length-1;i>=0;i--){
        int idx=(int)ratio[i][0];

    }
}
}