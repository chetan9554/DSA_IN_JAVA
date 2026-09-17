import java.util.*;
public class tree{
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
static class binaryTree{
    static int idx=-1;
    public static Node buildtree(int Nodes[]){
        idx++;
        if(Nodes[idx]==-1){
            return null;
        }
        Node newNode=new Node(Nodes[idx]);
        newNode.left=buildtree(Nodes);
        newNode.right=buildtree(Nodes);
        return newNode;
       
    }


    //time complexity O(n) ->in preorder
    public static void preorder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
       
    }


    //time complexity of inorder is O(n)
    public static void inorder(Node root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

   // time complexity in postorder O(n)

    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
        
    }

    //level order traversal time complexity O(n)

    public static void levelorder(Node root){
        if(root==null){
            return;
        }
        Queue<Node>s=new LinkedList<>();
        s.add(root);
        s.add(null);
        while(!s.isEmpty()){
            Node currnode=s.remove();
            if(currnode==null){
                System.out.println();
            
            if(s.isEmpty()){
                break;
            }
            else{
                s.add(null);
            }
        }
            else{
                System.out.print(currnode.data+" ");
            
            if(currnode.left!=null){
                s.add(currnode.left);
            }
            if(currnode.right!=null){
                s.add(currnode.right);
            }
        }

        }
    }
}
public static void main(String args[]){
    int Nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    binaryTree Tree=new binaryTree();
    Node root=Tree.buildtree(Nodes);
    // System.out.print(root.data);
    // Tree.preorder(root);
    // Tree.inorder(root);
    //Tree.postorder(root);
    Tree.levelorder(root);

}
}