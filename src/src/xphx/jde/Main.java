//Eclipse tells me to keep my class names uppercase due to "convention"
//Then when it generates package-info.java it keeps it lowercase
//CONTRADICTION

/**
 * @author XphX
 */

package xphx.jde;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

import javax.swing.*; //

public class Main {
	
	//I've got not a clue what javadocs are for. I'll probably find out.

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 2 Figure out swing!		
		System.out.println(" JDE ");
		System.out.println("XphnX");
		System.out.println("  ~  ");
		System.out.println("Read the readme, I'm not telling you a thing.");
		prompt();
	}
	
	private static void prompt() {
		Scanner read = new Scanner(System.in); //Scanners! I know! So retro, I am.
		String inp = null, letter = null;
		Scanner think = new Scanner(inp);	
		System.out.print(">");
		inp = read.next();
		while(think.hasNext())
			letter = think.next();
		if(letter == "{") {
			SecondaryPrompt(inp);
		}else if(letter == ";") {
			ParseInput(inp);
		}else if(letter == ")") {
			SecondayInformal(inp);
		}else{
			System.out.println("Invalid End Of Line");
			System.out.println("Be sure to end with a semicolon.");
		}
		read.close();
		think.close();
	}
	
	/**
	 * 
	 * @param inp
	 */
	private static void SecondayInformal(String inp) {
		// TODO 2 A one-line if or while statement.
		
	}
	
	/**
	 * 
	 * @param inp
	 */
	private static void ParseInput(String inp) {
		// TODO 1 Method to pass input to terminal with java command (or whatever the command is).
		/*
		 * How this shit works:
		 * Makes 1-liner java file, sends to terminal with javac bla.java or whatever.
		 * It'll pass to runtime methinks.
		 */
		File thing = new File("bla.java");
		BufferedWriter write = null;
		try {
			write = new BufferedWriter(new FileWriter(thing));
		}catch (FileNotFoundException e){
			// TODO 4 Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO 4 Auto-generated catch block
			e.printStackTrace();
		}
		//Now into the file inp goes
		try {
			write.write(inp);
		}catch (IOException e) {
			// TODO 4 Auto-generated catch block
			e.printStackTrace();
		}
		//Now the hard part
		thing.deleteOnExit(); //Life gets easier
		String path = thing.getPath(); //Easier and easier
		//The command is something like
		//"java" + path
		//or javac...i forget
		String command = "java" + path;
		//Whatever, now pass the command to Runtime, which
		//should have the JDK installed. (Unless they're morons.)
		
	}
	
	/**
	 * 
	 * @param inp
	 */
	private static void SecondaryPrompt(String inp) {
		// TODO 1 Brackets mean a big, juicy Class, or a more-than-1-line if statement. Usually.
		
	}

}
