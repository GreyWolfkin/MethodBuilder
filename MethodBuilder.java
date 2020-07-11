/*
 * Copyright Joshua Supelana-Mix 7/11/2020
 * This product is for private use only
 * This product may not be modified, redistributed, sold, or used for any commercial purpose
 * except by the copyright holder
 */

/*
 * MethodBuilder v1.0
 * Generates class declaration as raw console output based on
 * contents of txt file to be copy-and-pasted into an IDE or
 * editor.
 * Saves time over writing multiple getter/setter methods by hand.
 */

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MethodBuilder {

	// Change filePath to location for txt file on your machine
	private static String filePath = "C:\\[location]\\variables.txt";
	private static String className;

	public static void main(String[] args) {
		String fileText = fetchText(filePath);
		ArrayList<String[]> list = fetchList(fileText);

		System.out.println("public class " + className + " {");
		System.out.println();
		declareVariables(list);
		declareConstructor(list);
		accessMethods(list);
		System.out.println("}");
	}

	private static String fetchText(String path) {
		// Returns contents of txt file as a single String
		int ch;
		String fileText = "";
		File f = new File(path);
		try {
			FileReader fr = new FileReader(f);
			while ((ch=fr.read()) != -1) {
				fileText += (char)ch;
			}
			fr.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return fileText;
	}

	private static ArrayList<String[]> fetchList(String text) {
		// Returns an ArrayList of String arrays, where each String array
		// contains the type and name of a single variable.
		// These arrays are called "couple" throughout
		ArrayList<String[]> list = new ArrayList<String[]>();
		String[] arr = text.split("\n");
		for(String single:arr) {
			String[] couple = single.split(" ");
			couple[1] = couple[1].trim();

			// Turns first line of txt file into className for later use.
			if(couple[0].equals("CLASS")) {
				className = couple[1];
				continue;
			}
			list.add(couple);
		}
		return list;
	}

	private static void declareVariables(ArrayList<String[]> list) {
		// Declares all listed variables by type and name as private
		for(String[] couple:list) {
			System.out.println("private " + couple[0] + " " + couple[1] + ";");
		}
		System.out.println();
	}

	private static void declareConstructor(ArrayList<String[]> list) {
		// Declares constructor for class.
		// Assumes that all listed variables will be passed at construction.
		System.out.print("public " + className + "(");
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)[0] + " " + list.get(i)[1]);

			// Closes constructor and prints open curly-brace
			// after printing the final variable.
			if(i != list.size() - 1) {
				System.out.print(", ");
			} else {
				System.out.print(") {");
			}
		}
		System.out.println();
		for(String[] couple:list) {
			System.out.println("this." + couple[1] + " = " + couple[1] + ";");
		}
		System.out.println("}");
		System.out.println();
	}

	private static void accessMethods(ArrayList<String[]> list) {
		// Creates public getter and setter methods for all variables.
		for(String[] couple:list) {
			String upper = couple[1].toUpperCase().charAt(0) + couple[1].substring(1);
			System.out.println("public " + couple[0] + " get" + upper + "() {");
			System.out.println("return " + couple[1] + ";");
			System.out.println("}");
			System.out.println("public void set" + upper + "(" + couple[0] + " set) {");
			System.out.println(couple[1] + " = set;");
			System.out.println("}");
			System.out.println();
		}
	}

}

