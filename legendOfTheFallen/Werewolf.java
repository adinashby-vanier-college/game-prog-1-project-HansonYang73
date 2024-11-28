import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Werewolf extends Enemy
{
    protected SimpleTimer atkTimer = new SimpleTimer();
    
    public Werewolf(){
        super(Settings.werewolfHP, Settings.werewolfMaxHp, Settings.werewolfSpeed, Settings.werewolfAtk, Settings.werewolfCoinAmt);
    }
    
    public void act()
    {
        enemyBottomY = getY() + Settings.werewolfHeight / 2;
        enemyTopY = getY() - Settings.werewolfHeight / 2 - 10;
        
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
