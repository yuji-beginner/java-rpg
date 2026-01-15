package rpg.character.enemy;

public class Slime extends Enemy {

    private String moves;
    
    public Slime(String name, int Lv){
        super(name, 1+Lv, 8+Lv*2, Lv);
        this.moves = "ネバネバ攻撃";
    }

    @Override
    public String getMove(){
        return this.moves;
    }

}
