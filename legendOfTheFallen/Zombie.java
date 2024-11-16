import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Zombie extends Enemy
{
    protected SimpleTimer atkTimer = new SimpleTimer();
    
    public Zombie(){
        super(Settings.zombieHP);
        getImage().scale(Settings.zombieWidth/5, Settings.zombieHeight/5);
    }
    
    /**
     * Act - do whatever the Zombie wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        enemyBottomY = getY() + Settings.zombieHeight/5 / 2;
        enemyTopY = getY() - Settings.zombieHeight/5 / 2 - 10;
        
        drawHp();
        gravity(enemyBottomY);
        
        if (!isStun){
            moveToKnight();
            if (isAtkDist()){
            createAtk(atkTimer);
            }
        }
        
        if (stunTimer.millisElapsed() >= Settings.stunTime){
            unstun();
        }
    
        checkDed();
    }

    
    
   
}
