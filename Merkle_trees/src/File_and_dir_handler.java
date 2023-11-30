import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;


public class File_and_dir_handler {
	public static ArrayList<String> read_file(final File folder){
		ArrayList<String> dataBlocks = new ArrayList<String>(); 
		for (final File fileEntry : folder.listFiles()) {
			if (fileEntry.isDirectory()) {
				read_file(fileEntry);
			} else {
				dataBlocks.add(get_data(Path.of(folder.getPath()+"\\"+fileEntry.getName())));
			}
		}
		return dataBlocks;
	}
	private static String get_data(Path file) {
		String data = null;
		try (InputStream inputStream = Files.newInputStream(file);
				BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, "UTF8"))){
			while ((data = reader.readLine()) != null) {
				return data;
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.err.print(e);
		}
		return "0";
	}
}
