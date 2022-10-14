package kg.charginov.depinversion.A.task6;

public class Builder implements BuildBuilding, Worker{

    @Override
    public void work(isCome building) {
        System.out.println("Строитель строит здание: " + building);
    }

}
