package Abstract_Factory;

import Abstract_Factory.Pizza.Pizza;

public abstract class BasePizzaFactory {

    public abstract Pizza createPizza(String type);
}