import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import jdk.jfr.internal.PrivateAccess;

public class FileSplit {
	public static void splitFile(File f) throws IOException {
		/*
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if (n<=2) {System.out.print("Неверно введено число"); return;} */
		int n = 4;
		int partCounter = (int) Math.round(Math.log(n)/Math.log(2));
		
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
