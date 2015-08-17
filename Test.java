


public class Test{
	
	public Test() {
		// TODO Auto-generated constructor stub
	}


//public Test(int n)
//	{
	//	f(n);
	//}
  public static void main(String[] args) {
	  //System.out.println(args[MAX]);
    //Test.f(5);
	  System.out.print("The factorial of a number is: ");
    System.out.print(f(5));
    System.out.println(" ");
  }
  
  
  private static int f(int n){
    if(n <= 0) return 1;
    else return n * f(n-1);
  }



}
