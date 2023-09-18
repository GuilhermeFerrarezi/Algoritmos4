package binary_tree;

public class Node {

		int item;
		Node right;
		Node left;
		Node prev;
		boolean printed;
		
		public Node() {
			this.item = 0;
			this.right = null;
			this.left = null;
			this.prev = null;
			this.printed = false;
		}
		
		public Node(int item) {
			this.item = item;
			this.right = null;
			this.left = null;
			this.prev = null;
			this.printed = false;
		}
		
		public void Insert(int item) {
			if(item < this.item) {
				if(this.left != null) {
					this.left.Insert(item);					
				}else{
					this.left = new Node(item);
					this.left.prev = this;
				}
			}else {
				if(this.right != null) {
					this.right.Insert(item);
				}else {
					this.right = new Node(item);
					this.right.prev = this;
				}
			}
		}
		
		public void Print_in_order(Node trab) {
			if(trab.left != null){
				trab.Print_in_order(trab.left);
			}else {
				System.out.println(trab.item);
				trab.printed = true;
			}
			if(trab.printed == false){
				System.out.println(trab.item);
				trab.printed = true;
			}
			if(trab.right != null) {
				trab.Print_in_order(trab.right);
			}else {
				if(trab.printed == false) {
					System.out.println(trab.item);
					trab.printed = true;
				}
			}
			trab.printed = false;
		}
		
		public void Print_in_pre_order(Node trab) {
			if(trab.printed == false){
				System.out.println(trab.item);
				trab.printed = true;
			}
			if(trab.left != null){
				trab.Print_in_pre_order(trab.left);
			}else {
				if(trab.printed == false) {
					System.out.println(trab.item);
					trab.printed = true;					
				}
			}
			if(trab.right != null) {
				trab.Print_in_pre_order(trab.right);
			}else {
				if(trab.printed == false) {
					System.out.println(trab.item);
					trab.printed = true;
				}
			}
			trab.printed = false;
		}
		
		public void Print_in_post_order(Node trab){
			if(trab.left != null){
				trab.Print_in_post_order(trab.left);
			}else {
				if(trab.right != null) {
					trab.Print_in_post_order(trab.right);
				}
				if(trab.printed == false) {
					System.out.println(trab.item);
					trab.printed = true;					
				}
			}
			if(trab.right != null) {
				trab.Print_in_post_order(trab.right);
			}else {
				if(trab.printed == false) {
					System.out.println(trab.item);
					trab.printed = true;
				}
			}
			if(trab.printed == false){
				System.out.println(trab.item);
				trab.printed = true;
			}
		}
}
