package view.ennemies;

public enum EnemyList {
    TROLL(new Enemy("Troll", 50, 40)),
    BASILISK(new Enemy("Basilisk", 50, 30)),
    DEMENTOR(new Enemy("Dementor", 150, 25)),

    PETER_PETEGROW(new Enemy("Peter Petegrow",200,40)),
    DOLORES_OMBRAGE(new Enemy("Dolores Ombrage",200,40)),
    DETAH_EATERS(new Enemy("Death Eaters",300,50)),

    VOLDEMORT(new Enemy("Voldemort",500,100));

    private Enemy enemy;

    EnemyList(Enemy enemy) {
        this.enemy = enemy;
    }

    public Enemy getEnemy() {
        return enemy;
    }
}
