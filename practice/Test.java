public class Example {
    
    public int squareOfNumber(int num) {
        
        if(num <1) {
            throw new ArithmeticException("Number is less than one");
        }
        return num *num;
    }
    
    public int divideNumbers(int a, int b) throws Exception{
        
        return a/b;
    }
    
    
    public static void main(String[] args) {
        Example ex = new Example();
        try {
               ex.squareOfNumber(-1);
        }catch(ArithmeticException ae ) {
            System.out.println(ae);
        }
         System.out.println("Line after exception");
         ex.divideNumbers(10,0);
        
     
    }
}