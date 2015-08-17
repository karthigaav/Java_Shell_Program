import java.util.StringTokenizer;

//import java.io.*;
//import java.lang.reflect.InvocationTargetException;
//import java.lang.reflect.Method;
//import java.lang.Class;

public class Execute {
  /* Command::
         exec name word1 word2, ....   where name must the name of a java class and its paths
                                       and wordis are the arguments.
         Action:
         Executes the "main" of the name.class. Therefore this file must be the main file.
         Errors:
         The user enters:
         1. exec                 The class name is missing.
         2. exec name            But name.class does not exist.
         3. There are exceptions that you need to find them.
         When there is an error println a message and return (not exit).
    */
	  public Execute(String name){
		  try {
				
				f(name);
			} catch (Exception e) {
				e.printStackTrace();
			}
		  }

		  private void f(String command){
			  StringTokenizer tok = new StringTokenizer(command);
			    if (tok.hasMoreTokens()) {
			      Token token = new Token(tok.nextToken());
			      String s = "";
			      while (tok.hasMoreTokens())
			        s = s + " " + tok.nextToken();
			      if (!s.equals(""))
			        s = s.substring(1);
			      switch (token.kind) {
			      case Token.TEST:
			try{//  String[] arguments = new String[] {"123"};
		   //  Main.main(arguments);
			  String[] args = {};
			  Test.main(args);
			  break;
			} catch (Exception e) {
				// TODO: handle exception
			}
			break;
			      case Token.MAIN:
						try{//  String[] arguments = new String[] {"123"};
					   //  Main.main(arguments);
						  String[] args = {};
						  Main.main(args);
						  break;
						} catch (Exception e) {
							// TODO: handle exception
						}
						break;
			      default:
		              System.out.println("Wrong command.");
			
		  //   String[] arguments1 = new String[] {"123"};
		    //  Test.main(arguments1);
		   
				
}
}
		  }
}
/*public Execute(String name){
		try {
			
			f(name);
		} catch (Exception e) {
			e.printStackTrace();
		}
  }

public void f(String command){
	
	StringTokenizer tok = new StringTokenizer(command);
    if (tok.hasMoreTokens()) {
      Token token = new Token(tok.nextToken());
      String s = "";
      while (tok.hasMoreTokens())
        s = s + " " + tok.nextToken();
      if (!s.equals(""))
        s = s.substring(1);
      switch (token.kind) {
      case Token.ATTRIB:
    	  try{
    		  //creating an object for an Attrib class
    		Attrib program = new Attrib(s);
    		//returns the runtime class of the Attrib class
             Class c = program.getClass();
             //creating a instance for the object class
             Object o = c.newInstance();
          // Get the method named Attrib of type String.
             Class[] args1 = new Class[1];
             args1[0] = String.class;
            //returns a Method object that reflects the specified declared method of the class
  		    Method m =c.getDeclaredMethod("Attrib", args1);
  		    m.setAccessible(true);  
  		    //invoking the class method
  		    m.invoke(o, s );
  	  	}
	    		catch(NoSuchMethodException e){
		  	    	//do nothing
		  	    }
		  	  	catch(InstantiationException e){
		  	  		//do nothing
		  	  	}
		  	  catch(IllegalAccessException e){
		  	  		//do nothing
		  	  	}
		  	  catch(InvocationTargetException e){
		  	  		//do nothing
		  	  }
        break;
      case Token.COPY:
    	  try{
      		Copy program = new Copy(s);
               Class c = program.getClass();
               Object o = c.newInstance();
               Class[] args1 = new Class[1];
               args1[0] = String.class;
    		    Method m =c.getDeclaredMethod("Copy", args1);
    		    m.setAccessible(true);  
    		    m.invoke(o, s );
    	  	}
  	    		catch(NoSuchMethodException e){
  		  	    	//do nothing
  		  	    }
  		  	  	catch(InstantiationException e){
  		  	  		//do nothing
  		  	  	}
  		  	  catch(IllegalAccessException e){
  		  	  		//do nothing
  		  	  	}
  		  	  catch(InvocationTargetException e){
  		  	  		//do nothing
  		  	  }
        break;
      case Token.DATE:
    	  try{
    		    Class c;
    		    c = Class.forName("MyDate");  
    		    Object o= c.newInstance();  
    		    Method m =c.getDeclaredMethod("MyDate", null);
    		    m.setAccessible(true);  
    		    m.invoke(o, null);
    	  	}
  	    		catch(ClassNotFoundException e){
		  	    	//do nothing
		  	    }
		  	    catch(NoSuchMethodException e){
		  	    	//do nothing
		  	    }
		  	  	catch(InstantiationException e){
		  	  		//do nothing
		  	  	}
		  	  catch(IllegalAccessException e){
		  	  		//do nothing
		  	  	}
		  	  catch(InvocationTargetException e){
		  	  		//do nothing
		  	  }
        break;
      case Token.DELETE:
    	  try{
        		Delete program = new Delete(s);
                 Class c = program.getClass();
                 Object o = c.newInstance();
                 Class[] args1 = new Class[1];
                 args1[0] = String.class;
      		    Method m =c.getDeclaredMethod("Delete", args1);
      		    m.setAccessible(true);  
      		    m.invoke(o, s );
      	  	}
    	    		catch(NoSuchMethodException e){
    		  	    	//do nothing
    		  	    }
    		  	  	catch(InstantiationException e){
    		  	  		//do nothing
    		  	  	}
    		  	  catch(IllegalAccessException e){
    		  	  		//do nothing
    		  	  	}
    		  	  catch(InvocationTargetException e){
    		  	  		//do nothing
    		  	  }
        break;
      case Token.DIR:
    	  try{
      		Dir program = new Dir(s);
               Class c = program.getClass();
               Object o = c.newInstance();
               Class[] args1 = new Class[1];
               args1[0] = String.class;
    		    Method m =c.getDeclaredMethod("Dir", args1);
    		    m.setAccessible(true);  
    		    m.invoke(o, s );
    	  	}
  	    		catch(NoSuchMethodException e){
  		  	    	//do nothing
  		  	    }
  		  	  	catch(InstantiationException e){
  		  	  		//do nothing
  		  	  	}
  		  	  catch(IllegalAccessException e){
  		  	  		//do nothing
  		  	  	}
  		  	  catch(InvocationTargetException e){
  		  	  		//do nothing
  		  	  }
        break;
      case Token.EDIT:
    	  try{
  		    Class c;
  		    c = Class.forName("Notepad");  
  		    Object o= c.newInstance();  
  		    Method m =c.getDeclaredMethod("Notepad", null);
  		    m.setAccessible(true);  
  		    m.invoke(o, null);
  	  	}
	    		catch(ClassNotFoundException e){
		  	    	//do nothing
		  	    }
		  	    catch(NoSuchMethodException e){
		  	    	//do nothing
		  	    }
		  	  	catch(InstantiationException e){
		  	  		//do nothing
		  	  	}
		  	  catch(IllegalAccessException e){
		  	  		//do nothing
		  	  	}
		  	  catch(InvocationTargetException e){
		  	  		//do nothing
		  	  }
        break;
      case Token.EXIT:
        System.exit(1);
      case Token.MKDIR:
    	  try{
        		Mkdir program = new Mkdir(s);
                 Class c = program.getClass();
                 Object o = c.newInstance();
                 Class[] args1 = new Class[1];
                 args1[0] = String.class;
      		    Method m =c.getDeclaredMethod("Mkdir", args1);
      		    m.setAccessible(true);  
      		    m.invoke(o, s );
      	  	}
    	    		catch(NoSuchMethodException e){
    		  	    	//do nothing
    		  	    }
    		  	  	catch(InstantiationException e){
    		  	  		//do nothing
    		  	  	}
    		  	  catch(IllegalAccessException e){
    		  	  		//do nothing
    		  	  	}
    		  	  catch(InvocationTargetException e){
    		  	  		//do nothing
    		  	  }
        break;
      case Token.RENAME:
    	  try{
      		Rename program = new Rename(s);
               Class c = program.getClass();
               Object o = c.newInstance();
               Class[] args1 = new Class[1];
               args1[0] = String.class;
    		    Method m =c.getDeclaredMethod("Rename", args1);
    		    m.setAccessible(true);  
    		    m.invoke(o, s );
    	  	}
  	    		catch(NoSuchMethodException e){
  		  	    	//do nothing
  		  	    }
  		  	  	catch(InstantiationException e){
  		  	  		//do nothing
  		  	  	}
  		  	  catch(IllegalAccessException e){
  		  	  		//do nothing
  		  	  	}
  		  	  catch(InvocationTargetException e){
  		  	  		//do nothing
  		  	  }
        break;
      case Token.RMDIR:
    	  try{
        		Rmdir program = new Rmdir(s);
                 Class c = program.getClass();
                 Object o = c.newInstance();
                 Class[] args1 = new Class[1];
                 args1[0] = String.class;
      		    Method m =c.getDeclaredMethod("Rmdir", args1);
      		    m.setAccessible(true);  
      		    m.invoke(o, s );
      	  	}
    	    		catch(NoSuchMethodException e){
    		  	    	//do nothing
    		  	    }
    		  	  	catch(InstantiationException e){
    		  	  		//do nothing
    		  	  	}
    		  	  catch(IllegalAccessException e){
    		  	  		//do nothing
    		  	  	}
    		  	  catch(InvocationTargetException e){
    		  	  		//do nothing
    		  	  }
        break;
      case Token.TIME:
    	  try{
    		    Class c;
    		    c = Class.forName("MyTime");  
    		    Object o= c.newInstance();  
    		    Method m =c.getDeclaredMethod("MyTime", null);
    		    m.setAccessible(true);  
    		    m.invoke(o, null);
    	  	}
  	    		catch(ClassNotFoundException e){
  		  	    	//do nothing
  		  	    }
  		  	    catch(NoSuchMethodException e){
  		  	    	//do nothing
  		  	    }
  		  	  	catch(InstantiationException e){
  		  	  		//do nothing
  		  	  	}
  		  	  catch(IllegalAccessException e){
  		  	  		//do nothing
  		  	  	}
  		  	  catch(InvocationTargetException e){
  		  	  		//do nothing
  		  	  }
        break;
      default:
        System.out.println("The given class does not exist");
    }
  }
    else {System.out.println("Class Name is missing");}
}*/


