
/**
 * MiniDuckSimulator
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallarDuck = new MallardDuck();
        mallarDuck.performFly();
        mallarDuck.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}