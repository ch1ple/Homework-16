public abstract class MotorTransport extends TransportWithWheels {
    public MotorTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public abstract void checkEngine();
}
