import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class LeftVampCrest extends Artifact
{

    
    public void getArtifact(){
        scaleImage();
        Settings.lifesteal += 3;
        getWorld().removeObject(this);
    }
}
