import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class test_tree {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<String> dataBlockStrings = new ArrayList<String>();
		dataBlockStrings.add("South");
		dataBlockStrings.add("East");
		dataBlockStrings.add("West");
		dataBlockStrings.add("North");
		//Node root = Main_tree.generateTree(dataBlockStrings);
		//Main_tree.printfinalhash(root);
		
		final File folder = new File("C:\\Users\\Артем\\Documents\\GitHub\\Merkle_trees\\Merkle_trees\\src\\Example");
		File_and_dir_handler.read_file(folder);
	}

}
