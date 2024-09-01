public class WhileLoop {
    public static void main(String[] args) 
    {
        int i = 1; // initializing

        while(i<4) // condition for iterate
        {
            System.out.println("Hi "+ i);
            // => nested while loop
            // int j = 1;
            // while(j<=3)
            // {
            //     System.out.println("Hello");
            //     j++;
            // }
            i++;  // Increment
        }

        System.out.println("Bye "+i);
    }
}