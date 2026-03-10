public class TryCatchFin {
    public static void main(String[] args) {
        System.out.println("The program is starting from here");
        try{                          // try block is used to wrap the code which may throw an exception
            int a = 10;
            int b = 0;
            int c = a/b;
            System.out.println("The result is: "+ c);
        }
        catch(ArithmeticException ae){ //(Exception) when you don't know what exception is coming 
            System.out.println("Exception caught: "+ae);
        }
        finally{                      // finally block will always execute whether exception is there or not
            System.out.println("This is always excutable");
        }
        System.out.println("The program has ended");
    }
}
