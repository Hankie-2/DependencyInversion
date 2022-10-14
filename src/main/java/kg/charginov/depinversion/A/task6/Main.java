package kg.charginov.depinversion.A.task6;

public class Main {
    public static void main(String[] args) {
        isCome building = new Theater("Театр им. Чаргинова Марселя","ул. Чаргинова",200);
        Worker builder = new Builder();
        builder.work(building);
    }
}
