package OOP.homework_1_2.Units;

public class Peasant extends Unit {
    public Peasant(String name) {
        super(name, 10, 0.5f, 1, 1, 0);
    }

    @Override
    public String toString() {
        return "Крестьянин";
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }

}