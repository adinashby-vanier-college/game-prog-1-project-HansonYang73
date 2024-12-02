import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Coin extends Actor
{
    public void delete(){
        setLocation(getX()+20, getY());
        Price price = (Price) getOneIntersectingObject(Price.class);
        getWorld().removeObject(price);
        getWorld().removeObject(this);
    }
    
}
