package Ssg06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_exception {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age =0;

        try {
            age = scan.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Invalid data entered");
        }
        System.out.println(age);
    }
}