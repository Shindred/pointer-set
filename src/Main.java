import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Engine mazdaEngine = new Engine(50);
        Engine chevroletEngine = new Engine(20);
        Engine fordEngine = new Engine(80);
        Engine audiEngine = new Engine(40);
        Body blackBody = new Body(Colors.BLACK, BodyTypes.SEDAN);
        Body yellowBody = new Body(Colors.YELLOW, BodyTypes.COUPE);
        Body whiteBody = new Body(Colors.WHITE, BodyTypes.SUV);
        Body violetBody = new Body(Colors.VIOLET, BodyTypes.CONVERTIBLE);
        SteeringWheel commonSteeringWheel = new SteeringWheel(true);
        SteeringWheel multifunctionedSteeringWheel = new SteeringWheel( true);
        Wheel mazdaWheels = new Wheel(16);
        Wheel chevroletWheels = new Wheel(13, WheelTypes.WINTER);
        Wheel fordWheels = new Wheel(14, WheelTypes.COMMON);
        Wheel audiWheels = new Wheel(16, WheelTypes.WINTER);
        Tank mazdaTank = new Tank(100);
        Tank chevroletTank = new Tank(259);
        Tank fordTank = new Tank(150);
        Tank audiTank = new Tank(120);
        CarManager carManager = new CarManager();
        carManager.createCar("Mazda", mazdaEngine, blackBody, multifunctionedSteeringWheel, mazdaWheels, mazdaTank);
        carManager.createCar("Chevrolet", chevroletEngine, yellowBody, multifunctionedSteeringWheel, chevroletWheels, chevroletTank);
        carManager.createCar("Ford", fordEngine, whiteBody, commonSteeringWheel, fordWheels, fordTank);
        carManager.createCar("Audi", audiEngine, violetBody, commonSteeringWheel, audiWheels, audiTank);
        carManager.createDefaultCar();
        carManager.printAllCarNames();
        carManager.removeCarsInAGivenDiameterRange();
    }
}