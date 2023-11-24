import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class Main_tree {
	
	public static Node generateTree(ArrayList<String> dataBlocks) {
		ArrayList<Node> childNodes = new ArrayList<>();
		
		for (String message: dataBlocks) {
			childNodes.add(new Node(null, null, Hash_algorithm.generateHash(message)));
		}
		return buildTree(childNodes);
	}
	
	private static Node buildTree(ArrayList<Node> children) {
		ArrayList<Node> parents = new ArrayList<>();
		// Переделать
		while (children.size() != 1) {
			int index = 0, lenght = children.size();
			while (index < lenght) {
				Node leftChild = children.get(index);
				Node rightChild = null;
				
				if ((index + 1) < lenght) {
					rightChild = children.get(index + 1);
				}
				else {
					rightChild = new Node(null, null, leftChild.getHash());
				}
				
				String parentHash = Hash_algorithm.generateHash(leftChild.getHash() + rightChild.getHash());
				parents.add(new Node(leftChild, rightChild, parentHash));
				index += 2;
			}
			children = parents;
			parents = new ArrayList<Node>();
		}
		return children.get(0);
	}
	public static void printfinalhash(Node root) {
		if (root == null) {
			return;
		}
		System.out.println("Public key = " + root.getHash());
		System.out.print("Private key = ");
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		queue.add(null);
		
		while (!queue.isEmpty()) {
			Node node = queue.poll();
			if (node != null && node.getLeft() == null && node.getRight() == null) {
				System.out.println(node.getHash());
			}
			else {
				if (!queue.isEmpty()) {
					queue.add(null);
				}
			}
			
			if (node != null && node.getLeft() != null) {
				queue.add(node.getLeft());
			}
			
			if (node != null && node.getRight() != null) {
				queue.add(node.getRight());
			}
		}
	}
	
}
