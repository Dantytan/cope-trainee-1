package Abstract_Factory;


import Abstract_Factory.Pizza.Pizza;
import org.junit.Test;

public class GourmetPizzaFactoryTest {
    @Test
    public void testCreatePizza() throws Exception {
        BasePizzaFactory pizzaFactory=new GourmetPizzaFactory();
        Pizza cheesePizza= pizzaFactory.createPizza("cheese");
        Pizza veggiePizza=pizzaFactory.createPizza("veggie");
    }
}
