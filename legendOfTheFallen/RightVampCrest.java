import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class RightVampCrest extends Artifact
{

    public void getArtifact(){
        Settings.regen++;
        getWorld().removeObject(this);
    }
}
