package newpack;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LittleLotto {
    public static void main(String[] args) {
        int userNumber;
        String decision = "y";

        int[] userNumbers = new int[6];
        int[] computerNumbers = new int[6];

        System.out.println("Welcome in Little Lotto");
        System.out.println("You have to write 6 numbers from the range 1 - 99");

        while (decision.equals("y")) {
            for (int i = 0; i < computerNumbers.length; i++) {
                computerNumbers[i] = getRandomInt();
//                System.out.print(computerNumbers[i] + " ");
            }
            for (int i = 0; i < userNumbers.length; i++) {

                System.out.println("Please write " + (i + 1) + " number and press ENTER ...");
                userNumber = getInt();

                if (numberCheck(userNumber)) {
                    userNumbers[i] = userNumber;
                } else {
                    System.out.println("You should write number from the range 1 - 99.");
                    System.out.println("Please correct yourself.");
                    i--;
                }
            }

            System.out.print("Your numbers are:     ");
            for (int x : userNumbers) {
                System.out.print(x + " ");
            }
            System.out.println();
            System.out.print("Computer numbers are: ");
            for (int x : computerNumbers) {
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {}
                System.out.print(x + " ");
            }
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {}
            System.out.println();
            if (arrayCompare(userNumbers, computerNumbers)) {
                System.out.println("Great !!! You are the winner !!!");
                System.out.println("Try again y/n");
                decision = userDecision();
            } else {
                System.out.println("Unfortunately you failed, but don't worry. You can try again :)");
                System.out.println("Try again y/n");
                decision = userDecision();
            }
        }
    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }

    public static boolean numberCheck(int number) {
        return number >= 1 && number <= 99;
    }

    public static int getRandomInt() {
        return new Random().nextInt((99) + 1);
    }

    public static boolean arrayCompare(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    public static String userDecision() {
        return new Scanner(System.in).next();
    }
}

