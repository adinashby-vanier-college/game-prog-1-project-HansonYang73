import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class AncientPizza extends Artifact
{

    public void getArtifact(){
        Knight knight = (Knight) getWorld().getObjects(Knight.class).get(0);
        Settings.knightMaxHp += 50;
        knight.heal((int) Settings.knightMaxHp);
        getWorld().removeObject(this);
    }
}
