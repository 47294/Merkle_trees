import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class File_and_dir_handler {
	public static void read_file(String path) throws IOException {
		try(Stream<Path> pathStream = Files.walk(Paths.get(path))) {
			pathStream.filter(Files::isRegularFile).forEach(System.out::println);
			System.out.println("Complete");
		}
		
	}
}
