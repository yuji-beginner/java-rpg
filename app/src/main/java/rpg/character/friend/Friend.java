package rpg.character.friend;

import rpg.character.Character;
import rpg.character.enemy.Enemy;

public abstract class Friend extends Character {
    
    public Friend(String name, int power, int hp, int Lv){
        super(name, power, hp, Lv);
    }

    public void attack(Enemy target){
        System.out.println(this.name + " の " + this.getMove() + "！"); 
        System.out.println(this.name + " は " + target.getName() + " に " + this.power + " ダメージを与えた！");
        target.damaged(this.power);

    }
    public abstract String getSkill();
    public abstract void useSkill();

}
