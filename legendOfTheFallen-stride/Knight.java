import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Knight extends Actor
{
    private double gravity = Settings.gravity;
    private double ySpeed = Settings.ySpeed;
    private GifImage knightGif =  Settings.knightGif;
    
    private long dashCD = 0;
    private int jumps = 1;
    private double knightBottomY;
    /**
     * Act - do whatever the Knight wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        knightBottomY = getY() + Settings.knightHeight / 2;
        setImage(knightGif.getCurrentImage());
        
        move();
        if (knightBottomY < 400) {
            int roundGravity = (int) gravity;
            setLocation(getX(), getY() + roundGravity);
            gravity += ySpeed;
            
        }
        checkCollisions();
    }

    /**
     * Controls the pig using awsd or arrow keys
     * left and right respectively turn the pig left and right
     * up and down respectively moves the pig towards the direction that he is pointing or the opposite direction
     */
    public void move()
    {
        if (Greenfoot.isKeyDown("A") || (Greenfoot.isKeyDown("left"))) {
            move(-5);
        }
        
        if (Greenfoot.isKeyDown("D") || (Greenfoot.isKeyDown("right"))) {
            move(5);
        }
    
        if (Greenfoot.isKeyDown("space") && jumps == 1){
            setLocation(getX(), getY() - 5);
            gravity = -7.0;
            jumps = 0;
        }
        dash();
    }
    
    public void dash(){
        if (Greenfoot.isKeyDown("shift") && Greenfoot.isKeyDown("D") && dashCD -  System.currentTimeMillis()/1000 <= 0){
            move(70);
            dashCD = System.currentTimeMillis()/1000 + 1;
        }
    }
    
    public void checkCollisions(){
        
        if (isTouchingGround() || CollidePlatform()){
            jumps = 1;
        }
    }
    
    public boolean CollidePlatform (){
        if (isTouching(StonePlatform.class)){
            gravity = 0;
            return true;
        }
        return false;
    }
    
    public boolean isTouchingGround(){
        if (knightBottomY >= 400){
            return true;
        }
        return false;
    }
}
