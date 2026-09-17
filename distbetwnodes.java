import java.util.*;
public class distbetwnodes{
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
        public static Node lca(Node root,int n1,int n2){
            if(root==null|| root.data==n1||root.data==n2){
                return root;
            }
             Node leftlca=lca(root.left,n1,n2);
             Node rightlca=lca(root.right,n1,n2);

             if(leftlca==null){
                return rightlca;
             }
             if(rightlca==null){
                return leftlca;
             }
             return root;
        }
        public static int distbet(Node root,int n){
            if(root==null){
                return -1;
            }
            if(root.data==n){
                return 0;
            }
          int leftdist=distbet(root.left,n);
          int rightdist=distbet(root.right,n);
          if(leftdist==-1 && rightdist==-1){
            return -1;
          }
          else if(leftdist==-1){
            return rightdist+1;
          }
          else{
            return leftdist+1;
          }

        }
        public static int lcadist(Node root,int n1,int n2){
            Node lcaa=lca(root,n1,n2);
            int dist1=distbet(lcaa,n1);
            int dist2=distbet(lcaa,n2);
            return dist2+dist1;
        }

        // kth ancester between nodes;
        public static int kthancester(Node root, int n,int k){
            if(root==null){
                return -1;
            }
            if(root.data==n){
                return 0;
            }
            int leftdist=kthancester(root.left, n, k);
            int rightdist=kthancester(root.right, n, k);

            if(leftdist==-1 && rightdist==-1){
                return -1;
            }
            int max=Math.max(leftdist,rightdist);
            if(max+1==k){
                //System.out.println(root.data);
            }
            return max+1;
        }

        //transform to sum tree
        public static int treesum(Node root){
            if(root==null){
                return 0;
            }
            
            int leftsum=treesum(root.left);
            int rightsum=treesum(root.right);
            return leftsum+rightsum+root.data;
        }


        public static void main(String args[]){
            Node root=new Node(1);
            root.left=new Node(2);
            root.right=new Node(3);
            root.left.left=new Node(4);
            root.left.right=new Node(5);
            root.right.left=new Node(6);
            System.out.println(treesum(root));
        }
    }
