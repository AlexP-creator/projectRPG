package view.items;

import view.characters.Wizard;
import view.Scanner.Colors;
public class Potion {
    private String name;
    private int healthPoints;

    public Potion(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void usePotion(Wizard wizard, int choice) {
        if (wizard.getHouseName().equals(Colors.GRAY+ "Hufflepuff"+Colors.RESET)) {
            healthPoints += 10;
        }
        if (choice == 1) {
            wizard.health += healthPoints;
        }
    }
}
