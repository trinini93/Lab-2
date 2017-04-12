package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number between 1 - 100");
        // take scanner input from user

        int input = scan.nextInt();
        // will allow us to take user's int value

        if (input % 2 == 1) {
            System.out.println(input + " Odd");
        } else if (input % 2 == 0 && input < 25) {
            System.out.println("Even and less than 25");
        } else if (input % 2 == 0 && input >= 26 && input <= 60) {
            System.out.println("Even");
        } else if (input % 2 == 0 && input > 60) {
            System.out.println(input + " Even");
        }
        else if (input % 2 == 1 && input > 60) {
            System.out.println(input + " Odd");
        }
        else {
            System.out.println("Bye!");

        }
    }

            }








