import java.util.Random;

public class mission_4 {
    public static void main(String[] args) {
        // Создаем босса
        Boss boss = new Boss(1000, 50);

        // Создаем игроков
        Player[] players = {
                new Warrior("Warrior", 200, 30),
                new Mage("Mage", 150, 40),
                new Archer("Archer", 120, 50),
                new Medic("Medic", 100),
                new Golem("Golem", 300, 10),
                new Lucky("Lucky", 130, 30),
                new Berserk("Berserk", 180, 25),
                new Thor("Thor", 160, 35)
        };

        // Запускаем игру
        int round = 1;
        Random random = new Random();
        while (boss.getHealth() > 0 && arePlayersAlive(players)) {
            System.out.println("===== Раунд " + round + " =====");

            if (boss.isStunned()) {
                System.out.println("Босс оглушен на этот раунд!");
            } else {
                boss.attack(players);
            }


            for (Player player : players) {
                if (player.getHealth() > 0) {
                    player.attack(boss);
                }
            }

            // Medic лечит игроков
            ((Medic) players[3]).heal(players);

            // Проверяем, оглушил ли Thor босса
            if (random.nextBoolean() && !boss.isStunned()) {
                System.out.println("Thor оглушил босса на следующий раунд!");
                boss.setStunned(true);
            } else {
                boss.setStunned(false);
            }

            // Выводим информацию о состоянии босса и игроков
            displayHealthInfo(boss, players);

            round++;
        }

        if (boss.getHealth() <= 0) {
            System.out.println("Босс побежден!");
        } else {
            System.out.println("Все игроки побеждены!");
        }
    }
    private static void displayHealthInfo(Boss boss, Player[] players) {
        System.out.println("Здоровье босса: " + boss.getHealth() + " HP");
        for (Player player : players) {
            System.out.println(player.getName() + ": " + player.getHealth() + " HP");
        }
    }
    private static boolean arePlayersAlive(Player[] players) {
        for (Player player : players) {
            if (player.getHealth() > 0) {
                return true;
            }
        }
        return false;
    }
}

class Player {
    private String name;
    private int health;
    private int attackDamage;

    public Player(String name, int health, int attackDamage) {
        this.name = name;
        this.health = health;
        this.attackDamage = attackDamage;
    }
    protected boolean isTakingFullDamage = true; // По умолчанию, все персонажи получают полный урон.

    public boolean isTakingFullDamage() {
        return isTakingFullDamage;
    }
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }
    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(getName() + " получает урон: " + damage + " HP");
    }


    public void attack(Boss boss) {
        boss.takeDamage(attackDamage);
        System.out.println(getName() + " наносит урон боссу: " + attackDamage + " HP");
    }

    public void setHealth   (int health) {
        this.health = health;
    }
}

class Warrior extends Player {
    public Warrior(String name, int health, int attackDamage) {
        super(name, health, attackDamage);
    }
}
class Golem extends Player {
    public Golem(String name, int health, int attackDamage) {
        super(name, health, attackDamage);
        this.isTakingFullDamage = false; // Golem не получает полный урон.
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage);
        int sharedDamage = damage / 5;
        setHealth(getHealth() + sharedDamage); // Уменьшаем урон Golem на sharedDamage
    }
}
class Lucky extends Player {
    private Random random = new Random();

    public Lucky(String name, int health, int attackDamage) {
        super(name, health, attackDamage);
    }

    @Override
    public void takeDamage(int damage) {
        if (random.nextBoolean()) { // 50% шанс уклонения
            System.out.println(getName() + " увернулся от удара!");
        } else {
            super.takeDamage(damage);
        }
    }
}
class Berserk extends Player {
    public Berserk(String name, int health, int attackDamage) {
        super(name, health, attackDamage);
    }

    @Override
    public void takeDamage(int damage) {
        int reducedDamage = damage / 2; // блокирование половины урона
        super.takeDamage(reducedDamage);
        int returnedDamage = reducedDamage; // возвращаем блокированный урон
        setAttackDamage(getAttackDamage() + returnedDamage);
    }
}
class Thor extends Player {
    private Random random = new Random();

    public Thor(String name, int health, int attackDamage) {
        super(name, health, attackDamage);
    }

    @Override
    public void attack(Boss boss) {
        super.attack(boss);
        if (random.nextBoolean()) {
            boss.setStunned(true);
            System.out.println(getName() + " оглушил босса на следующий раунд!");
        }
    }
}
class Mage extends Player {
    public Mage(String name, int health, int attackDamage) {
        super(name, health, attackDamage);
    }
}

class Archer extends Player {
    public Archer(String name, int health, int attackDamage) {
        super(name, health, attackDamage);
    }
}

class Medic extends Player {
    public Medic(String name, int health) {
        super(name, health, 0);
    }

    public void heal(Player[] players) {
        if (getHealth() > 0) {
            for (Player player : players) {
                if (player != this && player.getHealth() < 100 && player.getHealth() > 0) {
                    int N = 20;
                    player.setHealth(player.getHealth() + N);
                    System.out.println(getName() + " исцеляет " + player.getName() + " на " + N + " единиц здоровья.");
                }
            }
        }
    }
}

class Boss {
    private int health;
    private int attackDamage;
    private boolean isStunned;

    public Boss(int health, int attackDamage) {
        this.health = health;
        this.attackDamage = attackDamage;
        this.isStunned = false;
    }

    public int getHealth() {
        return health;
    }

    public void setStunned(boolean stunned) {
        isStunned = stunned;
    }
    public boolean isStunned() {
        return isStunned;
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println("Босс получает урон: " + damage + " HP");
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void attack(Player[] players) {
        Random random = new Random();
        int damage = getAttackDamage();

        if (random.nextDouble() < 1.0) {  // Шанс 30% атаковать всех игроков
            for (Player player : players) {
                if (player.getHealth() > 0) {
                    if (!player.isTakingFullDamage() && player instanceof Golem) {
                        player.takeDamage(damage);
                    } else {
                        player.takeDamage(damage);
                    }
                }
            }
        } else {
            int randomIndex;
            do {
                randomIndex = random.nextInt(players.length);
            } while (players[randomIndex].getHealth() <= 0); // Выбираем случайного живого игрока

            Player targetPlayer = players[randomIndex];
            targetPlayer.takeDamage(damage);
        }
    }

}
