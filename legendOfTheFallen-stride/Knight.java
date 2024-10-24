import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Knight extends Actor
{
    private double gravity = 2;
    private GifImage knightGif =  new  GifImage("knight_walking.gif");
    private long dashCD = 0;
    /**
     * Act - do whatever the Knight wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(knightGif.getCurrentImage());
        move();
        if (getY() < 275) {
            int roundGravity = (int) gravity;
            setLocation(getX(), getY() + roundGravity);
            gravity += 0.2;
            
        }
        
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
        if (Greenfoot.isKeyDown("space") && getY() >= 275){
            setLocation(getX(), getY() - 1);
            gravity = -7.0;
        }
        dash();
    }
    public void dash(){
        if (Greenfoot.isKeyDown("shift") && Greenfoot.isKeyDown("D") && dashCD -  System.currentTimeMillis()/1000 <= 0){
            move(70);
            dashCD = System.currentTimeMillis()/1000 + 1;
        }
    }
}
