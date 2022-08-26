public class Truck extends Transport implements Wheelable, Engineable, Trailerable{


    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void checkWheels() {
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку грузовику");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовика");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп грузовика");
    }


    @Override
    public void service() {
        System.out.println("Обслуживаем грузовик" + getModelName());
        checkWheels();
        checkEngine();
        checkTrailer();
    }
}
