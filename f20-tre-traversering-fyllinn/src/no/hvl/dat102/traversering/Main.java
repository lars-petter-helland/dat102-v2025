package no.hvl.dat102.traversering;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		 * Lager et lite eksempeltre:
		 * 
		 *       4 			Høyde        = 3
		 *      / \     	Antall noder = 7
		 *     2   6    	Preorder     = 4 2 1 3 6 5 7
		 *    / | | \		Inorder      = 1 2 3 4 5 6 7
		 *   1  3 5  7		Postorder    = 1 3 2 5 7 6 4
		 */
		
		BinaerNode<Integer> blad1 = new BinaerNode<>(1);
		BinaerNode<Integer> blad3 = new BinaerNode<>(3);
		BinaerNode<Integer> blad5 = new BinaerNode<>(5);
		BinaerNode<Integer> blad7 = new BinaerNode<>(7);
		
		BinaerNode<Integer> intern2 = new BinaerNode<>(2, blad1, blad3);
		BinaerNode<Integer> intern6 = new BinaerNode<>(6, blad5, blad7);
		
		BinaerNode<Integer> rot = new BinaerNode<>(4, intern2, intern6);

		System.out.print("Høyde        = " + hoyde(rot));
		System.out.print("\nAntall noder = " + antallNoder(rot));
		
		System.out.print("\nPreorder     = ");
		skrivUtPreorder(rot);	
		
		System.out.print("\nInorder      = ");
		skrivUtInorder(rot);
		
		System.out.print("\nPostorder    = ");
		skrivUtPostorder(rot);
	}
	
	static void skrivUtPreorder(BinaerNode<Integer> tre) {
		// TODO
	}
	
	static void skrivUtInorder(BinaerNode<Integer> tre) {
		// TODO
	}
	
	static void skrivUtPostorder(BinaerNode<Integer> tre) {
		// TODO
	}

	static int hoyde(BinaerNode<Integer> tre) {
		// TODO
		return 0;
	}
	
	static int antallNoder(BinaerNode<Integer> tre) {
		// TODO
		return 0;
	}
}
