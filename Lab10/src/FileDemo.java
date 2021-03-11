import java.io.*;
import java.util.Scanner;

class FileDemo {
	public static void main(String args[]) {
		//File f = new File("E:\\Read.txt");
		Scanner in = new Scanner(System.in);
		System.out.println("What is the filename,Specify Along with Location?");
		String input = in.nextLine();
		File f = new File(input);

		System.out.println("File exists: " + f.exists());
		System.out.println("File is readable: " + f.canRead());
		System.out.println("File is writable: " + f.canWrite());
		System.out.println("Is a directory: " + f.isDirectory());
		System.out.println("length of the file: " + f.length() + " bytes");

		try {
			char ch;
			StringBuffer buff = new StringBuffer("");
			FileInputStream fis = new FileInputStream(f);
			while (fis.available() != 0) {
				ch = (char) fis.read();
				buff.append(ch);
			}
			System.out.println("\nContents of the file are: ");
			System.out.println(buff);
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("Cannot find the specified file...");
		} catch (IOException i) {
			System.out.println("Cannot read file...");
		}
	}
}