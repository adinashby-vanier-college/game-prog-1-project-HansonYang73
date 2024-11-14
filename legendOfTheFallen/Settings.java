import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * Write a description of class Settings here.
 */
public class Settings
{
    /* Instance variables - replace the example below with your own*/
    static double gravity = 2;
    static double ySpeed = 0.2;
    
    static long dashCD = 1000; // 1000 milisecond (1 sec)
    static int dashDist = 100;
    static int jumps = 1;
    
    // Knight Setting
    static GifImage knightGif =  new  GifImage("knight_walking.gif");
    static int knightWidth = knightGif.getImages().get(0).getWidth();
    static int knightHeight = knightGif.getImages().get(0).getHeight();
    static double baseDMG = 20;
    
    // Enemy Settings
    static double enemyBaseDMG = 20;
    static double enemySpeed = 1;
    
    // Zombie Settings
    static GreenfootImage zombieImage = new GreenfootImage("zombie.png");
    static int zombieWidth = zombieImage.getWidth();
    static int zombieHeight = zombieImage.getHeight();
    static double zombieHP = 100;
    static double zombieDMGMult = 1;
    

    /**
     * Constructor for objects of class Settings
     */
    public Settings()
    {
    }
}
