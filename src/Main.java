public class Main {
    public static void printSeparator() {
        System.out.println("-------------------------------");
    }
    public static void main(String[] args) {
        Transport car = new Car("VAZ", 4);
        Transport car2 = new Car("AUDI", 4);

        Transport truck = new Truck("SCANIA", 8);
        Transport truck2 = new Truck("ISUZU", 8);

        Transport bicycle = new Bicycle("FORWARD", 2);
        Transport bicycle2 = new Bicycle("DEWOLF", 2);

        ServiceStation station = new ServiceStation();
        station.check(car);
        printSeparator();
        station.check(car2);
        printSeparator();
        station.check(bicycle);
        printSeparator();
        station.check(bicycle2);
        printSeparator();
        station.check(truck);
        printSeparator();
        station.check(truck2);
    }
}