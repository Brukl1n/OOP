package OOP.homework_1_2.Units;

public abstract class Unit implements GameInterface{
    protected String name;
    protected float maxHp, currentHp, luck, armor;
    protected int speed, attack;

    Unit(String name, float maxHp, float luck, int speed, int attack, float armor){
        this.name = name;
        this.maxHp = maxHp;
        this.currentHp = maxHp;
        this.luck = luck;
        this.speed =speed;
        this.attack = attack;
        this.armor = armor;
    }

    void attack(){

    }
    void await(){

    }
    void defend(){

    }

    void die(){

    }

    @Override
    public String getInfo() {
        return "[" + name + " " + toString() + "] hp:" + 
        currentHp + "/" + maxHp + " luck:" + luck 
        + " speed:" + speed + " attack:" + attack
        + " armor:" + armor;
    }

}