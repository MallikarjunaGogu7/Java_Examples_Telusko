class Mobile
{
    String brand;
    int price;
    static String name;

    public void show()
    {
        System.out.println(brand + " : " + price + " : "+name);
    }
    
}

public class StaticVariable
{
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1700;
        Mobile.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "nokia";
        obj2.price = 900;
        Mobile.name = "SmartPhone";

        //Mobile.name = "Phone"; to change the name value

        obj1.show();
        obj2.show();
    }
}