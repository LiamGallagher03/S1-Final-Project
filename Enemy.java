package rockpapershowdown;

//liam

public class Enemy {
    private String name;
    private int hp, rock, paper, scissors;
public Enemy(String name, int hp, int rock, int paper, int scissors) {
    this.name = name;
    this.hp = hp;
    this.rock = rock;
    this.paper = paper;
    this.scissors = scissors;
}
    public int getHp() {
        return hp;
    }

    public int getRock() {
        return rock;
    }

    public int getPaper() {
        return paper;
    }

    public int getScissors() {
        return scissors;
    }

}
