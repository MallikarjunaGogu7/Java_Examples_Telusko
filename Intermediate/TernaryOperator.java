public class TernaryOperator {
    public static void main(String[] args) {
        int n = 3;
        int result; // we are assaigning value to the result

        // if(n%2==0)
        //     result = 10;
        // else
        //     result = 20;

        // ?:
        result = n%2==0 ? 10 :n%2==1 ? 11 : 20;
        
        System.out.println(result);

    }
}
