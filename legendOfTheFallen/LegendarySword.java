import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class LegendarySword extends Artifact
{

    public void getArtifact(){
        Settings.baseAtk = 35;
        Settings.baseAtkCD = 333;
        getWorld().removeObject(this);
    }
}
