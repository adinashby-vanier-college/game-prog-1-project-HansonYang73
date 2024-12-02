import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class TitlePage extends TemplateWorld
{
    static GreenfootSound bgMusic = new GreenfootSound("TitlePage.mp3");

    /**
     * Constructor for objects of class TitlePage.
     */
    public TitlePage()
    {
        super(443, 443);
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        start1();
        PlayButton playButton = new PlayButton();
        addObject(playButton,221,309);
    }
    
    public void start1(){
        bgMusic.playLoop();
    }
    
    static void stop(){
        bgMusic.stop();
    }
}
