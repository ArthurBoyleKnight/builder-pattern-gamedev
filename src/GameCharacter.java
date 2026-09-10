public class GameCharacter {
    private final String name;
    private final String jobClass;
    private final int health;

    GameCharacter(String name, String jobClass, int health) {
        this.name = name;
        this.jobClass = jobClass;
        this.health = health;
    }

    public String getName() { return name; }
    public String getJobClass() { return jobClass; }
    public int getHealth() { return health; }

    @Override
    public String toString() {
        return "Character: " + name + " | Class: " + jobClass + " | HP: " + health;
    }
}