

import java.io.*; 

public class Dir {
  /* Command::
       dir name           where name must be null or the name of a directory and its paths.
       Action:
       List the file and directory names in this directory.
       Note that if the user enters "dir" it is OK and it means the current
       directory. In this case as you know a period (e,g .) means the current
       directory
       Errors:
       The user enters:
       1. dir name             The directory name does not exist.
       2. dir name             But the name does is not a directory name.
       When there is an error println a message and return (not exit).
  */

  public Dir(String name){
	f(name); //Calling the function f passing the input path and file
  }

  private static void f(String name){
	//creating a new object for the file class
		File file = new File(name);
		
		//Checking whether the file exists	 
		 if(file.exists()) {
			 
		    // listOfFiles array is created to store all the files and folders in the specified path
			File[] listOfFiles = file.listFiles(); 
				 
			    // Looping is done for printing the array
		        for(int i=0;i<listOfFiles.length;i++) {
		        	// Print by listing all the files and folders of the given path
			        System.out.println(listOfFiles[i].getName());
			    }
		    
		            //Checking whether the file not exists
				    if(!file.exists()) {
				    	// throwing error if the directory does not exist
						 System.out.println("The directory name does not exist");
					}			 
		}
  }
}
				 
