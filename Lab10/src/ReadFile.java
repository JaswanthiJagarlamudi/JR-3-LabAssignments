import java.util.*;
import java.io.*;

public class ReadFile {
	public static void main(String args[]) throws IOException {
		int j = 1;
		char ch;
		Scanner scr = new Scanner(System.in);
		File file = new File("E:\\Read.txt");
		FileInputStream f = new FileInputStream(file);
		System.out.println("\nContents of the file are");
		int n = f.available();
		System.out.print(j + ": ");
		for (int i = 0; i < n; i++) {
			ch = (char) f.read();
			System.out.print(ch);
			if (ch == '\n') {
				System.out.print(++j + ": ");

			}

		}
		scr.close();
		f.close();
	}
}
