

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Copy {
  /* Command::
   copy nameA nameB      where nameA and nameB must be the name of a files and their paths.
   Action:
   Copies file nameA to file nameB.
   Errors:
   The user enters:
   1. copy               Does not type the file names.
   2. copy name          Did not type a second file name.
   3. copy nameA nameB   but the file nameA does not exist.
   4. copy nameA nameB   but the file nameB alreadyexist.
   5. copy nameA nameB   but nameA is a directory.
   6. copy nameA nameB   but the file is a directory.
   When there is an error println a message and return (not exit).
*/

  public Copy(String name) {
    f(name);
  }

  static void f(String name) {
	  
	 
	  
	  try {     
		        // splitting the data type string to get to names
		        String[] names = name.split(" ");
		        
		        //creating a new object for the file class to get the first file name
			 	File f1 = new File(names[0]);
			 	// Prints the 
				//System.out.println(names[0]);
				
			 	//creating a new object for the file class to get the second file name
				File f2 = new File(names[1]);
				//System.out.println(names[1]);
				
				//class creates an InputStream that you can use to read bytes from a file
				InputStream in = new FileInputStream(f1);
				
				//class creates an OutputStream that you can use to write bytes to a file
				OutputStream out = new FileOutputStream(f2);
				
				// the array of bytes is created and read 1024 bytes at a time.
				byte [] buf = new byte[1024];
				
				// declaring the length of an array
				int len;
				
				// This loop continues to read the buf array of the txt file and stops when its equal to zero
				// len => length of the array gets how much bytes it get backs each time something is read from the file
				while ((len = in.read(buf)) > 0) {
					
					// if the value returned is zero then it is end of the file and 
					//it is written to the output file
					out.write(buf,0,len);	
				}
				
			    //Since it is done copying closing the inputStream
				in.close();
				
				// closing the outputStream
				out.close();
				
				// Prints that the file is successfully copied
				System.out.println("File Copied");
				
		// exception found		
	} catch (FileNotFoundException e) {
	
		// throwing error that the file does not exists
		System.out.println("The File does not exits");
		
		// If the input is empty then trying to catch the array Indexoutofboundexception
	} catch (ArrayIndexOutOfBoundsException e) {
		
		// throwing error if the input is empty
		System.out.println("The input NOT GIVEN");
		
		// If the user does not type the input then trying to catch IOException
	} catch (IOException e) {
		
		// throwing error when the user does not type the file name
		System.out.println("The user does not type the file name");
	}
  }
  
}
