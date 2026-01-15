package rpg.character.friend;

public class Magician extends Friend {

    private String moves;
    private String skills;

    public Magician(String name, int Lv){
        super(name, 3+Lv, 9+Lv, Lv);
        this.moves = "ゾルトラーク";
        this.skills = "回復の呪文";
    }

    @Override
    public String getMove(){
        return this.moves;
    }
    @Override
    public String getSkill(){
        return this.skills;
    }
    @Override
    public void useSkill(){
        
    }
    
}
