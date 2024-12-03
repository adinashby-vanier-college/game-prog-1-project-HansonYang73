import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Werewolf extends Enemy
{
    public Werewolf(){
        super(Settings.werewolfHP, Settings.werewolfMaxHp, Settings.werewolfSpeed, 
        Settings.werewolfAtk, Settings.werewolfCoinAmt, "WolfWalking.gif", 
        "WolfAttack.gif", new GreenfootSound("wolf_attack.mp3"));
        atkTimer = new SimpleTimer();
    }
    
    public void act()
    {
        enemyBottomY = getY() + Settings.werewolfHeight / 2;
        enemyTopY = getY() - Settings.werewolfHeight / 2 - 10;
        
        if (!isStun){
            moveToKnight();
            if (isAtkDist() && atkTimer.millisElapsed() >= Settings.baseEnemyAtkCD){
                atkTimer.mark();
                createAtk();
            }
        }
        
        super.act();
    }
}
