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
        getWorld().getObjects(Potion.class).get(0).amount += 2;
        getWorld().removeObject(this);
    }
}
