import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class SplashScreen extends TemplateWorld
{
    private SimpleTimer threeSec = new SimpleTimer();
    /**
     * Constructor for objects of class SplashScreen.
     */
    public SplashScreen()
    {
        super();
        threeSec.mark();
    }
    
    public void act(){
        if (threeSec.millisElapsed() >= 3000){
            goNextWorld(new TitlePage());
        }
    }
}
