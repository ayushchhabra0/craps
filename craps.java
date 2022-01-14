import java.util.Scanner;
public class craps {
    public static void main(String[] args) {
        getResponse1();
    }

    public static String getResponse1() {
        System.out.println("Do you want to play the game of Craps? (y/n): ");
        Scanner input = new Scanner(System.in);
        String response1 = input.next();
        if (response1 == "n") {
            System.out.println("Thank you. Have a nice day!");
        }
        input.close();
        return response1;
    }

    public static String getResponse2() {
        System.out.println("Do you know how to play Craps? (y/n): ");
        Scanner input = new Scanner(System.in);
        String response2 = input.next();
        input.close();
        return response2;
    }

}
