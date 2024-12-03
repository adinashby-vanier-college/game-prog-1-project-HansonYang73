import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class RightVampCrest extends Artifact
{

    public void getArtifact(){
        if (Settings.rightCrestAmt > 0){
            Settings.rightCrestAmt--;
            Settings.regen++;
        }
        else{
            Settings.coins += 50;
        }
        getWorld().removeObject(this);
    }
}
