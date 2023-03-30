package view.spells;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import view.Scanner.Colors;
import view.characters.Wizard;
import view.userinterfaces.Text;
import view.gameplay.Gameplay;


public class Spell {

    public boolean isSuccess(Wizard wizard, PlayerSpell playerSpell) {
        Random random = new Random();
        double randomNumber = random.nextDouble();
        double successRate = playerSpell.getSuccessRate();
        if (wizard.getHouseName().equals(Colors.BLUE+"Ravenclaw"+Colors.RESET)) {
            successRate *= 1.5;
        }
        return randomNumber <= successRate;
    }


        public int getModifiedDamage(Wizard wizard, PlayerSpell playerSpell) {
            int modifiedDamage = playerSpell.getDamage();
            if (wizard.getHouseName().equals(Colors.GREEN_2 + "SLYTHERIN" + Colors.RESET)) {
                modifiedDamage += 10;
            }

            modifiedDamage += (20 * Gameplay.Counter);

            return modifiedDamage;
        }
    }








