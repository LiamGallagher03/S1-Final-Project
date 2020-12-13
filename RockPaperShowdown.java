package rockpapershowdown;
//Liam

import java.util.Scanner;

public class RockPaperShowdown {
private int attack;
private double difficulty;


 
 private Player player;
 private Enemy enemy1;
 
 public RockPaperShowdown() {
     this.player = new Player(100);
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
        while ((player.getHp() > 0) && (enemy1.getHp() > 0)) {
            if (dija == 0) {
                dija = 1;
                System.out.println("\nRock, Paper, Or Scissors?");
                System.out.println(" 1. Rock\n 2. Paper\n 3. Scissors");
                playerAttack = kboard.nextInt();
                enemyAttack = index[(int) (Math.random() * 3)];
                if (enemyAttack == 1) {
                    System.out.println("\nThe enemy picked rock!");
                    if (playerAttack == 1) {
                        multi = multi + 1;
                        System.out.println("Next attack is multiplied by "+(multi)+"x!!!");
                        dija = 0;
                    }
                    else if (playerAttack == 2) {
                        player.setHp(player.getHp() - (medAttack() * multi));
                        System.out.println("You lost health!\nYour total health is now "+player.getHp()+"!");
                        multi = 1;
                        dija = 0;
                    }
                    else if (playerAttack == 3) {
                        enemy1.setHp(enemy1.getHp() - (medAttack() * multi));
                        System.out.println(enemy1.getName()+" lost health!\nThe enemy's total health is now "+enemy1.getHp()+"!");
                        multi = 1;
                        dija = 0;
                    }
                    else {
                        System.out.println("Invalid syntax.");
                        dija = 0;
                    }
                }
                else if (enemyAttack == 2) {
                    System.out.println("\nThe enemy picked paper!");
                    if (playerAttack == 1) {
                        player.setHp(player.getHp() - (medAttack() * multi));
                        System.out.println("You lost health!\nYour total health is now "+player.getHp()+"!");
                        multi = 1;
                        dija = 0;
                    }
                    else if (playerAttack == 2) {
                       multi = multi + 1;
                        System.out.println("Next attack is multiplied by "+(multi)+"x!!!");
                        dija = 0;
                    }
                    else if (playerAttack == 3) {
                        enemy1.setHp(enemy1.getHp() - (medAttack() * multi));
                        System.out.println(enemy1.getName()+" lost health!\nThe enemy's total health is now "+enemy1.getHp()+"!");
                      multi = 1;
                        dija = 0;
                    }
                    else {
                        System.out.println("Invalid syntax.");
                        dija = 0;
                    }
                }
                else {
                    System.out.println("\nThe enemy picked scissors!");
                    if (playerAttack == 1) {
                        enemy1.setHp(enemy1.getHp() - (medAttack() * multi));
                        System.out.println(enemy1.getName()+" lost health!\nThe enemy's total health is now "+enemy1.getHp()+"!");
                       multi = 1;
                        dija = 0;
                    }
                    else if (playerAttack == 2) {
                        player.setHp(player.getHp() - (medAttack() * multi));
                        System.out.println("You lost health!\nYour total health is now "+player.getHp()+"!");
                        multi = 1;
                        dija = 0;
                    }
                    else if (playerAttack == 3) {
                        multi = multi + 1;
                        System.out.println("Next attack is multiplied by "+(multi)+"x!!!");
                        dija = 0;
                    }
                    else {
                        System.out.println("Invalid syntax.");
                        dija = 0;
                    }
                }
            
            
        }
    }
        if (enemy1.getHp() <= 0) {
            System.out.println("\nYou Win!");
        }
        else if (player.getHp() <= 0) {
            System.out.println("\nYou Lose!");
        }
  }

public int medAttack() {
    return (int) ((Math.random()*5 + 10) * difficulty);
    }
}
