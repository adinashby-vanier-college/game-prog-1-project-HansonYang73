import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Shop extends TemplateWorld
{

    /**
     * Constructor for objects of class Shop.
     */
    public Shop()
    {
        super();
        prepare();
    }
    
    public void act(){
        
    }
    
    public void prepare(){

        Coin coin = new Coin();
        addObject(coin,273,26);
        Coin coin2 = new Coin();
        addObject(coin2,374,27);
        Coin coin3 = new Coin();
        addObject(coin3,478,24);
        Coin coin4 = new Coin();
        addObject(coin4,570,30);
        Coin coin5 = new Coin();
        addObject(coin5,673,27);
        Image image = new Image("potion.png");
        addObject(image,732,237);
        removeObject(image);
        addObject(image,204,329);
        image.setLocation(222,375);
        Image image2 = new Image("ancient_pizza.png");
        addObject(image2,331,371);
        image2.setLocation(378,380);
        image.setLocation(276,377);
        image2.setLocation(466,382);
        Image image3 = new Image("blood_talisman.png");
        addObject(image3,665,372);
        image3.setLocation(676,378);
    }
}
