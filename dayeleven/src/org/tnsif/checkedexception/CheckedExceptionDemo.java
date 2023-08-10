package org.tnsif.checkedexception;
// prgm to demonstarte checked exception

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		try {
FileInputStream f = new FileInputStream("C:\\Users\\kitey\\OneDrive\\Desktop\\tnss");
		System.out.println("File Found");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Doesn't exists  "+e);
		}
		}

}
