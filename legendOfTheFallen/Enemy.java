import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Enemy extends Actor
{
    protected double gravity;
    protected int isFacingRight;
    protected double hp;
    protected double maxHp;
    protected HpBar enemyHpBar;
    protected double enemyBottomY;
    protected double enemyTopY;
    protected int speed;
    protected double atk;
    
    protected SimpleTimer stunTimer;
    protected boolean isStun;
    
    public Enemy(double enemyHp, double enemyMaxHp, int enemySpeed, double enemyAtk){
        gravity = Settings.gravity;
        isFacingRight = -1;
        hp = enemyHp;
        maxHp = enemyMaxHp;
        enemyHpBar = new HpBar();
        speed = enemySpeed;
        atk = enemyAtk;
        
        stunTimer = new SimpleTimer();
        isStun = false;
    }
    
    public void moveToKnight(){
        Knight knight = getWorld().getObjects(Knight.class).get(0);
        double distFromKnight = Math.abs(knight.getX() - getX());
        
        if (distFromKnight <= Settings.aggroDist && !isTouching(Knight.class)){ 
            if (knight.getX() > getX()){
                move(speed);
                faceRight();
            }
            else if (knight.getX() < getX()){
                move(-speed);
                faceLeft();
            }
        }
    }
    
    public boolean isAtkDist(){
        Knight knight = getWorld().getObjects(Knight.class).get(0);
        double distFromKnight = Math.abs(knight.getX() - getX());
        
        if (distFromKnight <= Settings.atkDist){
            return true;
        }
        return false;
    }
    
    public void createAtk(SimpleTimer atkTimer){
        //Creates a parry first and if the knight didnt parry the attack, it will spawn the actual attack
        if (atkTimer.millisElapsed() >= Settings.baseEnemyAtkCD ){
            Parry attack = new Parry(this);
            getWorld().addObject(attack, getX() + (30 * isFacingRight), getY());
            atkTimer.mark();   
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
            getImage().mirrorHorizontally();
        }
        isFacingRight = -1;
    }
    
    public void faceRight(){
        if (isFacingRight == -1){
            getImage().mirrorHorizontally();
        }
        isFacingRight = 1;
    }
    
    public void atkToEnemy(double atk){
        this.hp -= atk;
    }
    
    public void checkDed(){
        if (hp <= 0){
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
}
