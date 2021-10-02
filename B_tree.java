package lecture_50_TREE;

import java.util.Scanner;

public class B_tree {
//STEP-1 Create Node class and the data members required
	private class Node {
		int data;
		Node left;
		Node right;
	}
	private Node root; //class b_tree data member
	public B_tree() {
		root=cons(null, false);
	}
	Scanner scn=new Scanner(System.in);
	private Node cons(Node parent,Boolean is_left) {
		if(parent==null) {
			System.out.println("Root node ka data");
		}
		else if(is_left) {
			System.out.println(parent.data+ " left ka data kya hai??" );
		}
		else {
			System.out.println(parent.data+ " right"
					+ " ka data kya hai?? ");
		}
		Node nn=new Node();
		
		nn.data=scn.nextInt();
		 
		System.out.println(nn.data+" Has left child??");
		boolean has_left=scn.nextBoolean();
		if(has_left) {
			
			nn.left=cons(nn, true);
		
			System.out.println("return value : "+nn.data);
			
		}
		
		System.out.println(nn.data+" Has right child??");
		boolean has_right=scn.nextBoolean();
		if(has_right) {
			nn.right=cons(nn,false);
		}
		return nn;
		
	}
}
