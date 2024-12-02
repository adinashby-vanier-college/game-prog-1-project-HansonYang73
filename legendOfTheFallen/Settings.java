import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * Write a description of class Settings here.
 */
public class Settings
{
    // gravity
    static double gravity = 2;
    static double ySpeed = 0.2;
    
    // World Settings
    static int worldWidth = 1000;
    static int worldHeight = 400;
    
    // Attack & Parry Settings
    static int parryTime = 200; // in millisecond
    static int stunTime = 2000; //in ms
    static int atkTime = 200; // in millisecond
    static int enemyAtkTime = 200; // in millisecond
    static int baseAtkCD = 500; // in millisecond
    static int baseEnemyAtkCD = 2000; // in millisecond
    
    // Knight Setting
    static GifImage knightGif =  new GifImage("knight_walking_right.gif");
    static GreenfootImage knightFrame1 = knightGif.getImages().get(0);
    static int knightWidth = 70;
    static int knightHeight = 80;
    static int knightSpeed = 5;
    static double baseAtk = 20;
    static double knightAtkMult = 1;
    static long dashCD = 1000; // in milisecond
    static int dashDist = 100;
    static int jumps = 1;
    static double knightMaxHp = 100;
    static int coins = 0;
    
    // Enemy Settings
    static double aggroDist = 400; // in cell-size
    static double atkDist = 70; // in cell-size
    
    // Zombie Settings
    static GifImage zombieGif = new GifImage("zombie_walking.gif");
    static GreenfootImage zombieImage = zombieGif.getImages().get(0);
    static int zombieWidth = zombieImage.getWidth();
    static int zombieHeight = zombieImage.getHeight();
    static double zombieAtk = 20;
    static int zombieSpeed = 2;
    static int zombieMaxHp = 100;
    static double zombieHP = 100;
    static int zombieCoinAmt = 5;
    
    // Werewolf Settings
    static GifImage werewolfGif = new GifImage("WolfWalking.gif");
    static GreenfootImage werewolfImage = werewolfGif.getImages().get(0);
    static int werewolfWidth = werewolfImage.getWidth();
    static int werewolfHeight = werewolfImage.getHeight();
    static double werewolfAtk = 25;
    static int werewolfSpeed = 1;
    static int werewolfMaxHp = 140;
    static double werewolfHP = 140;
    static int werewolfCoinAmt = 10;
    
    // Potion Setting
    static GreenfootImage potionImage = new GreenfootImage("potion.png");
    static int potionWidth = potionImage.getWidth();
    static int potionHeight = potionImage.getHeight();
    static int healAmount = 50;
    static int healCd = 1000;
    static int potionAmount = 3;
    
    // Artifact Settings
    static int lifesteal = 0;
    static int regen = 0;
    
    static void reset(){
        baseAtkCD = 500; // in millisecond
        
        // Knight Setting
        knightGif =  new  GifImage("knight_walking_right.gif");
        knightFrame1 = knightGif.getImages().get(0);
        baseAtk = 20;
        knightAtkMult = 1;
        jumps = 1;
        knightMaxHp = 100;
        coins = 0;
        
        // Potion Setting
        healAmount = 50;
        potionAmount = 3;
        
        // Artifact Settings
        lifesteal = 0;
        regen = 0;
        
        
    }
}

