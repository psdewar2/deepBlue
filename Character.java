import java.awt.*;

//Speedy the Tortoise
//Flipper the Dolphin
//Cuddles the Shark? <-- haha

public class Character {

    private int x;
    private int y;
    private int r;
    
    private int dx;
    private int dy;
    private int health;
    private int speed;
    //private int lives;
    //private int score;
    //private int eat;
    
    private boolean up;
    private boolean down;
    private boolean left;
    private boolean right;
    
    public Player() {
        
        x = GamePanel.HEIGHT / 2;
        y = GamePanel.WIDTH / 2;
        r = 10;
        
        dx = 0;
        dy = 0;
        health = 100;
        speed = 10;
        
        //lives, score, eat?
        
    }
    
    public void update() {
        if(left) {
        }
    }
            
