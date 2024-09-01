public class EnhancedForLoop {
    public static void main(String[] args) {
        int nums[] = new int[3];
        nums[0] = 2;
        nums[1] = 3;
        nums[2] = 5;

        for(int num: nums)  // Enhanced for loop ..also known as forEach loop
        {
            System.out.println(num);
        }
    }
}
