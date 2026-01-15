package rpg;

import java.util.InputMismatchException;
import java.util.Scanner;

//import java.util.ArrayList;
//import java.util.List;

//import rpg.character.enemy.Enemy;
import rpg.character.enemy.Slime;
import rpg.character.friend.Fighter;
//import rpg.character.friend.Magician;
//import rpg.character.friend.Friend;

public class GameManager {

    //private List<Friend> friends = new ArrayList<Friend>();
    //private List<Enemy> enemies = new ArrayList<Enemy>();
    
    Scanner scanner = new Scanner(System.in);
    
    public void game(){
        Slime slime = new Slime("スライム", 5);
        System.out.println(slime.getName() + "(Lv:"+ slime.getLv() + ") が現れた！");
        Fighter fighter = new Fighter("戦士", 1);
        //Magician magician = new Magician("魔法使い", 1);

        while (true) {

            int option;
            
            System.out.println(
                fighter.getName() + " のターン : 行動を選択してください。"
            );
            System.out.println(1 + ". たたかう) " + fighter.getMove());
            System.out.println(2 + ". スキル) " + fighter.getSkill());

            while (true) {
            System.out.print(" > ");
            try {
                int inputNumber = this.scanner.nextInt();
                // 範囲外ならもう一度
                if (inputNumber != 1 && inputNumber != 2) {
                    System.out.println("エラー : 範囲内の値を入力してください。");
                    continue;
                }
                option = inputNumber;
                break;
            } catch (InputMismatchException e) {
                // int 以外が入力された際の処理
                System.out.println("エラー : 整数を入力してください。");
                scanner.next();
            }
        }
            if (option == 1) {
                fighter.attack(slime);
                if (slime.isDead()) {
                    System.out.println("ゲームクリア！おめでとう！");
                    break;
                }

            } else {
                fighter.useSkill();
            }
            

        }

        

        
    }
}
