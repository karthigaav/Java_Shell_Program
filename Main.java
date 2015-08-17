Main.java
**************************************************************************************************
import java.io.*;
import java.util.StringTokenizer;
	
	class Main {
	    public static void main(String[] args) {
	      while(true){
	        System.out.print("PROMPT\\>");
	        String command = "";
	        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	        try {
	          command = stdin.readLine();
	        }
	        catch (Exception e) {
	          System.out.println(e);
	          return;
	        }
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
	              new Attrib(s);
	              break;
	            case Token.COPY:
	              new Copy(s);
	              break;
	            case Token.DATE:
	              new MyDate();
	              break;
	            case Token.DELETE:
	              new Delete(s);
	              break;
	            case Token.DIR:
	              new Dir(s);
	              break;
	            case Token.EDIT:
	              new Notepad();
	              break;
	            case Token.EXEC:
	              new Execute(s);
	              break;
	            case Token.EXIT:
	              System.exit(1);
	            case Token.MKDIR:
	              new Mkdir(s);
	              break;
	            case Token.RENAME:
	              new Rename(s);
	              break;
	            case Token.RMDIR:
	              new Rmdir(s);
	              break;
	            case Token.TIME:
	              new MyTime();
	              break;
	           // case Token.TEST:
				//new Test();
	            //	break;
	            default:
	              System.out.println("Wrong command.");
	          }
	        }
	      }
	    }
	}


