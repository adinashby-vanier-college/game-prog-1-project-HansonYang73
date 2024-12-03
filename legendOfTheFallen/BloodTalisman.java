import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class BloodTalisman extends Artifact
{

    public void getArtifact(){
        if (Settings.bloodTalismanAmt > 0){
            Settings.bloodTalismanAmt--;
            Settings.healAmount = (int) (Settings.knightMaxHp * 0.75);
        }
        else{
            Settings.coins += 50;
        }
        getWorld().removeObject(this);
    }
}
