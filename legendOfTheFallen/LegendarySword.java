import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class LegendarySword extends Artifact
{
    private GifImage swordGif =  new  GifImage("LegendarySword.gif");
    
    public void act(){
        setImage(swordGif.getCurrentImage());
    }
    
    public void getArtifact(){
        if (Settings.legenSwordAmt > 0){
            Settings.legenSwordAmt--;
            Settings.baseAtk = 35;
            Settings.baseAtkCD = 500;
        }
        else{
            Settings.coins += 100;
        }
        getWorld().removeObject(this);
    }
}
