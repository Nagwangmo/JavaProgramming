package day08_IfStatements;

import javax.swing.*;

public class NameOfTheDay {/*
2. Create a class called NameOfTheDay, write a program that can display the name of the day

            number = 1 ~ 7
 */

    public static void main(String[] args) {
        int num = 7;

        if (num == 1) {
            System.out.println("Mon");
        }
        if (num == 2) {
            System.out.println("Tue");
        }
        if (num == 3) {
            System.out.println("Wed");
        }
        if (num == 4) {
            System.out.println("Thur");
        }
        if (num == 5) {
            System.out.println("Fri");
        }
        if (num == 6) {
            System.out.println("Sat");
        }
        if (num == 7) {
            System.out.println("Sun");
        }
    }
}
