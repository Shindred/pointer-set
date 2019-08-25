import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class CarManager {
    Set<Car> carSet = new LinkedHashSet<>();
    private Scanner scan = new Scanner(System.in);

    public void createCar(String name, Engine engine, Body body, SteeringWheel steeringWheel, Wheel wheels, Tank tank) {
        carSet.add(new Car(name, engine, body, steeringWheel, wheels, tank));
    }

    public void createDefaultCar() {
        carSet.add(new Car());
    }

    public void printAllCarNames() {
        for (Car car : carSet) {
            System.out.println(car.getName());
        }
    }

    public void changeWheelsTypeByBodyTypeAndColor() {
        System.out.println("input body type");
        BodyTypes bodyType = BodyTypes.toEnum(scan.next());
        System.out.println("input wheels diameter");
        int diameter = scan.nextInt();
        for (Car car : carSet) {
            if (car.getBody().getType() == bodyType && car.getWheels().getDiameter() == diameter) {
                System.out.println("Input wheel type you want:");
                WheelTypes inputWheelsType = WheelTypes.toEnum(scan.next());
                    car.getWheels().setType(inputWheelsType);
                }
            }
        }

    public void removeCarsInAGivenDiameterRange() {
        System.out.println("Input start of a range");
        int rangeStart = scan.nextInt();
        System.out.println("Input end of a range");
        int rangeEnd = scan.nextInt();
        Iterator<Car> iterator = carSet.iterator();
        while (iterator.hasNext()){
            Car currentCar = iterator.next();
            boolean diameterIsInRange = currentCar.getWheels().getDiameter() > rangeStart && currentCar.getWheels().getDiameter() < rangeEnd;
            if (diameterIsInRange) {
                System.out.println(currentCar.getName() + " removed");
                iterator.remove();
            }
        }
    }
    public void findCarsWithInputWheelsTypeInAGivenDiameterRange(){
        System.out.println("Input start of a range");
        int rangeStart = scan.nextInt();
        System.out.println("Input end of a range");
        int rangeEnd = scan.nextInt();
        System.out.println("Input wheels type (winter or common)");
        WheelTypes inputWheels8Type = WheelTypes.toEnum(scan.next());
        for (Car car : carSet){
            boolean diameterIsInRange = car.getWheels().getDiameter() > rangeStart && car.getWheels().getDiameter() < rangeEnd;
            if (diameterIsInRange){
                if (inputWheels8Type == car.getWheels().getType()) {
                    System.out.println(car.getName());
                }
            }
        }
    }
}
