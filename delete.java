

import java.io.*;


public class Delete {
  /* Command::
     delet name           where name must be the name of a file and its paths.
     Action:
     delets name
     Errors:
     The user enters:
     1. delet                The user did not type the file name.
     2. delet name           The file name does not exist in the path.
     3. delete name          But the file name does is a directory.
     When there is an error println a message and return (not exit).
*/
  public Delete(String name) {
    f(name); //Calling the function f passing the input path and file
  }

  static void f(String name) {
	  //creating a new object for the file class
	  File file = new File(name);
	  
	//if the file path name is blank
			if(name.length()==0){
				System.out.println("User does not type the file path name");
			}
			else {
				//Checking whether the file exists or not
	               if(file.exists()){      
	            	 //Checking whether the name is file or directory
			          if(file.isDirectory()) {
			        	//throwing error if the name is directory
			        	  System.out.println("could not delete because the file path or name is a directory");
					 }
					 else {
						 //function for deleting the given file name
			          	file.delete();
				            System.out.println("The file name is deleted");
				     }
				 }
	               else{
	       			//throwing error message if the file does not exists
	       			System.out.println("The file does not exist");
	       			}
				 }

  }

}
