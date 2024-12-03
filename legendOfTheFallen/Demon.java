import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Demon extends Enemy
{
    private int stunTimes = 0;
    private boolean phase2 = false;
    
    public Demon(){
        super(Settings.demonHP, Settings.demonMaxHp, Settings.demonSpeed, 
        Settings.demonAtk, Settings.demonCoinAmt, "FinalDemonBoss.gif", 
        "DemonBossAttack.gif", new GreenfootSound("boss_attack.mp3"));
        atkTimer = new SimpleTimer();
    }
    
    public void act()
    {
        enemyBottomY = getY() + Settings.demonHeight / 2;
        enemyTopY = getY() - Settings.demonHeight / 2 - 10;
        
        if (!phase2 && hp <= 1000){
            speed = 2;
            atk = 35;
            Settings.baseEnemyAtkCD = 1000;
        }
        if (!isStun){
            moveToKnight();
            if (isAtkDist() && atkTimer.millisElapsed() >= Settings.baseEnemyAtkCD){
                atkTimer.mark();
                createAtk();
            }
        }
        
        drawHp();
        gravity(enemyBottomY);
        
        if (stunTimer.millisElapsed() >= Settings.stunTime){
            unstun();
            Actor dizzy = getOneIntersectingObject(Dizzy.class);
            if (dizzy != null){
                getWorld().removeObject(dizzy);
            }
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
        
        if (distFromKnight <= 800){ 
            if (knight.getX() > getX() && distFromKnight > 170){
                isMoving = true;
                move(speed);
                faceRight();
            }
            else if (knight.getX() < getX() && distFromKnight > 170){
                setImage(gif.getCurrentImage());
                isMoving = true;
                move(-speed);
                faceLeft();
            }
            
            if (knight.getX() > getX()){
                faceRight();
            }
            else{
                faceLeft();
            }
        }
        
        
    }
    
    public boolean isAtkDist(){
        Knight knight = getWorld().getObjects(Knight.class).get(0);
        double distFromKnight = Math.abs(knight.getX() - getX());
        
        if (distFromKnight <= 180 && knight.getY() > 300){
            return true;
        }
        return false;
    }
    
    public void createAtk(){
        attackSound.play();
        BossParry attack = new BossParry(this);
        getWorld().addObject(attack, getX() + (40 * isFacingRight), 375);   
        changeAttackGif();
        isAttacking = true;
        
    }
    
    public void stun(){
        stunTimes++;
        if (stunTimes == 3){
            stunTimes = 0;
            stunTimer.mark();
            isStun = true;
            getWorld().addObject(new Dizzy(), getX() + 5, (int) enemyTopY + 15);
        }
    }
}
