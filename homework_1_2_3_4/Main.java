package OOP.homework_1_2_3_4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

import OOP.homework_1_2_3_4.Units.Crossbowman;
import OOP.homework_1_2_3_4.Units.Monk;
import OOP.homework_1_2_3_4.Units.Names;
import OOP.homework_1_2_3_4.Units.Peasant;
import OOP.homework_1_2_3_4.Units.Sniper;
import OOP.homework_1_2_3_4.Units.Spearman;
import OOP.homework_1_2_3_4.Units.Thief;
import OOP.homework_1_2_3_4.Units.Unit;
import OOP.homework_1_2_3_4.Units.Wizard;

public class Main {
    public static void main(String[] args) {

        ArrayList<Unit> team1 = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    team1.add(new Peasant(getName(), team1, 1, i));
                    break;
                case 1:
                    team1.add(new Spearman(getName(), team1, 1, i));
                    break;
                case 2:
                    team1.add(new Crossbowman(getName(), team1, 1, i));
                    break;
                case 3:
                    team1.add(new Wizard(getName(), team1, 1, i));
                    break;
            }
        }

        
        ArrayList<Unit> team2 = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    team2.add(new Peasant(getName(), team2, 10, i));
                    break;
                case 1:
                    team2.add(new Thief(getName(), team2, 10, i));
                    break;
                case 2: 
                    team2.add(new Sniper(getName(), team2, 10, i));
                    break;
                case 3:
                    team2.add(new Monk(getName(), team2, 10, i));
                    break;
            }
        }

        ArrayList<Unit> team3 = new ArrayList<Unit>();
        team3.addAll(team1);
        team3.addAll(team2);
        team3.sort(new Comparator<Unit>() {

            @Override
            public int compare(Unit o1, Unit o2) {
                return o2.speed - o1.speed;
            }
            
        });

        team3.forEach(n -> n.getDmage(2));

        System.out.println("[Команда 1]");
        team1.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("\n[Команда 2]");
        team2.forEach(n -> System.out.println(n.getInfo()));

        System.out.println("\n[Инициатива]");
        System.out.println(team3);

        /*System.out.println("-".repeat(15));
        team3.forEach(n -> n.step(null));*/
        team1.forEach(n -> n.step(team2));
        team2.forEach(n -> n.step(team1));
        System.out.println("\n[Команда 1]");
        team1.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("\n[Команда 2]");
        team2.forEach(n -> System.out.println(n.getInfo()));
    }
    private static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }
}