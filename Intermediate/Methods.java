
class Computer
{
    public void playMusic()  // here type void used because we are returning nothing
    {
        System.out.println("Music Playing..");
    }

    public String getMeAPen(int cost)  // here type String is used because we are returning a String type value
    {
        if(cost>=10)
            return "Pen";  //returning String Pen
        return "Nothing";
        
    }
}

public class Methods {
    public static void main(String[] args) {
        
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMeAPen(10);
        System.out.println(str);
    }
}
