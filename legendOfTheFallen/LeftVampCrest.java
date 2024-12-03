import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class LeftVampCrest extends Artifact
{

    
    public void getArtifact(){
        if (Settings.leftCrestAmt > 0){
            Settings.leftCrestAmt--;
            Settings.lifesteal += 3;
        }
        else{
            Settings.coins += 50;
        }
        
        getWorld().removeObject(this);
    }
}
