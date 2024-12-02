import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Potion2 extends Artifact
{

    public void getArtifact(){
        Settings.potionAmount += 2;
        getWorld().removeObject(this);
    }
}
