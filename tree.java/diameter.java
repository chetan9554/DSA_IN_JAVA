import java.util.*;
public class diameter{
    static class Node{
        int data;
        Node left;
        Node right;
         
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }

    //time complexity is O(n2);

    public static int diam(Node root){
        if(root==null){
            return 0;
        }
        int ld=diam(root.left);
        int rd=diam(root.right);
        int lh=height(root.left);
        int rh=height(root.right);
        int selfdia=lh+rh+1;
        return Math.max(selfdia,Math.max(ld,rd));
    }
    public static void main(String args[]){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4); 
        root.left.right=new Node(5);
        root.right.right=new Node(6);
        System.out.println(diam(root));
    }
}