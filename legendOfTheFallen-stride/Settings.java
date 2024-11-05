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
    
    static long dashCD = 0;
    static int jumps = 1;
    
    // Knight Setting
    static GifImage knightGif =  new  GifImage("knight_walking.gif");
    static double knightWidth = knightGif.getImages().get(0).getWidth();
    static double knightHeight = knightGif.getImages().get(0).getHeight();
    

    /**
     * Constructor for objects of class Settings
     */
    public Settings()
    {
    }
}
