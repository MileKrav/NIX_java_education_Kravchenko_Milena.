package nix.education.java;

import java.util.Scanner;

public class chatbot {
    public static void main(String[] args) {


        System.out.println("Hello! My name is SOJI.");
        System.out.println("I was created in 2021.");

        System.out.println("Please, remind me your name.");
        Scanner scanner = new Scanner(System.in);
        String myName = scanner.next();
        System.out.println("What a great name you have, "+ myName + "!");

        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        Scanner scanInt = new Scanner(System.in);
        int remainder3 = scanInt.nextInt();
        int remainder5 = scanInt.nextInt();
        int remainder7 = scanInt.nextInt();
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + age + " that's a good time to start programming!");

        System.out.println("Now I will prove to you that I can count to any number you want.");
         int number = scanInt.nextInt();
         for (int i = 0; i <= number; i++){
             System.out.println( i + "!");
         }

         System.out.println("Lets test you programming knowledge. ");
         System.out.println("Why do we use method? ");
         System.out.println("1. To repeat a statement multiple times.");
         System.out.println("2. To decompose a program into several small subroutinse.");
         System.out.println("3. To determine the execution time of a program. ");
         System.out.println("4. To interrupt the execution of a program.");
          int test = scanInt.nextInt();
          while (test != 2){
              System.out.println("Please, try again");
              test = scanInt.nextInt();
          }

        System.out.println("Great, you right!!!");
        System.out.println("Goodbye, Have a nice day!!!");
    }
}
