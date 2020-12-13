package rockpapershowdown;
//Liam

import java.util.Scanner;

public class RockPaperShowdown {
private double difficulty;

 private Player player;
 private Enemy enemy1;
 private Enemy enemy2;
 private Enemy enemy3;
 private Enemy enemy4;
 private Enemy enemy5;
 
 public RockPaperShowdown() {
     this.player = new Player(100);
     this.enemy1 = new Enemy("Dummy", 50, 1, 1, 1, 2, 2, 2, 3, 3, 3);
     this.enemy2 = new Enemy("Kiryu Kazuma", 75, 1, 1, 1, 1, 1, 2, 2, 3, 3);
     this.enemy3 = new Enemy("Jav A. Script", 60, 1, 1, 2, 2, 2, 2, 2, 3, 3);
     this.enemy4 = new Enemy("James Gosling", 80, 1, 1, 2, 2, 3, 3, 3, 3, 3);
     this.enemy5 = new Enemy("Mr. Word", 100, 1, 1, 1, 2, 2, 2, 3, 3, 3);
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
        int cabinetMan = (int) (Math.random() * 5);
        int dija = 0;
        int playerAttack, enemyAttack;
        int multi = 1;
        Scanner kboard = new Scanner(System.in);
        
        Enemy baddie;
        
        if (cabinetMan == 0) {
            baddie = enemy1;
            System.out.println("Vs. "+baddie.getName());
            System.out.println("Hint: "+baddie.getName()+" is not inclined to pick a specific attack. Good luck!");
        }
        else if (cabinetMan == 1) {
            baddie = enemy2;
            System.out.println("Vs. "+baddie.getName());
            System.out.println("Hint: "+baddie.getName()+" usually picks rock. Good luck!");
        }
        else if (cabinetMan == 2) {
            baddie = enemy3;
            System.out.println("Vs. "+baddie.getName());
            System.out.println("Hint: "+baddie.getName()+" usually picks paper. Good luck!");
        }
        else if (cabinetMan == 3) {
        baddie = enemy4;
        System.out.println("Vs. "+baddie.getName());
        System.out.println("Hint: "+baddie.getName()+" usually picks scissors. Good luck!");
    }
        else {
            baddie = enemy5;
            System.out.println("Vs. "+baddie.getName());
            System.out.println("Hint: "+baddie.getName()+" is not inclined to pick a specific attack. Good luck!");
        }
        
        int[] index = new int[10];
        index = new int[] {baddie.var1, baddie.var2, baddie.var3, baddie.var4, baddie.var5, baddie.var6, baddie.var7, baddie.var8, baddie.var9, 3};
        
        while ((player.getHp() > 0) && (baddie.getHp() > 0)) {
            if (dija == 0) {
                dija = 1;
                System.out.println("\nRock, Paper, Or Scissors?");
                System.out.println(" 1. Rock\n 2. Paper\n 3. Scissors");
                playerAttack = kboard.nextInt();
                enemyAttack = index[(int) (Math.random() * 9)];
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
                        player.setHp(player.getHp() - (medAttack() * multi));
                        System.out.println("You lost health!\nYour total health is now "+player.getHp()+"!");
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
                        baddie.setHp(baddie.getHp() - (medAttack() * multi));
                        System.out.println(baddie.getName()+" lost health!\nThe enemy's total health is now "+baddie.getHp()+"!");
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
                        baddie.setHp(baddie.getHp() - (medAttack() * multi));
                        System.out.println(baddie.getName()+" lost health!\nThe enemy's total health is now "+baddie.getHp()+"!");
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
        if (baddie.getHp() <= 0) {
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