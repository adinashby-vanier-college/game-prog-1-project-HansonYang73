import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Enemy extends Actor
{
    protected double gravity;
    static int isFacingRight;
    protected double hp;
    protected double maxHp;
    protected HpBar enemyHpBar;
    protected double enemyBottomY;
    protected double enemyTopY;
    protected int speed;
    protected double atk;
    protected int coinAmt;
    
    protected SimpleTimer stunTimer;
    protected boolean isStun;
    
    protected String walkingGif;
    protected String attackGif;
    protected GifImage gif;
    
    protected boolean isAttacking = false;
    protected boolean isMoving = false;
    protected int walking = 1;
    
    protected SimpleTimer atkTimer;
    
    protected GreenfootSound attackSound;
    
    public Enemy(double enemyHp, double enemyMaxHp, int enemySpeed, 
    double enemyAtk, int enemyCoinAmt, String enemyGif, String attackGif,
    GreenfootSound attackSound){
        gravity = Settings.gravity;
        isFacingRight = -1;
        hp = enemyHp;
        maxHp = enemyMaxHp;
        enemyHpBar = new HpBar();
        speed = enemySpeed;
        atk = enemyAtk;
        coinAmt = enemyCoinAmt;
        
        stunTimer = new SimpleTimer();
        isStun = false;
        
        walkingGif = enemyGif;
        this.attackGif = attackGif;
        gif = new GifImage(enemyGif);
        
        this.attackSound = attackSound;
    }
    
    public void act(){
        drawHp();
        gravity(enemyBottomY);
        
        if (stunTimer.millisElapsed() >= Settings.stunTime){
            unstun();
        }
        
        if (isMoving || isAttacking){
            setImage(gif.getCurrentImage());
        }
        else{
            setImage(gif.getImages().get(0));
        }
        
        if (atkTimer.millisElapsed() >= 800  && walking == 0){
            changeWalkGif();
            walking = 1;
            isAttacking = false;
        }
        
        checkDed();
    }
    
    public void moveToKnight(){
        Knight knight = getWorld().getObjects(Knight.class).get(0);
        double distFromKnight = Math.abs(knight.getX() - getX());
        
        if (distFromKnight <= Settings.aggroDist){ 
            if (knight.getX() > getX() && knight.getX() - getX() > Settings.atkDist){
                isMoving = true;
                move(speed);
                faceRight();
            }
            else if (knight.getX() < getX() && getX() - knight.getX() > Settings.atkDist){
                setImage(gif.getCurrentImage());
                isMoving = true;
                move(-speed);
                faceLeft();
            }
            else{
                isMoving = false;
            }
        } else{
                isMoving = false;
            }
        
        
    }
    
    public boolean isAtkDist(){
        Knight knight = getWorld().getObjects(Knight.class).get(0);
        double distFromKnight = Math.abs(knight.getX() - getX());
        
        if (distFromKnight <= Settings.atkDist && knight.getY() > 300){
            return true;
        }
        return false;
    }
    
    public void createAtk(){
        //Creates a parry first and if the knight didnt parry the attack, it will spawn the actual attack
        if (atkTimer.millisElapsed() >= Settings.baseEnemyAtkCD ){
            attackSound.play();
            Parry attack = new Parry(this);
            getWorld().addObject(attack, getX() + (40 * isFacingRight), getY());
            atkTimer.mark();   
            changeAttackGif();
            isAttacking = true;
        }
    }
    
    public void gravity(double bottomY){
        if (bottomY < 400) {
            int roundGravity = (int) gravity;
            setLocation(getX(), getY() + roundGravity);
            gravity += Settings.ySpeed;
            
        }
    }
    
    public void faceLeft(){
        if (isFacingRight == 1){
            for (GreenfootImage image : gif.getImages()){
                image.mirrorHorizontally();
            }
        }
        isFacingRight = -1;
    }
    
    public void faceRight(){
        if (isFacingRight == -1){
            for (GreenfootImage image : gif.getImages()){
                image.mirrorHorizontally();
            }
        }
        isFacingRight = 1;
    }
    
    public void atkToEnemy(double atk){
        this.hp -= atk;
    }
    
    public void checkDed(){
        if (hp <= 0){
            Settings.coins += this.coinAmt;
            
            Actor dizzy = getOneIntersectingObject(Dizzy.class);
            for (Actor parry: getWorld().getObjects(Parry.class)){
                getWorld().removeObject(parry);
            }
            if (dizzy != null){
                getWorld().removeObject(dizzy);
            }
            getWorld().removeObject(enemyHpBar);
            getWorld().removeObject(this);
        }
    }
    
    public void drawHp(){
        getWorld().addObject(enemyHpBar, 0, 0);
        enemyHpBar.setSize(hp);
        enemyHpBar.setMaxSize(maxHp);
        enemyHpBar.setPosX(getX());
        enemyHpBar.setPosY(enemyTopY - 10);
    }
    
    public void stun(){
        stunTimer.mark();
        isStun = true;
        getWorld().addObject(new Dizzy(), getX(), (int) enemyTopY + 10);
    }
    
    public void unstun(){
        if (stunTimer.millisElapsed() >= Settings.stunTime){
            isStun = false;
            getWorld().removeObject(getOneIntersectingObject(Dizzy.class));
        }
    }
    
    public void changeWalkGif(){
        int faceBefore = isFacingRight;
        isFacingRight = -1;
        gif = new GifImage(walkingGif);
        if (faceBefore == 1){
            faceRight();
        }
    }
    
    public void changeAttackGif(){
        int faceBefore = isFacingRight;
        isFacingRight = -1;
        gif = new GifImage(attackGif);
        if (faceBefore == 1){
            faceRight();
        }
        walking = 0;
    }
}
