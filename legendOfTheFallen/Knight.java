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
    private boolean isFacingRight = true;
    
    private long dashCD = Settings.dashCD;
    private int dashDist = Settings.dashDist;
    private int jumps = 1;
    private double knightBottomY;
    
    private SimpleTimer timer = new SimpleTimer();
    
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
            faceLeft();
        }
        
        if (Greenfoot.isKeyDown("D") || (Greenfoot.isKeyDown("right"))) {
            move(5);
            faceRight();
        }
        
        jumpDown();
        
        if (Greenfoot.isKeyDown("space") && jumps == 1){
            setLocation(getX(), getY() - 5);
            gravity = -7.0;
            jumps = 0;
        }
        dash();
    }
    
    public void dash(){
        if (Greenfoot.isKeyDown("shift") && Greenfoot.isKeyDown("D") && timer.millisElapsed() >= dashCD){
            move(dashDist);
            timer.mark();
        }
        
        if (Greenfoot.isKeyDown("shift") && Greenfoot.isKeyDown("A") && timer.millisElapsed() >= dashCD){
            move(-dashDist);
            timer.mark();
        }
    }
    
    public boolean jumpDown(){
        if (Greenfoot.isKeyDown("shift") && Greenfoot.isKeyDown("s")){
            return true;
        }
        return false;
    }
    
    public void checkCollisions(){
        
        if (isTouchingGround()){
            jumps = 1;
        }
        else if (collidePlatform() && !jumpDown()){
            StonePlatform platform = (StonePlatform) getOneIntersectingObject(StonePlatform.class);
            setLocation(getX(), (int) platform.getTopY() - Settings.knightHeight/2);
            gravity = 0;
            jumps = 1;
        }
        else{
            jumps = 0;
        }
    }
    
    public boolean collidePlatform(){
        StonePlatform platform = (StonePlatform) getOneIntersectingObject(StonePlatform.class);
        if (platform != null){
            if ((knightBottomY <= platform.getTopY()) && gravity >= 0){
                return true;
            }
        }
        return false;
    }
    
    public boolean isTouchingGround(){
        if (knightBottomY >= 400){
            return true;
        }
        return false;
    }
    
    public void faceLeft(){
        if (isFacingRight){
            for (GreenfootImage image : knightGif.getImages()){
                image.mirrorHorizontally();
            }
        }
        isFacingRight = false;
    }
    
    public void faceRight(){
        if (!isFacingRight){
            for (GreenfootImage image : knightGif.getImages()){
                image.mirrorHorizontally();
            }
        }
        isFacingRight = true;
    }
}
