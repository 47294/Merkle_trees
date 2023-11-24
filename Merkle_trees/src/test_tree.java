import java.util.ArrayList;

public class test_tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> dataBlockStrings = new ArrayList<String>();
		dataBlockStrings.add("South");
		dataBlockStrings.add("East");
		dataBlockStrings.add("West");
		dataBlockStrings.add("North");
		//dataBlockStrings.add("South-East");
		Node root = Main_tree.generateTree(dataBlockStrings);
		Main_tree.printfinalhash(root);
	}

}
