import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Shop2 extends TemplateWorld
{

    /**
     * Constructor for objects of class Shop.
     */
    public Shop2(Knight knight)
    {
        super();
        this.knight = knight;
        prepare();
        createTorch();
    }
    
    public Shop2()
    {
        super();
        this.knight = new Knight();
        addObject(knight, 5, 5);
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
        Shield shield = new Shield();
        addObject(shield,801,378);
        Coin coin5 = new Coin();
        addObject(coin5,800,328);
        Price price4 = new Price(50);
        addObject(price4,844,338);
        price4.setLocation(847,338);
        image2.setLocation(423,376);
        coin3.setLocation(433,341);
        removeObject(image);
        removeObject(coin2);
        removeObject(price);
        removeObject(image3);
        removeObject(coin4);
        removeObject(price3);
        removeObject(coin5);
        removeObject(price4);
        removeObject(shield);
        removeObject(coin3);
        removeObject(price2);
        image2.setLocation(294,381);
        Image image4 = new Image("elixir_strength.png", new ElixirStrength(), 125);
        addObject(image4,454,373);
        Gif gif = new Gif("LegendarySword.gif", new LegendarySword(), 125);
        addObject(gif,596,375);
        StonePlatform stonePlatform = new StonePlatform(1, 1);
        addObject(stonePlatform,779,324);
        StonePlatform stonePlatform2 = new StonePlatform(1, 1);
        addObject(stonePlatform2,779,253);
        StonePlatform stonePlatform3 = new StonePlatform(1, 1);
        addObject(stonePlatform3,779,184);
        StonePlatform stonePlatform4 = new StonePlatform(1, 1);
        addObject(stonePlatform4,779,110);
    }
}
