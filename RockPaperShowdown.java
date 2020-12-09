package rockpapershowdown;
//Liam

import java.util.Scanner;

public class RockPaperShowdown {
private int attack;
private double difficulty;
private int playerHp = 100;
private int multi = 1;

enum Attack {
  R,
  P,
  S
}
   
    public static void main(String[] args) {
        
    int answerInt;
    Scanner kboard = new Scanner(System.in);
    RockPaperShowdown rps = new RockPaperShowdown();
    Attack rock = Attack.R;
    Attack paper = Attack.P;
    Attack scissors = Attack.S;
    
    
    System.out.println("Would you like a tutorial? (answer with the number)");
    System.out.println("1. YES      2. NO");
    answerInt = kboard.nextInt();
    if (answerInt == 1) {
        System.out.println("In Rock Paper Showdown, you and your opponent chooses either rock, paper, or scissores.");
        System.out.println("Whoever loses takes a certain amount of damage. This damage varies depending on the opponent.");
        System.out.println("If you and your opponent chooses the same attack, the next successful attack  will be multiplied.");
        System.out.println("This process will repeat until either you or your opponent reaches the health of zero.");
        rps.difficulty();
    }
    else rps.difficulty();
       }
    public void difficulty() {
        
        int answerInt;
        Scanner kboard = new Scanner(System.in);
        
        System.out.println();
        System.out.println("Which difficulty?\n 1. Easy \n 2. Normal \n 3. Hard");
        answerInt = kboard.nextInt();
        if (answerInt == 1) {
            difficulty = 0.75;
            fight();
        }
        else if (answerInt == 2) {
            difficulty = 1;
             fight();
        }
        else {difficulty = 1.25;
         fight();
        }
    }
   public void fight() {
       //while hp of player and enemy greater than 0 do dis
   }
   
   
   
   
public int highAttack() {
    return (int) ((Math.random()*5 + 30) * difficulty);
}
public int medAttack() {
    return (int) ((Math.random()*5 + 10) * difficulty);
}
public int lowAttack() {
    return (int) ((Math.random()*5) * difficulty);
}
}
