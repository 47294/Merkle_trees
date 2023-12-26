import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class test_tree {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<String> dataBlockStrings = new ArrayList<String>();
		
		final File folder = new File("Merkle_trees//src//Example");
		dataBlockStrings = File_and_dir_handler.read_file(folder);
		Node root = Main_tree.generateTree(dataBlockStrings);
		Main_tree.printfinalhash(root);
		return;
	}

}
