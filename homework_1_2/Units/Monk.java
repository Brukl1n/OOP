package OOP.homework_1_2.Units;

public class Monk extends Magican {

    public Monk(String name) {
        super(name, 20, 0.6f, 1, 2, 20, 5, 1, 10, 50);
    }

    @Override
    public String toString() {
        return "Монах";
    }



    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }

}