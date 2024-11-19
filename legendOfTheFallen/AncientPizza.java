import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class AncientPizza extends Artifact
{

    public void getArtifact(){
        scaleImage();
        Knight knight = (Knight) getOneIntersectingObject(Knight.class);
        Settings.knightMaxHp += 50;
        knight.heal((int) Settings.knightMaxHp);
        getWorld().removeObject(this);
    }
}
