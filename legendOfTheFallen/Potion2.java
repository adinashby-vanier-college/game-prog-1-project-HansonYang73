import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Potion2 extends Artifact
{

    public void getArtifact(){
        scaleImage();
        Settings.potionAmount += 2;
        getWorld().removeObject(this);
    }
}
