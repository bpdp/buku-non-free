/* taken from: http://www.java-tips.org/java-se-tips/java.lang/creating-application-specific-exceptions.html
 *
 */

class ApplicationException extends Exception {

  private int intError;
      
  ApplicationException(int intErrNo){
    intError = intErrNo;
  }

  ApplicationException(String strMessage){
    super(strMessage);
  }

  public String toString(){
    return "ApplicationException["+intError+"]";
  }  
}

public class UserDefinedExceptionDemo {

  static void compute(int a) throws ApplicationException {

    System.out.println("called compute(" +a +" )");

    if (a>10) {
      throw new ApplicationException(a);
    }

    System.out.println("NORMAL EXIT");
  }

  public static void main(String[] args) {

    try {
      compute(1);
      compute(20);

    } catch(ApplicationException e){
      System.out.println("caught " + e);
    }
  }
}
