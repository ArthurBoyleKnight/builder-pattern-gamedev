public class CharacterTextBuilder implements CharacterBuilder {
    private String name;
    private String jobClass;
    private int health;

    public CharacterTextBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CharacterTextBuilder setJobClass(String jobClass) {
        this.jobClass = jobClass;
        return this;
    }

    public CharacterTextBuilder setHealth(int health) {
        this.health = health;
        return this;
    }

    public String getResult() {
        return "=== CHARACTER INFO ===\n" +
               "Name:  " + name + "\n" +
               "Class: " + jobClass + "\n" +
               "HP:    " + health;
    }
}