public class Car extends MotorTransport {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Поднимаем машину " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем " + i + " покрышку!");
        }
        System.out.println("Опускаем машину");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void service() {
        updateTyre();
        checkEngine();
    }
}