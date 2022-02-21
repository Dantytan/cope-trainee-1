package Abstract_Factory;

import Abstract_Factory.Products.CaliforniaOilSauce;
import Abstract_Factory.Products.Cheese;
import Abstract_Factory.Products.GoatCheese;
import Abstract_Factory.Products.Sauce;

public class GourmetToppingFactory extends BaseToppingFactory{
    @Override
    public Cheese createCheese(){return new GoatCheese();}
    @Override
    public Sauce createSauce(){return new CaliforniaOilSauce();}
}
