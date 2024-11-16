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
    static int atkTime = 200; // in millisecond
    static int enemyAtkTime = 2000; // in millisecond
    static int baseAtkCD = 400; // in millisecond
    static int baseEnemyAtkCD = 2000; // in millisecond
    
    // Knight Setting
    static GifImage knightGif =  new  GifImage("knight_walking.gif");
    static GreenfootImage knightFrame1 = knightGif.getImages().get(0);
    static int knightWidth = knightFrame1.getWidth();
    static int knightHeight = knightFrame1.getHeight();
    static double baseAtk = 20;
    static double baseAtkCd = 400; //in milisecond
    static long dashCD = 1000; // in milisecond
    static int dashDist = 100;
    static int jumps = 1;
    static double knightMaxHp = 100;
    
    // Enemy Settings
    static double enemyBaseAtk = 20;
    static double enemySpeed = 1;
    static double aggroDist = 400; // in cell-size
    static double atkDist = 100; // in cell-size
    
    // Zombie Settings
    static GreenfootImage zombieImage = new GreenfootImage("zombie.png");
    static int zombieWidth = zombieImage.getWidth();
    static int zombieHeight = zombieImage.getHeight();
    static double zombieHP = 100;
    static double zombieAtkMult = 1;
    
    // Potion Setting
    static GreenfootImage potionImage = new GreenfootImage("potion.png");
    static int potionWidth = potionImage.getWidth();
    static int potionHeight = potionImage.getHeight();
    static int healAmount = 50;
    static int healCd = 1000;
    
}
