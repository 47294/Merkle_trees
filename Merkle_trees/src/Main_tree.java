import java.util.ArrayList;

public class Main_tree {
	
	public static Node generateTree(ArrayList<String> dataBlocks) {
		ArrayList<Node> childNodes = new ArrayList<>();
		
		for (String message: dataBlocks) {
			childNodes.add(new Node(null, null, Hash_algorithm.generateHash(message)));
		}
		return buildTree(childNodes);
	}
	
	private static Node buildTree(ArrayList<Node> children) {
		ArrayList<Node> parentsArrayList = new ArrayList<>();
		
		while (children.size() != 1) {
			int index = 0, lenght = children.size();
			while (index < lenght) {
				Node leftChildNode = children.get(index);
				Node rightNodeChildNode = null;
			}
		}
	}

}
