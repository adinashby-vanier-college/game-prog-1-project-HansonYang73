import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class ElixirStrength extends Artifact
{
    public void getArtifact(){
        Settings.knightAtkMult *= 1.5;
        getWorld().removeObject(this);
    }
}
