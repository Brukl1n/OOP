package OOP.homework_1_2.Units;

public abstract class Magican extends Shooter {
    protected float maxMana, currentMana;

    Magican(String name, float maxHp, float luck, int speed, int damage,
            int distance, int maxCountBullet, float accuracy, float armor, float maxMana) {
        super(name, maxHp, luck, speed, damage, distance, maxCountBullet, accuracy, armor);
        this.maxMana = maxMana;
        this.currentMana = maxMana;
    }

    void heal() {

    }

    void fire() {

    }

    void freeze() {

    }

    void addMana() {

    }

    @Override
    public String getInfo() {
        return super.getInfo() + " mana:" + currentMana + "/" + maxMana;
    }
}