package section3;

import java.util.Scanner;

public class Proj3_2_DivisibleByThree {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        int input;
        System.out.println("please enter your integer");
        input=keyboard.nextInt();

        if(input%3==0)
        {
            System.out.println(input+" is divisible by 3");
        }
        else
        {
            System.out.println(input+" is not divisible by 3");
        }
    }
}
