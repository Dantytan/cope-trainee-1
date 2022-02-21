package Abstract_Factory;

import Abstract_Factory.Products.Cheese;
import Abstract_Factory.Products.Sauce;

public abstract class BaseToppingFactory {
    public abstract Cheese createCheese();
    public abstract Sauce createSauce();
}
