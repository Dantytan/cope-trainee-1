package Abstract_Factory;

import Abstract_Factory.Products.Cheese;
import Abstract_Factory.Products.MozzarellaCheese;
import Abstract_Factory.Products.Sauce;
import Abstract_Factory.Products.TomatoSauce;

public class SicillianToppingFactory extends BaseToppingFactory{
    @Override
    public Cheese createCheese(){return new MozzarellaCheese();}
    @Override
    public Sauce createSauce(){return new TomatoSauce();}
}
