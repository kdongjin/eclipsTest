package chapter17_lab768;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipTest2 {
	public static void main(String[] args) throws IOException {
		String outputFile = "d:/test.zip";
		int level = 9;
		FileOutputStream fout = new FileOutputStream(outputFile);
		ZipOutputStream zout = new ZipOutputStream(fout);
		zout.setLevel(level);

		ZipEntry entry = new ZipEntry("RootController.java");
		FileInputStream fin = new FileInputStream("d:/RootController.java");
		zout.putNextEntry(entry);
		for (int c = fin.read(); c != -1; c = fin.read()) {
			zout.write(c);
		}
		
		entry = new ZipEntry("ManagementController.java");
		fin = new FileInputStream("d:/ManagementController.java");
		zout.putNextEntry(entry);
		for (int c = fin.read(); c != -1; c = fin.read()) {
			zout.write(c);
		}
		
		
		fin.close();
		zout.close();
		System.out.println("잘 마무리 되었습니다");
	}
}