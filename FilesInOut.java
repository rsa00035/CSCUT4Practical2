import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.lang.Number;

/**
 *
 * CSCU9T4 Java strings and files exercise.
 *
 */
public class FilesInOut {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner console = new Scanner(System.in);
		System.out.print("Input file: ");
		String inputFileName = console.next();
		System.out.print("Output file: ");
		String outputFileName = console.next();

		File inputFile = new File(inputFileName);
		Scanner in = new Scanner(inputFile);
		PrintWriter out = new PrintWriter(outputFileName);

//Scanner std = new Scanner(new File("input.txt"));

//System.out.print("Output file: ");
		StringTokenizer st;
//Scanner scanner = null;
		String line = in.nextLine();

		st = new StringTokenizer(line);

		while (st.hasMoreTokens()) {
			String Word1 = st.nextToken();
			String Word2 = st.nextToken();
			String Word3 = st.nextToken();

			String W11 = Word1.substring(0, 1);
			String W12 = W11.toUpperCase();
			String W13 = Word1.substring(1);
			String W14 = Word1.substring(1);
			String W1 = W12 + W14;

			String W21 = Word2.substring(0, 1);
			String W22 = W21.toUpperCase();
			String W23 = Word1.substring(1);
			String W24 = Word2.substring(1);
			String W2 = W22 + W24;

			String W31 = Word2.substring(0, 2);
			String W32 = W2.substring(2, 4);
			String W33 = W2.substring(4);
			String W3 = W31 + "/" + W32 + "/" + W33;

			out.printf("%8s%-10%s\n", W1, W2, W3);
			out.println("\n");
		}

		in.close();
		out.close();

// System.out.println("You need to add your own code to do anything");

	} // main

} // FilesInOut
