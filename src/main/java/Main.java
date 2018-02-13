/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("What is your name? ");

        Scanner input = new Scanner(System.in);
        String name = input.next().toLowerCase();

        if (name.equals("bob")){
            System.out.println("Hi Bob");
        }
        else if (name.equals("alice")) {
            System.out.println("Hi Alice");
        }
        else {
            System.out.println("I don't know you.");
        }

    }
}
