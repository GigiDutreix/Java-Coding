

class Monster {
    private String name;
    private int health;
    private int strength;
    private int xp;

    // Constructor for Monster
    public Monster(String name, int health, int strength, int xp) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.xp = xp;
    }

    // Monster Getters
    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public int getStrength() {
        return this.strength;
    }

    public int getXP() {
        return this.xp;
    }

    // Method for monster taking damage
    public void takeDamage(int damage) {
        if (damage > 0) {
            this.health -= damage;
            if (this.health < 0) {
                this.health = 0;
            }
        }
    }

    // Method for monster attacking a MonsterFactory instance
    // (Assuming MonsterFactory represents the entity being attacked, like the player)
    public void attack(MonsterFactory target) {
        if (target != null) {
             System.out.printf("%s attacks %s for %d damage\n", this.name, target.getName(), this.strength);
             target.takeDamage(this.strength); // Target (MonsterFactory) takes damage
        }
    }

    // toString for Monster representation
    public String toString() {
        return String.format("[%s] HP: %d, STR: %d",
                             this.name, this.health, this.strength);
    }
} // End of non-public Monster class


// Public MonsterFactory class
public class MonsterFactory {
    // Attributes previously from Player/Hero, representing the entity
    // that might be attacked or interacts with Monsters.
    private int health;
    private String name;

    // Constructor for MonsterFactory (as the entity)
    public MonsterFactory(String name, int initialHealth) {
        this.name = name;
        this.health = initialHealth;
        if (this.health < 0) {
             this.health = 0;
        }
    }

    // Default constructor
    public MonsterFactory() {
       this.name = "Player"; // Default name makes more sense if it's the player entity
       this.health = 100;
    }

    // Method for this entity (MonsterFactory/Player) taking damage
    public void takeDamage(int damage) {
        if (damage > 0) {
            this.health -= damage;
            if (this.health < 0) {
                this.health = 0;
            }
        }
    }

    // Getter for health
    public int getHealth() {
        return this.health;
    }

    // Getter for name
    public String getName() {
        return this.name;
    }

     // toString for MonsterFactory representation (as the entity)
     public String toString(){
         return String.format("[%s] HP: %d", this.name, this.health);
     }

    // Static factory method to create *Monster* objects
    // Now belongs to the MonsterFactory class
    public static Monster spawn(String type) {
        if (type == null) {
            return null;
        }

        if (type.equalsIgnoreCase("goblin")) {
            // Calls the Monster constructor
            return new Monster("goblin", 60, 8, 1);
        } else if (type.equalsIgnoreCase("orc")) {
            return new Monster("orc", 100, 12, 3);
        } else if (type.equalsIgnoreCase("troll")) {
            return new Monster("troll", 150, 15, 5);
        } else {
            return null;
        }
    }

} 