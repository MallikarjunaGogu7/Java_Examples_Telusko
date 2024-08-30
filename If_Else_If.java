public class If_Else_If {
    public static void main(String[] args) {
        
        // int x = 20;  ==>for one value

        // if(x>10 && x<=20)  // 11-20
        //     System.out.println("Hello");
        // else
        //     System.out.println("Bye");
        
        // ==> what if two values?

        // int x =5;
        // int y =7;

        // if(x<y)
        // { // If we have multiple statements we have to declare culrly braces
        //    System.out.println(x);
        //    System.out.println("Thank you");
        // }
        // else
        // System.out.println(y);

        // what if we have three values?
        int x = 8;
        int y = 7;
        int z = 9;

        if(x>y && x>z) //false
            System.out.println(x+"is greatest");
        else if(y>x && y>z) //false   here we can use else if(y>z) because x is already said to be small in first condition
            System.out.println(y+"is greatest");
        else
            System.out.println(z+"is greatest");

    }
}
