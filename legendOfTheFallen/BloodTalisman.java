import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class BloodTalisman extends Artifact
{

    public void getArtifact(){
        scaleImage();
        Settings.healAmount = (int) (Settings.knightMaxHp * 0.75);
        getWorld().removeObject(this);
    }
}
