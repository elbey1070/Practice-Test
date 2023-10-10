package Ssg06;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws AgeFailure {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = scan.nextInt();

        if (age<15){
            throw new AgeFailure("Age 15 can't register");
        }
    }
}
