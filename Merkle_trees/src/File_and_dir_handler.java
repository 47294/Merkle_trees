import java.io.File;

public class File_and_dir_handler {
	public static void read_file(final File folder){
		for (final File fileEntry : folder.listFiles()) {
			if (fileEntry.isDirectory()) {
				System.out.println("Ab");
				read_file(fileEntry);
			} else {
				System.out.print("ab");
				System.out.println(fileEntry.getName());
			}
		}
	}
}
