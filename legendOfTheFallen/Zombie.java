import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Zombie extends Enemy
{
    
    public Zombie(){
        super(Settings.zombieHP, Settings.zombieMaxHp, Settings.zombieSpeed, 
        Settings.zombieAtk, Settings.zombieCoinAmt, "zombie_walking.gif", 
        "ZombieAttack.gif", new GreenfootSound("zombie_attack.mp3"));
            
        atkTimer = new SimpleTimer();
    }
    
    /**
     * Act - do whatever the Zombie wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        enemyBottomY = getY() + Settings.zombieHeight / 2;
        enemyTopY = getY() - Settings.zombieHeight / 2 - 10;
        
        if (!isStun){
            moveToKnight();
            if (isAtkDist()){
            createAtk();
            }
        }
        
        super.act();
    }

    
    
   
}
