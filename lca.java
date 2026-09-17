import java.util.*;
public class lca{
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
    public static Node lcaa(Node root,int n1,int n2){
        if(root==null|| root.data==n1|| root.data==n2){
            return root;
        }
        Node leftlca=lcaa(root.left,n1,n2);
        Node rightlca=lcaa(root.right,n1,n2);

        if(leftlca==null){
            return rightlca;
        }
        if(rightlca==null){
            return leftlca;
        }
        return root;
    }
    public static void main(String args[]){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.print(lcaa(root,4,5).data);
    }
}