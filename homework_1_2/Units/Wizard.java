package OOP.homework_1_2.Units;

public class Wizard extends Magican {

    public Wizard(String name) {
        super(name, 30, 0.7f, 2, 4, 5, 10, 1, 5, 50);
    }

    @Override
    public String toString() {
        return "Маг";
    }


    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }

}