package factory.driller;

public class DrillingHead implements IDrillingHead{
    private String manufacturer;
    private String type;
    private String id;

    public DrillingHead(String manufacturer, String type, String id) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
    }

    @Override
    public void start() {
        System.out.println("Start Machine");
    }

    @Override
    public void stop() {
        System.out.println("Stop Machine");
    }

    @Override
    public void rotateLeft() {
        System.out.println("RotateLeft");
    }

    @Override
    public void rotateRight() {
        System.out.println("RotateRight");
    }
}
