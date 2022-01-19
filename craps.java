/**
 * @author Ayush Chhabra
 * @version January 20, 2022
 */

import java.util.Scanner;

public class craps {
    public static void main(String[] args) {
        getResponse1();
        System.out.println("Good Luck!");   //good luck message
        rollDice();
        dieRoll();
        System.out.println("Thank you for playing Craps!"); //thank you message
        System.out.println("Hope to see you playing again!");
    }

    public static void getResponse1() {
        System.out.println("Do you know how to play Craps? (y/n): ");
        Scanner input = new Scanner(System.in);
        String response1 = input.next();
        if (response1.equals("n")) {
            System.out.println("1. Roll two six-sided dice.");
            System.out.println("2. On first roll, if you get a 7 or 11 you win!");
            System.out.println("3. On first roll, if you get a 2, 3, or 12 you lose!");
            System.out.println("4. Any other number you don't win or lose. The die roll becomes your 'point.'");
            System.out.println("5. Keep rolling the dice again until:");
            System.out.println("6. You roll the point again and win!");
            System.out.println("7. or you roll a 7 and lose.");
        }
    }

    public static void dieRoll() {
        Die dice = new Die();
        int valAdded = dice.rollDie();
        if (valAdded == 7 || valAdded == 11) {
            System.out.println("You win!");
        } 
        if (valAdded == 2 || valAdded == 3 || valAdded == 12) {
            System.out.println("You lose!");
        }
        else {
            System.out.println("That's your point.");
            rollDice();
            int roll3 = (int) (Math.random() * 6) + 1;
            int roll4 = (int) (Math.random() * 6) + 1;
            int valAdded2 = roll3 + roll4;
            System.out.println("You rolled: " + valAdded2);
            if (valAdded2 == 7) {
                System.out.println("You lose.");
            }
            while (valAdded2 != valAdded || valAdded2 == 7) {
                rollDice();
                int valAdded3 = dice.rollDie();
                if (valAdded3 == valAdded) {
                    break;
                }
            }
        }
    }

    public static void rollDice() {
        System.out.println("Press <Enter> to roll the dice...");
        Scanner in = new Scanner(System.in);
        in.nextLine(); 
    }
}