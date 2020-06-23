public class Calculator {
	
	static double power_int(int num1,int num2)
	{
		  return Math.pow(num1,num2);
	}
	static double power_double(double num1,int num2)
	{
		 return Math.pow(num1,num2);
	}
    public static void main(String[] args) {
    	Calculator c=new Calculator();
        double result1 = Math.pow(10,3);
        double result2 = Math.pow(3,6);
        System.out.println(result1);
        System.out.println(result2);
    }
}	
	
