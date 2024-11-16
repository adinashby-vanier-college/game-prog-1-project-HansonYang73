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
    protected HpBar enemyHpBar;
    protected double enemyBottomY;
    protected double enemyTopY;
    
    public Enemy(double enemyHp){
        gravity = Settings.gravity;
        isFacingRight = -1;
        hp = enemyHp;
        enemyHpBar = new HpBar();
    }
    
    public void moveToKnight(){
        Knight knight = getWorld().getObjects(Knight.class).get(0);
        double distFromKnight = Math.abs(knight.getX() - getX());
        
        if (distFromKnight <= Settings.aggroDist && !isTouching(Knight.class)){ 
            if (knight.getX() > getX()){
                move((int) Settings.enemySpeed);
                faceRight();
            }
            else if (knight.getX() < getX()){
                move((int) -Settings.enemySpeed);
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
            Parry attack = new Parry();
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
            getWorld().removeObject(enemyHpBar);
            getWorld().removeObject(this);
        }
    }
    
    public void drawHp(){
        getWorld().addObject(enemyHpBar, 0, 0);
        enemyHpBar.setSize(hp);
        enemyHpBar.setPosX(getX());
        enemyHpBar.setPosY(enemyTopY);
    }
}
