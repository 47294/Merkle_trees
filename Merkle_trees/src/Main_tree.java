
public class Main_tree {
	
	class Node {
		private Node leftNode;
		private Node rightNode;
		private String hash;
		
		public Node(Node left, Node right, String hash) {
			this.leftNode = left;
			this.rightNode = right;
			this.hash = hash;
		}
		
		public Node getLeft() {
			return leftNode;
		}
		
		public void setLeft(Node left) {
			this.leftNode = left;
		}
		
		public Node getRight() {
			return rightNode;
		}
		public void setRight(Node right) {
			this.rightNode = right;
		}
		public String getHash() {
			return hash;
		}
		public void setHash(String hash) {
			this.hash = hash;
		}
	}
}
