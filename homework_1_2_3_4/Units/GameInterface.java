package OOP.homework_1_2_3_4.Units;

import java.util.ArrayList;

public interface GameInterface {
    void step(ArrayList<Unit> enemy);

    String getInfo();

    String introduce();
}