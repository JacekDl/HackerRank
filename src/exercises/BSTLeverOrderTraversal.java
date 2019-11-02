package exercises;

import java.util.*;
import java.io.*;


class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class BSTLevelOrderTraversal{

static void levelOrder(Node root){
      //Write your code here
	ArrayDeque<Node> queue = new ArrayDeque<>();
	if(root != null) {
		queue.add(root);
	}
	while(!queue.isEmpty()) {
		Node current = queue.removeFirst();
		System.out.print(current.data + " ");
		if(current.left != null) queue.add(current.left);
		if(current.right != null) queue.add(current.right);
	}
}

	private static Node insert(Node root,int data){
        if(root == null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Node root = null;
            root = insert(root, 5);
            root = insert(root, 3);
            root = insert(root, 7);
            root = insert(root, 4);
            /*while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }*/
            levelOrder(root);
        }	
}