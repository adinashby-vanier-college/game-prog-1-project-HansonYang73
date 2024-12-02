import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Demon extends Enemy
{
    public Demon(){
        super(Settings.demonHP, Settings.demonMaxHp, Settings.demonSpeed, 
        Settings.demonAtk, Settings.demonCoinAmt, "FinalDemonBoss.gif", 
        "WolfAttack.gif", new GreenfootSound("wolf_attack.mp3"));
    }
    /**
     * Act - do whatever the Demon wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    }
}
