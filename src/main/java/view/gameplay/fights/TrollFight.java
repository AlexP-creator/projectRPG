package view.gameplay.fights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import view.Scanner.Colors;
import view.characters.Wizard;
import view.ennemies.Enemy;
import view.ennemies.EnemyList;
import view.spells.Spell;
import view.spells.PlayerSpell;
import view.userinterfaces.Text;
import java.util.Scanner;
import static view.userinterfaces.Cli.*;

    public class TrollFight {


        public static int startFight(Wizard wizard, PlayerSpell[] playerSpells) {
            scanner = new Scanner(System.in);
            Enemy enemy = EnemyList.TROLL.getEnemy();
            Text.askText(49);
            while (wizard.isAlive()) {
                Text.askText(33);
                Text.askText(34, Colors.BLACK);
                Text.askText(35, Colors.PURPLE);
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        Text.askText(37);
                        wizard.takeDamage(enemy.getDamage(), enemy);
                        break;
                    case 2:
                        SpellChoice(playerSpells);

                        int spellIndex = 1;
                        for (PlayerSpell spell : playerSpells) {
                            if (!spell.isLocked()) {
                                spellIndex++;
                            }
                        }
                        int spellChoice = scanner.nextInt();
                        while (spellChoice < 1 || spellChoice >= spellIndex) {
                            Text.askText(39);
                            spellChoice = scanner.nextInt();
                        }
                        PlayerSpell chosenSpell = playerSpells[spellChoice - 1];
                        Spell spell = new Spell();
                        if (spell.isSuccess(wizard, chosenSpell)) {
                            Text.askText(41);
                            int modifiedDamage = spell.getModifiedDamage(wizard, chosenSpell);
                            enemy.setHealth(enemy.getHealth() - modifiedDamage); System.out.println("Vous avez fait " + modifiedDamage + " de dégâts.");

                        } else {
                            Text.askText(42);
                            wizard.takeDamage(enemy.getDamage(), enemy);
                        }
                        break;
                    default:
                        break;
                }
                if (enemy.getHealth() <= 0) {
                    enemyDefeated(enemy.getName());
                    return 1;
                }
            }

            return 0;
        }
    }
