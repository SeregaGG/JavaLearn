package main.java.org.example;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int[] b = {1, 2, 3};
        String asd = "asd";
        System.out.println(asd);
        asd = "dsa";
        System.out.println(asd);
        Main.test(1, 2, 3, 4, 5);
    }
    static public void test(int a, int b, int... nums){
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i < nums.length; i++){

            System.out.println(nums[i]);
        }
    }
}