
class Calculator
{
    // int a; // we can write variables in class

    public int add(int n1, int n2) // method name of add
    {
        int r = n1 + n2;
        return r;
    }

}


public class ClassAndObject
{
     public static void main(String[] args) {
        int num1 = 7; //values passing to the method
        int num2 = 10;

        Calculator Calc = new Calculator(); // object creating
        int result = Calc.add(num1, num2); //method calling with help of object
        System.out.println(result);
        // int result = num1 + num2;

        // System.out.println(result);
     }
}