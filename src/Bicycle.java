public class Bicycle extends TransportWithWheels {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyre() {
        System.out.println("Велосипед " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем " + i + " покрышку!");
        }
    }
    @Override
    public void service() {
        updateTyre();
    }
}