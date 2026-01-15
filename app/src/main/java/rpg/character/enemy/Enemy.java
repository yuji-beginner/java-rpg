package rpg.character.enemy;

import rpg.character.Character;
import rpg.character.friend.Friend;

public abstract class Enemy extends Character {

    public Enemy(String name, int power, int hp, int Lv){
        super(name, power, hp, Lv);
    }

    public void attack(Friend target){
        System.out.println(this.name + " の " + this.getMove() + "！"); 
        System.out.println(this.name + " は " + target.getName() + " に " + this.power + " ダメージを与えた！");
        target.damaged(this.power);

    }

}
