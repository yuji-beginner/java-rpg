package rpg.character.friend;

public class Fighter extends Friend {

    private String moves;
    private String skills;

    public Fighter(String name, int Lv){
        super(name, 2+Lv, 19+Lv, Lv);
        this.moves = "打撃";
        this.skills = "全集中";
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
        System.out.println(this.name + " はスキル("+ this.skills +")を使った！");
        this.power += 1;
        System.out.println(this.name + "の攻撃力が 1 上がった！");

    }
    
}
