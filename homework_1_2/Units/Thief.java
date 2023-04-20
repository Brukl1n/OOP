package OOP.homework_1_2.Units;

public class Thief extends Unit {

    public Thief(String name) {
        super(name, 20, 0.8f, 3, 2, 10);
    }

    @Override
    public String toString() {
        return "Разбойник";
    }

    void dodge() {

    }

    void stealth() {

    }

    @Override
    public void step() {
        
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }
}