public class Main {
	public static void main(String[] args) {
		public t = new Tree(new int[] {1,2,-1,-1,3,-1,-1});
		Node root = t.getRoot();
		int heightofRoot = Tree.heightof(root);
		System.err.println( heightofRoot);
	}
}
class Node {
	int data;
	Node left;
	Node right;
	Node getRoot() {
		return root;

	}
	public static int heightof(Node root) {
		if(root == null)
			return 0;
		int lh = heightof(root.left);
		int rh = heightof(root.right);
		return Math.max(lh,rh)+1;
	}
}