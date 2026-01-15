package rpg.character;

public abstract class Character {
    protected String name;
    protected int power;
    protected int hp;
    protected int Lv;
    protected boolean isDead;


    public Character(String name, int power, int hp, int Lv){
        this.name = name; this.power = power; this.hp = hp; this.Lv = Lv;
        this.isDead = false;
    }

    public String getName(){
        return this.name;
    }

    public int getPower(){
        return this.power;
    }
    
    public int getHp(){
        return this.hp;
    }

    public int getLv(){
        return this.Lv;
    }

    public boolean isDead(){
        return this.isDead;
    }

    public abstract String getMove();

    public void damaged(int power){
        this.hp = Math.max(hp-power, 0);
        System.out.println(this.name + " の体力は残り " + this.hp + " です。");
        if (this.hp == 0) {
            System.out.println(this.name + "は倒れた！");
            this.isDead = true;
        }
    }

    public void healed(int power){
        this.hp += power;
    }


}
