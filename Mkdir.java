

import java.io.File;

public class Mkdir {


	  /* Command:
	           mkdir name
	           Action:
	           make a directory in the path of the name.
	           Errors:
	           The user enters:
	           1. dir                 The name is missing.
	           2. dir name            But name is already exist.

	           When there is an error println a message and return (not exit).
	  */

	  public Mkdir(String name){
	    f(name);
	  }

	  private static void f(String name){
		  	    
		    //Initializing the File to null
	     	File file = null;
	     	// Initially the boolean is false
			boolean bool = false;
				
					// returns path names of files and directory
					file = new File(name);
					
					//Checking whether file path name is blank
					if(name.length()==0){
					    
						// throwing error if the name is not entered
						System.out.println("could not create the directory because the path name is not entered");
					}
					
					   else  {
						   // The file class creates a directory with a given name and updates bool
					       bool = file.mkdir();
					       // when the file is created the bool is changed 
					       System.out.println("Directory created? " +bool);
					       
					       // checking whether the bool is false
					       if(bool == false) {
						     // throwing error if it is false i.e the directory already exist
						     System.out.println("could not create the directory because the directory name already exist");			
		  }
						
				}
					}
					
				}
				
	  


