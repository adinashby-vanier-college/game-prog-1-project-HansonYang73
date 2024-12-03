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
    public Shop(Knight knight)
    {
        super();
        this.knight = knight;
        prepare();
    }
    
    public void act(){
        if (canGoNextWorld(knight)){
            goNextWorld(new World4(knight));
        }
    }
    
    public void prepare(){
        addObject(knight, 5, knight.getY());
        showPotion();
        showCoin();
        Image image = new Image("potion.png", new Potion2(), 20);
        addObject(image,204,329);
        image.setLocation(222,375);
        Image image2 = new Image("ancient_pizza.png", new AncientPizza(), 50);
        addObject(image2,331,371);
        image2.setLocation(378,380);
        image.setLocation(276,377);
        image2.setLocation(466,382);
        Image image3 = new Image("blood_talisman.png", new BloodTalisman(), 50);
        addObject(image3,665,372);
        image3.setLocation(676,378);
        image2.setLocation(474,380);
        image.setLocation(221,377);
        Price price = new Price(20);
        addObject(price,266,334);
        price.setLocation(277,336);
        image2.setLocation(432,369);
        Price price2 = new Price(50);
        addObject(price2,478,325);
        price2.setLocation(474,339);
        Price price3 = new Price(50);
        addObject(price3,673,332);
        price3.setLocation(675,334);
        image3.setLocation(627,379);
        image2.setLocation(427,373);
        Coin coin2 = new Coin();
        addObject(coin2,222,326);
        Coin coin3 = new Coin();
        addObject(coin3,425,326);
        Coin coin4 = new Coin();
        addObject(coin4,624,325);
    }
}
