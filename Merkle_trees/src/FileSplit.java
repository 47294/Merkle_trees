import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileSplit {
	public static void splitFile(File f) throws IOException {
		int partCounter = 1;
		
		int sizeOfFiles = 1024 * 1024;
		byte[] buffer = new byte[sizeOfFiles];
		
		String fileName = f.getName();
		try (FileInputStream fis = new FileInputStream(f);
			BufferedInputStream bis = new BufferedInputStream(fis)) {
				
				int bytesAmount = 0;
				while ((bytesAmount = bis.read(buffer)) > 0) {
					
					String filePartName = String.format("%s", "%03d", fileName, partCounter);
					File newFile = new File(f.getParent(), filePartName);
					try (FileOutputStream outputStream = new FileOutputStream(newFile)) {
						outputStream.write(buffer, 0, bytesAmount);
					}
				}
			
		} catch (IOException e) {
			throw new IOException("Error with open file");
		}
	}
}
