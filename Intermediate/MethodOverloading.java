//Method overloading
// we can have same name of methods but make sure that we have different parameters or different types of parameters for each same method


class Calculator
{
    public int add(int n1, int n2, int n3)
    {
        return n1 + n2 +n3;
    }
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }
    public double add(double n1, int n2)
    {
        return n1 + n2;
    }
}

public class MethodOverloading
{
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int result = obj.add(3,4);
        System.out.println(result);
    }
}