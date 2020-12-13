//Liam Gallagher

package rockpapershowdown;

public class Enemy {
    //fields
    
    private String name;
    private int hp;
    public int var1, var2, var3, var4, var5, var6, var7, var8, var9;
    
    //constructor
    
public Enemy(String name, int hp, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
    
    this.name = name;
    this.hp = hp;
    this.var1 = var1;
    this.var2 = var2;
    this.var3 = var3;
    this.var4 = var4;
    this.var5 = var5;
    this.var6 = var6;
    this.var7 = var7;
    this.var8 = var8;
    this.var9 = var9;
}
    //accessors
    public int getHp() {
        return hp;
    }
    
    public void setHp(int hp) {
        this.hp = hp;
    }
    
    public String getName() {
        return name;
    }
}
