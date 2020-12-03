package rockpapershowdown;
//Liam

import java.util.Scanner;

public class RockPaperShowdown {
private int attack, difficulty;
private int playerHp = 100;
private int multi = 1;
   
    public static void main(String[] args) {
    int answerInt;
    Scanner kboard = new Scanner(System.in);
    System.out.println("Would you like a tutorial? (answer with the number)");
    System.out.println("1. YES      2. NO");
    answerInt = kboard.nextInt();
    if (answerInt == 1) {
        System.out.println("In Rock Paper Showdown, you and your opponent chooses either rock, paper, or scissores.");
        System.out.println("Whoever loses takes a certain amount of damage. This damage varies depending on the opponent.");
        System.out.println("If you and your opponent chooses the same attack, the next hitting move will be multiplied.");
        System.out.println("Whoever reaches a health of zero (0) first loses.");
        difficulty();
    }
    else {
        difficulty();
    }
       }
    public static void difficulty() {
        System.out.println("What difficulty ");
    }
}
