package rockpapershowdown;
//Liam

import java.util.Scanner;

public class RockPaperShowdown {
private int attack;
private double difficulty;


 
 private Player player;
 private Enemy enemy1;
 
 public RockPaperShowdown() {
     this.player = new Player();
     this.enemy1 = new Enemy("Dummy", 50);
 }
 
   
    public static void main(String[] args) {
        
    int answerInt;
    Scanner kboard = new Scanner(System.in);
    RockPaperShowdown rps = new RockPaperShowdown();
   
    
    
    
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
        int dija = 0;
        int playerAttack = 0;
        int enemyAttack = 0;
        int multi = 1;
        Scanner kboard = new Scanner(System.in);
        int[] index = new int[4];
        index = new int[] {1, 2, 3, 3};
        while ((player.getHp() >= 0) && (enemy1.getHp() >= 0)) {
            if (dija == 0) {
                dija = 1;
                System.out.println("\nRock, Paper, Or Scissors?");
                System.out.println(" 1. Rock\n 2. Paper\n 3. Scissors");
                playerAttack = kboard.nextInt();
                enemyAttack = index[(int) (Math.random() * 3)];
                if (enemyAttack == 1) {
                    System.out.println("The enemy picked rock!");
                    if (playerAttack == 1) {
                        multi++;
                        System.out.println("Next attack is multiplied by "+(multi)+"x!!!");
                    }
                    else if (playerAttack == 2) {
                        
                    }
                }
            
            
        }
    }
    
    
   public int randomizer() {
       return (int) ((Math.random() * 3) + 1);
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
