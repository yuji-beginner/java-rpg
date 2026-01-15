package rpg;


public class Main {
    public static void main(String[] args) {
        System.out.println("ゲームスタート！");
        
        GameManager gameManager = new GameManager();

        gameManager.game();
    }
}
