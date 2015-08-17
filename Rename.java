public class Rename {
  /* Command:
             rename nameA nameB
             Action:
             Renames the file nameA to the file nameB.
             Use your classes Copy and Delete for this.
             Errors:
             The user enters:
             1. rename              The names nameA and nameB are missing.
             When there is an error println a message and return (not exit).
    */


  public Rename(String name) {
    f(name);
  }

  private  String[] f(String name) {
	  
	  //copy class is called to copy the contents to the new name file
	  Copy.f(name);
	  System.out.println(name);
	  
	  // now Split the paths to delete the old name file
	  String[] names = name.split(" ");
	  
	  //Deleting the old name
	  Delete.f(names[0]);
	   
	  // Prints the renamed file path
	  System.out.println("The Renamed file is: " + names[1]);
	  return null; 
}
}
