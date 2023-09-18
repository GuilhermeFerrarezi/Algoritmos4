package binary_tree;

public class Main {
	
	public static void main(String[] args){
		Tree arvore = new Tree(85);
		arvore.Insert(118);
		arvore.Insert(97);
		arvore.Insert(67);
		arvore.Insert(11);
		arvore.Insert(136);
		arvore.Insert(26);
		arvore.Insert(106);
		arvore.Insert(71);
		arvore.Print_in_order();
		System.out.println("");
		System.out.println("");
		arvore.Print_in_pre_order();
		System.out.println("");
		System.out.println("");
		arvore.Print_in_post_order();
	}
}
