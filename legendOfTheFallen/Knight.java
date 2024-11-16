import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Knight extends Actor
{
    private double gravity = Settings.gravity;
    private GifImage knightGif =  Settings.knightGif;
    private int isFacingRight = 1;
    
    private long dashCD = Settings.dashCD;
    private int dashDist = Settings.dashDist;
    private int jumps = 1;
    private double knightBottomY;
    private double knightTopY;
    private double hp = Settings.knightMaxHp;
    private HpBar knightHpBar = new HpBar();
    
    private SimpleTimer dashTimer = new SimpleTimer();
    private SimpleTimer atkTimer = new SimpleTimer();
    private SimpleTimer healTimer = new SimpleTimer();
    
    private boolean isAlive = true;
    
    public void act()
    {
        knightBottomY = getY() + Settings.knightHeight / 2;
        knightTopY = getY() - Settings.knightHeight / 2;
        if (isAlive){
            if (isMoving()){
                setImage(knightGif.getCurrentImage());
            }
            else{
                setImage(Settings.knightFrame1);
            }
            drawHp();
            createAtk();
            move();
            applyGravity();
            checkCollisions();
            drinkPotion();
            checkDed();
        }
        System.out.println(getWorld().getObjects(HpBar.class));
    }

    public void applyGravity(){
        if (knightBottomY < 400) {
            int roundGravity = (int) gravity;
            setLocation(getX(), getY() + roundGravity);
            gravity += Settings.ySpeed;
            
        }
    }
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
    
    public boolean isMoving(){
        if (Greenfoot.isKeyDown("D") || (Greenfoot.isKeyDown("right")) || Greenfoot.isKeyDown("A") || (Greenfoot.isKeyDown("left"))){
            return true;
        }
        return false;
    }
    
    public void dash(){
        if (Greenfoot.isKeyDown("shift") && Greenfoot.isKeyDown("D") && dashTimer.millisElapsed() >= dashCD){
            move(dashDist);
            dashTimer.mark();
        }
        
        if (Greenfoot.isKeyDown("shift") && Greenfoot.isKeyDown("A") && dashTimer.millisElapsed() >= dashCD){
            move(-dashDist);
            dashTimer.mark();
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
        if (isFacingRight == 1){
            for (GreenfootImage image : knightGif.getImages()){
                image.mirrorHorizontally();
            }
        }
        isFacingRight = -1;
    }
    
    public void faceRight(){
        if (isFacingRight == -1){
            for (GreenfootImage image : knightGif.getImages()){
                image.mirrorHorizontally();
            }
        }
        isFacingRight = 1;
    }
    
    public void createAtk(){
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if ((Greenfoot.mouseClicked(null) || Greenfoot.isKeyDown("J")) && atkTimer.millisElapsed() >= Settings.baseAtkCd){
            Attack attack = new Attack();
            getWorld().addObject(attack, getX() + (50 * isFacingRight), getY());
            atkTimer.mark();
        }
    }
    
    public void atkToKnight(double atk){
        hp -= atk;
    }
    
    public void checkDed(){
        if (hp <= 0){
            setImage(new GreenfootImage("Game Over", 200, Color.RED, new Color(0,0,0,0 )));
            setLocation(Settings.worldWidth/2, Settings.worldHeight/2);
            
            getWorld().removeObject(knightHpBar);
        }
    }
    
    public void drawHp(){
        getWorld().addObject(knightHpBar, 0, 0);
        knightHpBar.setSize(hp);
        knightHpBar.setPosX(getX());
        knightHpBar.setPosY(knightTopY);
    }
    
    public void drinkPotion(){
        if (Potion.amount > 0 && hp < Settings.knightMaxHp && healTimer.millisElapsed() >= Settings.healCd && Greenfoot.isKeyDown("F")){
            Potion.amount--;
            hp += Settings.healAmount;
            if (hp > Settings.knightMaxHp){
                hp = Settings.knightMaxHp;
            }
            healTimer.mark();
        }
        
    }
}
