package OOP.homework_1_2.Units;

public class Crossbowman extends Shooter {
    public Crossbowman(String name) {
        super(name, 20, 0.5f, 2, 2, 2, 50, 0.5f, 10);
    }

    @Override
    public String toString() {
        return "Арбалетчик";
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }

}
