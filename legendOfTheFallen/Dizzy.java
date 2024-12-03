import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Dizzy extends Actor
{
    private GifImage stunGif =  new  GifImage("Stun.gif");
    public void act(){
        setImage(stunGif.getCurrentImage());
        if (getWorld().getObjects(Enemy.class).size() == 0){
            getWorld().removeObject(this);
        }
    }
}
