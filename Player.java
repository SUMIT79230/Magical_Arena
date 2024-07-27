import java.util.Random;

class Player {
    private int health;
    private int strength;
    private int attack;
    private String name;
    private Random random;
    
    public Player(int health, int strength, int attack, String name) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
        this.name = name;
        this.random = new Random();
    }

    public int getHealth() {
        return health;
    }
    
    public String getName() {
        return name;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void receiveDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }
 
    public int rollDice() {
        int diceValue = random.nextInt(6) + 1;
        System.out.println(this.getName() + ": Rolling dice; Got dice value of " + diceValue);
        return diceValue;
    }

    public int calculateAttackDamage() {
        int diceValue = rollDice();
        int attackValue = attack * diceValue;
        System.out.println(this.getName() + ": Attack Value: " + attackValue);
        return attackValue;
    }

    public int calculateDefendStrength() {
        int diceValue = rollDice();
        int defendValue = strength * diceValue;
        System.out.println(this.getName() + ": Defend Value: " + defendValue);
        return defendValue;
    }
}
